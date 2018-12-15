package com.ebuy.cloud.service.product.serviceproduct.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.ebuy.cloud.service.product.serviceproduct.common.BaseEntity;

/**
 * <p>
 *
 * </p>
 *
 * @author Enten
 * @since 2018-12-12
 */
public class User extends BaseEntity {

    private String username;

    private String password;

    private String phone;

    private String realname;

    @TableField(exist=false)
    private UserScore userScore;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public UserScore getUserScore() {
        return userScore;
    }

    public void setUserScore(UserScore userScore) {
        this.userScore = userScore;
    }
}
