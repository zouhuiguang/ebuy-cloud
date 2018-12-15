package com.ebuy.cloud.service.logistics.servicelogistics.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebuy.cloud.service.logistics.servicelogistics.entity.YibaiCargoCompany;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 货运公司管理表-1 服务类
 * </p>
 *
 * @author hy
 * @since 2018-12-10
 */
public interface IYibaiCargoCompanyService extends IService<YibaiCargoCompany> {

    //分页列表查询
    Page<Map> queryList(JSONObject data);
}
