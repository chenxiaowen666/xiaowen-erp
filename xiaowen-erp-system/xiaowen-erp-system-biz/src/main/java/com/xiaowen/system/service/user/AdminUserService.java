package com.xiaowen.system.service.user;

import cn.hutool.db.PageResult;
import com.xiaowen.system.controller.admin.user.vo.UserSaveReqVO;
import com.xiaowen.system.domain.user.AdminUserDO;
import jakarta.validation.Valid;

import java.io.InputStream;

public interface AdminUserService {

    /**
     * 创建用户
     *
     * @param createReqVO 用户信息
     * @return 用户编号
     */
    Long createUser(@Valid UserSaveReqVO createReqVO);


    void updateUser(@Valid UserSaveReqVO reqVO);
}
