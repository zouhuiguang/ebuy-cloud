package com.ebuy.cloud.service.product.serviceproduct.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ebuy.cloud.service.product.serviceproduct.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Enten
 * @since 2018-12-12
 */
public interface UserService extends IService<User> {

    public Page<User> selectUserListPage(Integer score, int pageNum, int pageSize);

}
