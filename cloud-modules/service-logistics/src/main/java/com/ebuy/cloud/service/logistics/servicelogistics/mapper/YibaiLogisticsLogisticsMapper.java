package com.ebuy.cloud.service.logistics.servicelogistics.mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebuy.cloud.service.logistics.servicelogistics.entity.YibaiLogisticsLogistics;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 物流方式表 Mapper 接口
 * </p>
 *
 * @author hy
 * @since 2018-12-10
 */
public interface YibaiLogisticsLogisticsMapper extends BaseMapper<YibaiLogisticsLogistics> {

    List<Map> queryList(Page<Map> page, @Param(value = "map") JSONObject map);
}
