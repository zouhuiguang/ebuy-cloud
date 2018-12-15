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
import com.ebuy.cloud.service.logistics.servicelogistics.entity.YibaiCargoCompany;
import com.ebuy.cloud.service.logistics.servicelogistics.service.IYibaiCargoCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.PastOrPresent;

/**
 * <p>
 * 货运公司管理表-1 前端控制器
 * </p>
 *
 * @author hy
 * @since 2018-12-10
 */
@RestController
@RequestMapping("/yibaiCargoCompany")
public class YibaiCargoCompanyController {

    @Autowired
    private IYibaiCargoCompanyService yibaiCargoCompanyService;

    //列表查询带分页
    @PostMapping("/list")
    public ResponseMsg queryList(@RequestBody JSONObject data) {
        ResponseMsg res = new ResponseMsg();
        try {
//            Page<YibaiCargoCompany> pag = new Page<YibaiCargoCompany>();
//            pag.setCurrent(data.getInteger("pageIndex") == null ? 1 : data.getInteger("pageIndex"));
//            pag.setSize(data.getInteger("pageSize") == null ? 20 : data.getInteger("pageSize"));
//            QueryWrapper<YibaiCargoCompany> wrapper = new QueryWrapper<YibaiCargoCompany>();
//            if (!StringUtil.isEmpty(data.getString("name"))) {
//                wrapper.like("name", data.getString("name"));
//            }
//            if (!StringUtil.isEmpty(data.getString("code"))) {
//                wrapper.eq("code", data.getString("code"));
//            }
//            if (!StringUtil.isEmpty(data.getInteger("status"))) {
//                wrapper.eq("use_status", data.getInteger("status"));
//            }

            // IPage<YibaiCargoCompany> page = yibaiCargoCompanyService.page(pag, wrapper);
            Page<Map> page = yibaiCargoCompanyService.queryList(data);
            res.setData(page);
        } catch (Exception e) {
            res.setCode(Code.FAIL);
            res.setMsg("系统异常!");
            e.printStackTrace();
        }
        return res;
    }


    //根据id或code查询 物流公司
    @PostMapping("/byIdOrCode")
    public ResponseMsg ByIdOrCode(@RequestBody JSONObject data) {
        ResponseMsg res = new ResponseMsg();
        QueryWrapper<YibaiCargoCompany> wrapper = new QueryWrapper<YibaiCargoCompany>();
        if (!StringUtil.isEmpty(data.getString("code"))) {
            wrapper.eq("code", data.getString("code"));
        }
        if (!StringUtil.isEmpty(data.getString("id"))) {
            wrapper.eq("id", data.getInteger("id"));
        }
        try {
            YibaiCargoCompany yibaiCargoCompany = yibaiCargoCompanyService.getOne(wrapper);
            res.setData(yibaiCargoCompany);
        } catch (Exception e) {
            res.setCode(Code.FAIL);
            res.setMsg("系统异常!");
            e.printStackTrace();
        }
        return res;
    }

    //增加或者修改
    @PostMapping("/addOrEdit")
    public ResponseMsg addOrEdit(@RequestBody YibaiCargoCompany yibaiCargoCompany) {
        ResponseMsg res = new ResponseMsg();
        try {
            if (yibaiCargoCompany.getId() == null) {
                yibaiCargoCompany.setCreateTime(new Date());
                yibaiCargoCompanyService.save(yibaiCargoCompany);
                res.setMsg("增加物流公司成功!");
            } else {
                yibaiCargoCompany.setModifyTime(new Date());
                yibaiCargoCompany.setCreateTime(null);
                yibaiCargoCompanyService.updateById(yibaiCargoCompany);
                res.setMsg("修改成功!");
            }
        } catch (Exception e) {
            res.setCode(Code.FAIL);
            res.setMsg("系统异常!");
            e.printStackTrace();
        }
        return res;
    }


/*    //条件查询
    @PostMapping("/find")
    public List<YibaiCargoCompany> find() {
        QueryWrapper<YibaiCargoCompany> wrapper = new QueryWrapper<YibaiCargoCompany>();
        wrapper.like("name", "欧洲");
        wrapper.eq("pay_currency", "CNY");
        List<YibaiCargoCompany> list = yibaiCargoCompanyService.list(wrapper);
        System.out.println(list.size());
        return list;
    }*/

    //删除
    @PostMapping("/deleteById")
    public ResponseMsg deleteById(@RequestBody JSONObject data) {
        ResponseMsg res = new ResponseMsg();
        try {
            Integer id = data.getInteger("id");
            yibaiCargoCompanyService.removeById(id);
        } catch (Exception e) {
            res.setCode(Code.FAIL);
            res.setMsg("系统异常!");
            e.printStackTrace();
        }
        return res;
    }


}
