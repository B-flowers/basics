package com.ofs.sys.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ofs.sys.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Licoy
 * @version 2018/4/16/11:31
 */
@Mapper
@Repository
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
}