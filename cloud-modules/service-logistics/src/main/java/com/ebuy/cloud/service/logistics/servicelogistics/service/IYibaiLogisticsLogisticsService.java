package com.ebuy.cloud.service.logistics.servicelogistics.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebuy.cloud.service.logistics.servicelogistics.entity.YibaiLogisticsLogistics;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 物流方式表 服务类
 * </p>
 *
 * @author hy
 * @since 2018-12-10
 */
public interface IYibaiLogisticsLogisticsService extends IService<YibaiLogisticsLogistics> {


    //分页列表查询
    public Page<Map> queryList(JSONObject data);
}
