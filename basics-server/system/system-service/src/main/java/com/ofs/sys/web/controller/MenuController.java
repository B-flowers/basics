package com.ofs.sys.web.controller;

import com.ofs.sys.web.entity.SysMenus;
import com.ofs.sys.web.service.SysMenusService;
import com.ofs.web.base.BaseController;
import com.ofs.web.base.BaseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author gaoly
 * @version 2019/4/22
 */
@RestController
@RequestMapping(value = "/system/menu")
@Api(value = "菜单管理", tags = {"菜单服务接口"})
public class MenuController extends BaseController<SysMenus> {

    @Autowired
    private SysMenusService service;

    @Override
    public BaseService<SysMenus> getService() {
        return service;
    }


}