package com.ebuy.cloud.service.product.serviceproduct.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebuy.cloud.service.product.serviceproduct.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Enten
 * @since 2018-12-12
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    public List<User> selectUserListPage(Page page, @Param("score") Integer score);

}
