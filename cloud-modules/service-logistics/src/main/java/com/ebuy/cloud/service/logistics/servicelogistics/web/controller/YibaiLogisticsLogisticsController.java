package com.ebuy.cloud.service.logistics.servicelogistics.web.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebuy.cloud.service.logistics.servicelogistics.common.Code;
import com.ebuy.cloud.service.logistics.servicelogistics.common.ResponseMsg;
import com.ebuy.cloud.service.logistics.servicelogistics.common.StringUtil;
import com.ebuy.cloud.service.logistics.servicelogistics.entity.YibaiLogisticsLogistics;
import com.ebuy.cloud.service.logistics.servicelogistics.service.IYibaiLogisticsLogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 物流方式表 前端控制器
 * </p>
 *
 * @author hy
 * @since 2018-12-10
 */
@RestController
@RequestMapping("/yibaiLogisticsLogistics")
public class YibaiLogisticsLogisticsController {

    @Autowired
    private IYibaiLogisticsLogisticsService yibaiLogisticsLogisticsService;


    //带分页的列表查询
    @PostMapping("/list")
    public ResponseMsg list(@RequestBody JSONObject data) {
        ResponseMsg res = new ResponseMsg();
        try {
            Page<Map> page = yibaiLogisticsLogisticsService.queryList(data);
            res.setData(page);
        } catch (Exception e) {
            res.setMsg("系统异常!");
            res.setCode(Code.FAIL);
            e.printStackTrace();
        }
        return res;
    }

    //根据Id或者Code查询 物流渠道
    @PostMapping("/byIdOrShip_Code")
    public ResponseMsg ByIdOrCode(@RequestBody JSONObject data) {
        ResponseMsg res = new ResponseMsg();
        QueryWrapper<YibaiLogisticsLogistics> wrapper = new QueryWrapper<>();
        if (!StringUtil.isEmpty(data.getInteger("id"))) {
            wrapper.eq("id", data.getInteger("id"));
        }
        if (!StringUtil.isEmpty(data.getString("shipCode"))) {
            wrapper.eq("ship_Code", data.getString("shipCode"));
        }
        try {
            YibaiLogisticsLogistics yibaiLogisticsLogistics = yibaiLogisticsLogisticsService.getOne(wrapper);
            res.setData(yibaiLogisticsLogistics);
        } catch (Exception e) {
            res.setCode(Code.FAIL);
            res.setMsg("系统异常!");
            e.printStackTrace();
        }
        return res;
    }

    //增加或者修改
    @PostMapping("/addOrEdit")
    public ResponseMsg addOrEdit(@RequestBody YibaiLogisticsLogistics yibaiLogisticsLogistics) {
        ResponseMsg res = new ResponseMsg();
        try {
            if (yibaiLogisticsLogistics.getId() == null) {  //增
                yibaiLogisticsLogistics.setCreateTime(new Date());
                yibaiLogisticsLogisticsService.save(yibaiLogisticsLogistics);
                res.setData("新增物流渠道成功!");
            } else {  //改
                yibaiLogisticsLogistics.setModifyTime(new Date());
                yibaiLogisticsLogisticsService.updateById(yibaiLogisticsLogistics);
                res.setMsg("修改物流渠道成功!");
            }
        } catch (Exception e) {
            res.setCode(Code.FAIL);
            res.setMsg("系统异常!");
            e.printStackTrace();
        }
        return res;
    }


    //删除
    @PostMapping("/deleteById")
    public ResponseMsg deleteById(@RequestBody JSONObject data) {
        ResponseMsg res = new ResponseMsg();
        try {
            Integer id = data.getInteger("id");
            yibaiLogisticsLogisticsService.removeById(id);
        } catch (Exception e) {
            res.setCode(Code.FAIL);
            res.setMsg("系统异常!");
            e.printStackTrace();
        }
        return res;
    }


}
