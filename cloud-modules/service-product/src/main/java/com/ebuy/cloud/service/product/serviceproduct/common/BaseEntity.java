package com.ebuy.cloud.service.product.serviceproduct.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author Enten 815279369@qq.com
 * @date 2018-12-12
 */
public class BaseEntity {

    @TableId(type = IdType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
