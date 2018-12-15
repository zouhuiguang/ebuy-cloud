package com.ebuy.cloud.service.logistics.servicelogistics.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebuy.cloud.service.logistics.servicelogistics.entity.YibaiCargoCompany;
import com.ebuy.cloud.service.logistics.servicelogistics.mapper.YibaiCargoCompanyMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ebuy.cloud.service.logistics.servicelogistics.service.IYibaiCargoCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 货运公司管理表-1 服务实现类
 * </p>
 *
 * @author hy
 * @since 2018-12-10
 */
@Service
public class YibaiCargoCompanyServiceImpl extends ServiceImpl<YibaiCargoCompanyMapper, YibaiCargoCompany> implements IYibaiCargoCompanyService {

    @Autowired
    private YibaiCargoCompanyMapper yibaiCargoCompanyMapper;

    //分页列表查询
    @Override
    public Page<Map> queryList(JSONObject data) {
        Page<Map> pag = new Page<Map>();
        pag.setCurrent(data.getInteger("pageIndex") == null ? 1 : data.getInteger("pageIndex"));
        pag.setSize(data.getInteger("pageSize") == null ? 20 : data.getInteger("pageSize"));
        List<Map> myItems = yibaiCargoCompanyMapper.queryList(pag, data);
        pag.setRecords(myItems);
        return pag;
    }

}
