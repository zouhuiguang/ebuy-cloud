package com.ebuy.cloud.service.product.serviceproduct.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ebuy.cloud.service.product.serviceproduct.entity.User;
import com.ebuy.cloud.service.product.serviceproduct.mapper.UserMapper;
import com.ebuy.cloud.service.product.serviceproduct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Enten
 * @since 2018-12-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<User> selectUserListPage(Integer score, int pageNum, int pageSize) {
        Page<User> page = new Page<>(pageNum, pageSize);
//        return page.setRecords(this.baseMapper.selectUserListPage(page, score));
        return page.setRecords(userMapper.selectUserListPage(page, score));
    }
}
