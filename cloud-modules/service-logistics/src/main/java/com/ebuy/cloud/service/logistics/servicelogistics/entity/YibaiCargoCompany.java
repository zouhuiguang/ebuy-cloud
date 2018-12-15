package com.ebuy.cloud.service.logistics.servicelogistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 货运公司管理表-1
 * </p>
 *
 * @author hy
 * @since 2018-12-10
 */
@TableName(value = "yibai_cargo_company")
public class YibaiCargoCompany extends Model<YibaiCargoCompany> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 货运公司名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 货运公司简称
     */
    @TableField(value = "name_abbr")
    private String nameAbbr;

    /**
     * 货运公司code
     */
    @TableField(value = "code")
    private String code;

    /**
     * 邮政编码
     */
    @TableField(value = "zip_code")
    private String zipCode;

    /**
     * 所属地区
     */
    @TableField(value = "district")
    private Integer district;

    /**
     * 结算货币
     */
    @TableField(value = "pay_currency")
    private String payCurrency;

    /**
     * 结算方式(0为现金，1为月结，2为周结)
     */
    @TableField(value = "pay_type")
    private Integer payType;

    /**
     * 开户银行
     */
    @TableField(value = "bank")
    private String bank;

    /**
     * 银行账户
     */
    @TableField(value = "bank_account")
    private String bankAccount;

    /**
     * 网址
     */
    @TableField(value = "site")
    private String site;

    /**
     * 地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 联系人
     */
    @TableField(value = "contact")
    private String contact;

    /**
     * 联系人电话
     */
    @TableField(value = "contact_phone")
    private String contactPhone;

    /**
     * 联系人传真
     */
    @TableField(value = "contact_fax")
    private String contactFax;

    /**
     * 联系人邮箱
     */
    @TableField(value = "contact_email")
    private String contactEmail;

    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;

    /**
     * api账户
     */
    @TableField(value = "api_account")
    private String apiAccount;

    /**
     * api密码
     */
    @TableField(value = "api_password")
    private String apiPassword;

    /**
     * api token
     */
    @TableField(value = "api_token")
    private String apiToken;

    /**
     * 开启状态
     */
    @TableField(value = "use_status")
    private Integer useStatus;

    /**
     * 创建人
     */
    @TableField(value = "create_user_id")
    private Integer createUserId;

    /**
     * 修改人
     */
    @TableField(value = "modify_user_id")
    private Integer modifyUserId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "modify_time")
    private Date modifyTime;

    /**
     * 0否,1是
     */
    @TableField(value = "is_weighing")
    private Integer isWeighing;

    /**
     * 客户编号
     */
    @TableField(value = "customer_id")
    private String customerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAbbr() {
        return nameAbbr;
    }

    public void setNameAbbr(String nameAbbr) {
        this.nameAbbr = nameAbbr;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getApiAccount() {
        return apiAccount;
    }

    public void setApiAccount(String apiAccount) {
        this.apiAccount = apiAccount;
    }

    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getIsWeighing() {
        return isWeighing;
    }

    public void setIsWeighing(Integer isWeighing) {
        this.isWeighing = isWeighing;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "YibaiCargoCompany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameAbbr='" + nameAbbr + '\'' +
                ", code='" + code + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", district=" + district +
                ", payCurrency='" + payCurrency + '\'' +
                ", payType=" + payType +
                ", bank='" + bank + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", site='" + site + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", contactFax='" + contactFax + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", note='" + note + '\'' +
                ", apiAccount='" + apiAccount + '\'' +
                ", apiPassword='" + apiPassword + '\'' +
                ", apiToken='" + apiToken + '\'' +
                ", useStatus=" + useStatus +
                ", createUserId=" + createUserId +
                ", modifyUserId=" + modifyUserId +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", isWeighing=" + isWeighing +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
