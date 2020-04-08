package com.ofs.sys.web.controller;

import com.ofs.sys.web.entity.SysResource;
import com.ofs.sys.web.service.SysResourceService;
import com.ofs.web.base.BaseController;
import com.ofs.web.base.BaseService;
import com.ofs.web.base.bean.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author gaoly
 * 菜单功能页面交互类
 */
@RestController
@Api(value = "资源", tags = {"资源服务接口"})
@RequestMapping("/system/resource")
public class ResourceController extends BaseController<SysResource> {

    @Autowired
    private SysResourceService service;

    @Override
    public BaseService<SysResource> getService() {
        return service;
    }

    @ApiOperation(value = "获取所有资源树 - 权限配置可用", httpMethod = "POST", produces = "application/json")
    @RequestMapping(value = "/getTree", method = RequestMethod.POST)
    public Result getTree(SysResource resource, HttpServletResponse response) {
        List<SysResource> data = service.getTree(resource);
        return Result.result(data);
    }

    @ApiOperation(value = "根据角色获取资源树-菜单可用", httpMethod = "POST", produces = "application/json")
    @RequestMapping(value = "/getTreeByRole", method = RequestMethod.POST)
    public Result getTreeByRole(String roleId, HttpServletResponse response) {
        List<SysResource> data = service.getTreeByRole(roleId);
        return Result.result(data);
    }

}
