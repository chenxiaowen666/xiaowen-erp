package com.xiaowen.system.mapper.user;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.xiaowen.system.domain.user.AdminUserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUserDO> {

    default public AdminUserDO selectByUsername(String username) {
        // 创建 LambdaQueryWrapper 对象
        LambdaQueryWrapper<AdminUserDO> wrapper = new LambdaQueryWrapper<>();
        // 设置查询条件
       wrapper.eq(StringUtils.isNotBlank(username),AdminUserDO::getUsername, username);
        // 执行查询
        return selectOne(wrapper);
    }

    default public AdminUserDO selectByEmail(String email) {
        // 创建 LambdaQueryWrapper 对象
        LambdaQueryWrapper<AdminUserDO> wrapper = new LambdaQueryWrapper<>();
        // 设置查询条件
        wrapper.eq(StringUtils.isNotBlank(email),AdminUserDO::getEmail, email);
        // 执行查询
        return selectOne(wrapper);
    }

    default public AdminUserDO selectByMobile(String mobile) {
        // 创建 LambdaQueryWrapper 对象
        LambdaQueryWrapper<AdminUserDO> wrapper = new LambdaQueryWrapper<>();
        // 设置查询条件
        wrapper.eq(StringUtils.isNotBlank(mobile),AdminUserDO::getMobile, mobile);
        // 执行查询
        return selectOne(wrapper);
    }
}
