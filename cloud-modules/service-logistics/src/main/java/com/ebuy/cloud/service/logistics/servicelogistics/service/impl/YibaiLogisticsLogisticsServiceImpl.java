package com.ebuy.cloud.service.logistics.servicelogistics.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ebuy.cloud.service.logistics.servicelogistics.entity.YibaiLogisticsLogistics;
import com.ebuy.cloud.service.logistics.servicelogistics.mapper.YibaiLogisticsLogisticsMapper;
import com.ebuy.cloud.service.logistics.servicelogistics.service.IYibaiLogisticsLogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 物流方式表 服务实现类
 * </p>
 *
 * @author hy
 * @since 2018-12-10
 */
@Service
public class YibaiLogisticsLogisticsServiceImpl extends ServiceImpl<YibaiLogisticsLogisticsMapper, YibaiLogisticsLogistics> implements IYibaiLogisticsLogisticsService {

    @Autowired
    private YibaiLogisticsLogisticsMapper yibaiLogisticsLogisticsMapper;

    @Override
    public Page<Map> queryList(JSONObject data) {
        Page<Map> pag = new Page<Map>();
        pag.setCurrent(data.getInteger("pageIndex") == null ? 1 : data.getInteger("pageIndex"));
        pag.setSize(data.getInteger("pageSize") == null ? 20 : data.getInteger("pageSize"));
        List<Map> myItems = yibaiLogisticsLogisticsMapper.queryList(pag,data);
        pag.setRecords(myItems);
        return pag;
    }
}


