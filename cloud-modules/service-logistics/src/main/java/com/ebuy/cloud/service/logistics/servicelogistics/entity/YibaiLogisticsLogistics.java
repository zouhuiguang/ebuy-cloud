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
 * 物流渠道表
 * </p>
 *
 * @author hy
 * @since 2018-12-10
 */
@TableName(value = "yibai_logistics_logistics")
public class YibaiLogisticsLogistics extends Model<YibaiLogisticsLogistics> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 物流方式名
     */
    @TableField(value = "ship_name")
    private String shipName;

    /**
     * 物流方式英文名
     */
    @TableField(value = "ship_ename")
    private String shipEname;

    /**
     * 物流方式代码
     */
    @TableField(value = "ship_code")
    private String shipCode;

    /**
     * 燃油附加费
     */
    @TableField(value = "ship_fuel_cost")
    private Float shipFuelCost;

    /**
     * 货运公司ID
     */
    @TableField(value = "ship_company")
    private Integer shipCompany;

    /**
     * 物流类型
     */
    @TableField(value = "ship_type")
    private Integer shipType;

    /**
     * 1:公司自己的物流方式 2：分销商物流方式
     */
    @TableField(value = "ship_class")
    private Integer shipClass;

    /**
     * 支持仓库
     */
    @TableField(value = "ship_warehouse")
    private String shipWarehouse;

    /**
     * 是否有跟踪号(1为有,0为无)
     */
    @TableField(value = "has_tracking_number")
    private Integer hasTrackingNumber;

    /**
     * 跟踪号长度
     */
    @TableField(value = "track_num_length")
    private Integer trackNumLength;

    /**
     * 跟踪号前缀
     */
    @TableField(value = "track_num_prefixion")
    private String trackNumPrefixion;

    /**
     * 跟踪号后缀
     */
    @TableField(value = "track_num_suffix")
    private String trackNumSuffix;

    /**
     * 是否计算体积重(1为是,0为否)
     */
    @TableField(value = "is_volume_weight")
    private Integer isVolumeWeight;

    /**
     * 体积重比值
     */
    @TableField(value = "volume_weight_rate")
    private Float volumeWeightRate;

    /**
     * 是否支持配额设置
     */
    @TableField(value = "is_ship_quota")
    private Integer isShipQuota;

    /**
     * label ID
     */
    @TableField(value = "label")
    private Integer label;

    /**
     * 权重
     */
    @TableField(value = "rank")
    private Integer rank;

    /**
     * 使用状态(1为启用,2为停用)
     */
    @TableField(value = "use_status")
    private Integer useStatus;

    /**
     * 标签模板id
     */
    @TableField(value = "view_name_id")
    private Integer viewNameId;

    /**
     * 创建人ID
     */
    @TableField(value = "create_user_id")
    private Integer createUserId;

    /**
     * 修改人ID
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
     * 是否支持头程运输,0-不支持,1-支持
     */
    @TableField(value = "is_first_shipping")
    private Integer isFirstShipping;

    /**
     * 时效
     */
    @TableField(value = "time_out_data")
    private String timeOutData;

    /**
     * 查询网址
     */
    @TableField(value = "site")
    private String site;

    /**
     * 是否推送(0不推送1已推送)
     */
    @TableField(value = "is_push")
    private Integer isPush;

    /**
     * 物流公司对应物流方式真实code 不能填写错误
     */
    @TableField(value = "company_ship_code")
    private String companyShipCode;

    /**
     * 限制长cm
     */
    @TableField(value = "restrict_length")
    private String restrictLength;

    /**
     * 限制宽cm
     */
    @TableField(value = "restrict_width")
    private String restrictWidth;

    /**
     * 限制高cm
     */
    @TableField(value = "restrict_height")
    private String restrictHeight;

    /**
     * 三边之和
     */
    @TableField(value = "restrict_perimeter")
    private String restrictPerimeter;

    /**
     * 体积
     */
    @TableField(value = "restrict_volume")
    private String restrictVolume;

    /**
     * 销售平台
     */
    @TableField(value = "platform_code")
    private String platformCode;

    /**
     * 是否称重：0不用，1要
     */
    @TableField(value = "is_weight")
    private Integer isWeight;

    /**
     * 渠道限制最大重量
     */
    @TableField(value = "max_weight")
    private Float maxWeight;

    /**
     * 1重量,2金额
     */
    @TableField(value = "distribution")
    private Integer distribution;

    /**
     * 配送详情
     */
    @TableField(value = "distribution_details")
    private String distributionDetails;

    /**
     * 未上网
     */
    @TableField(value = "not_net")
    private String notNet;

    /**
     * 未出港
     */
    @TableField(value = "not_port")
    private String notPort;

    /**
     * 未签收
     */
    @TableField(value = "not_sign")
    private String notSign;

    /**
     * 国家
     */
    @TableField(value = "country")
    private String country;

    /**
     * 大于倍数
     */
    @TableField(value = "volume_weight_multiple")
    private Float volumeWeightMultiple;

    /**
     * 体积大于体积重几个立方米
     */
    @TableField(value = "volume_and_volume_weight_contrast")
    private Float volumeAndVolumeWeightContrast;

    /**
     * 包裹尺寸对比宽度
     */
    @TableField(value = "volume_weight_contrast_width")
    private Float volumeWeightContrastWidth;

    /**
     * 包裹尺寸对比长
     */
    @TableField(value = "volume_weight_contrast_length")
    private Float volumeWeightContrastLength;

    /**
     * 包裹尺寸对比高度
     */
    @TableField(value = "volume_weight_contrast_height")
    private Float volumeWeightContrastHeight;

    /**
     * 住宅费
     */
    @TableField(value = "residence_price")
    private Float residencePrice;

    /**
     * 0仓库不用装箱，1仓库需要装箱
     */
    @TableField(value = "is_install_box")
    private Integer isInstallBox;

    /**
     * 订单处理状态：0：正常处理， 1：拉单称重之后再申报不装箱
     */
    @TableField(value = "other_type")
    private Integer otherType;

    /**
     * 重量段(g)
     */
    @TableField(value = "weight_section")
    private Float weightSection;

    /**
     * 1否2是
     */
    @TableField(value = "is_cube")
    private Integer isCube;

    /**
     * 1Fba头程，2海外仓头程，3海外仓尾程，4国内直发
     */
    @TableField(value = "logistics_service_type")
    private Integer logisticsServiceType;

    /**
     * 1或2且
     */
    @TableField(value = "factor")
    private Integer factor;

    /**
     * 实重泡货重量
     */
    @TableField(value = "portion")
    private Float portion;

    /**
     * 物流备注
     */
    @TableField(value = "mark")
    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipEname() {
        return shipEname;
    }

    public void setShipEname(String shipEname) {
        this.shipEname = shipEname;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public Float getShipFuelCost() {
        return shipFuelCost;
    }

    public void setShipFuelCost(Float shipFuelCost) {
        this.shipFuelCost = shipFuelCost;
    }

    public Integer getShipCompany() {
        return shipCompany;
    }

    public void setShipCompany(Integer shipCompany) {
        this.shipCompany = shipCompany;
    }

    public Integer getShipType() {
        return shipType;
    }

    public void setShipType(Integer shipType) {
        this.shipType = shipType;
    }

    public Integer getShipClass() {
        return shipClass;
    }

    public void setShipClass(Integer shipClass) {
        this.shipClass = shipClass;
    }

    public String getShipWarehouse() {
        return shipWarehouse;
    }

    public void setShipWarehouse(String shipWarehouse) {
        this.shipWarehouse = shipWarehouse;
    }

    public Integer getHasTrackingNumber() {
        return hasTrackingNumber;
    }

    public void setHasTrackingNumber(Integer hasTrackingNumber) {
        this.hasTrackingNumber = hasTrackingNumber;
    }

    public Integer getTrackNumLength() {
        return trackNumLength;
    }

    public void setTrackNumLength(Integer trackNumLength) {
        this.trackNumLength = trackNumLength;
    }

    public String getTrackNumPrefixion() {
        return trackNumPrefixion;
    }

    public void setTrackNumPrefixion(String trackNumPrefixion) {
        this.trackNumPrefixion = trackNumPrefixion;
    }

    public String getTrackNumSuffix() {
        return trackNumSuffix;
    }

    public void setTrackNumSuffix(String trackNumSuffix) {
        this.trackNumSuffix = trackNumSuffix;
    }

    public Integer getIsVolumeWeight() {
        return isVolumeWeight;
    }

    public void setIsVolumeWeight(Integer isVolumeWeight) {
        this.isVolumeWeight = isVolumeWeight;
    }

    public Float getVolumeWeightRate() {
        return volumeWeightRate;
    }

    public void setVolumeWeightRate(Float volumeWeightRate) {
        this.volumeWeightRate = volumeWeightRate;
    }

    public Integer getIsShipQuota() {
        return isShipQuota;
    }

    public void setIsShipQuota(Integer isShipQuota) {
        this.isShipQuota = isShipQuota;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public Integer getViewNameId() {
        return viewNameId;
    }

    public void setViewNameId(Integer viewNameId) {
        this.viewNameId = viewNameId;
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

    public Integer getIsFirstShipping() {
        return isFirstShipping;
    }

    public void setIsFirstShipping(Integer isFirstShipping) {
        this.isFirstShipping = isFirstShipping;
    }

    public String getTimeOutData() {
        return timeOutData;
    }

    public void setTimeOutData(String timeOutData) {
        this.timeOutData = timeOutData;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getIsPush() {
        return isPush;
    }

    public void setIsPush(Integer isPush) {
        this.isPush = isPush;
    }

    public String getCompanyShipCode() {
        return companyShipCode;
    }

    public void setCompanyShipCode(String companyShipCode) {
        this.companyShipCode = companyShipCode;
    }

    public String getRestrictLength() {
        return restrictLength;
    }

    public void setRestrictLength(String restrictLength) {
        this.restrictLength = restrictLength;
    }

    public String getRestrictWidth() {
        return restrictWidth;
    }

    public void setRestrictWidth(String restrictWidth) {
        this.restrictWidth = restrictWidth;
    }

    public String getRestrictHeight() {
        return restrictHeight;
    }

    public void setRestrictHeight(String restrictHeight) {
        this.restrictHeight = restrictHeight;
    }

    public String getRestrictPerimeter() {
        return restrictPerimeter;
    }

    public void setRestrictPerimeter(String restrictPerimeter) {
        this.restrictPerimeter = restrictPerimeter;
    }

    public String getRestrictVolume() {
        return restrictVolume;
    }

    public void setRestrictVolume(String restrictVolume) {
        this.restrictVolume = restrictVolume;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public Integer getIsWeight() {
        return isWeight;
    }

    public void setIsWeight(Integer isWeight) {
        this.isWeight = isWeight;
    }

    public Float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Integer getDistribution() {
        return distribution;
    }

    public void setDistribution(Integer distribution) {
        this.distribution = distribution;
    }

    public String getDistributionDetails() {
        return distributionDetails;
    }

    public void setDistributionDetails(String distributionDetails) {
        this.distributionDetails = distributionDetails;
    }

    public String getNotNet() {
        return notNet;
    }

    public void setNotNet(String notNet) {
        this.notNet = notNet;
    }

    public String getNotPort() {
        return notPort;
    }

    public void setNotPort(String notPort) {
        this.notPort = notPort;
    }

    public String getNotSign() {
        return notSign;
    }

    public void setNotSign(String notSign) {
        this.notSign = notSign;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Float getVolumeWeightMultiple() {
        return volumeWeightMultiple;
    }

    public void setVolumeWeightMultiple(Float volumeWeightMultiple) {
        this.volumeWeightMultiple = volumeWeightMultiple;
    }

    public Float getVolumeAndVolumeWeightContrast() {
        return volumeAndVolumeWeightContrast;
    }

    public void setVolumeAndVolumeWeightContrast(Float volumeAndVolumeWeightContrast) {
        this.volumeAndVolumeWeightContrast = volumeAndVolumeWeightContrast;
    }

    public Float getVolumeWeightContrastWidth() {
        return volumeWeightContrastWidth;
    }

    public void setVolumeWeightContrastWidth(Float volumeWeightContrastWidth) {
        this.volumeWeightContrastWidth = volumeWeightContrastWidth;
    }

    public Float getVolumeWeightContrastLength() {
        return volumeWeightContrastLength;
    }

    public void setVolumeWeightContrastLength(Float volumeWeightContrastLength) {
        this.volumeWeightContrastLength = volumeWeightContrastLength;
    }

    public Float getVolumeWeightContrastHeight() {
        return volumeWeightContrastHeight;
    }

    public void setVolumeWeightContrastHeight(Float volumeWeightContrastHeight) {
        this.volumeWeightContrastHeight = volumeWeightContrastHeight;
    }

    public Float getResidencePrice() {
        return residencePrice;
    }

    public void setResidencePrice(Float residencePrice) {
        this.residencePrice = residencePrice;
    }

    public Integer getIsInstallBox() {
        return isInstallBox;
    }

    public void setIsInstallBox(Integer isInstallBox) {
        this.isInstallBox = isInstallBox;
    }

    public Integer getOtherType() {
        return otherType;
    }

    public void setOtherType(Integer otherType) {
        this.otherType = otherType;
    }

    public Float getWeightSection() {
        return weightSection;
    }

    public void setWeightSection(Float weightSection) {
        this.weightSection = weightSection;
    }

    public Integer getIsCube() {
        return isCube;
    }

    public void setIsCube(Integer isCube) {
        this.isCube = isCube;
    }

    public Integer getLogisticsServiceType() {
        return logisticsServiceType;
    }

    public void setLogisticsServiceType(Integer logisticsServiceType) {
        this.logisticsServiceType = logisticsServiceType;
    }

    public Integer getFactor() {
        return factor;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
    }

    public Float getPortion() {
        return portion;
    }

    public void setPortion(Float portion) {
        this.portion = portion;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "YibaiLogisticsLogistics{" +
                "id=" + id +
                ", shipName='" + shipName + '\'' +
                ", shipEname='" + shipEname + '\'' +
                ", shipCode='" + shipCode + '\'' +
                ", shipFuelCost=" + shipFuelCost +
                ", shipCompany=" + shipCompany +
                ", shipType=" + shipType +
                ", shipClass=" + shipClass +
                ", shipWarehouse='" + shipWarehouse + '\'' +
                ", hasTrackingNumber=" + hasTrackingNumber +
                ", trackNumLength=" + trackNumLength +
                ", trackNumPrefixion='" + trackNumPrefixion + '\'' +
                ", trackNumSuffix='" + trackNumSuffix + '\'' +
                ", isVolumeWeight=" + isVolumeWeight +
                ", volumeWeightRate=" + volumeWeightRate +
                ", isShipQuota=" + isShipQuota +
                ", label=" + label +
                ", rank=" + rank +
                ", useStatus=" + useStatus +
                ", viewNameId=" + viewNameId +
                ", createUserId=" + createUserId +
                ", modifyUserId=" + modifyUserId +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", isFirstShipping=" + isFirstShipping +
                ", timeOutData='" + timeOutData + '\'' +
                ", site='" + site + '\'' +
                ", isPush=" + isPush +
                ", companyShipCode='" + companyShipCode + '\'' +
                ", restrictLength='" + restrictLength + '\'' +
                ", restrictWidth='" + restrictWidth + '\'' +
                ", restrictHeight='" + restrictHeight + '\'' +
                ", restrictPerimeter='" + restrictPerimeter + '\'' +
                ", restrictVolume='" + restrictVolume + '\'' +
                ", platformCode='" + platformCode + '\'' +
                ", isWeight=" + isWeight +
                ", maxWeight=" + maxWeight +
                ", distribution=" + distribution +
                ", distributionDetails='" + distributionDetails + '\'' +
                ", notNet='" + notNet + '\'' +
                ", notPort='" + notPort + '\'' +
                ", notSign='" + notSign + '\'' +
                ", country='" + country + '\'' +
                ", volumeWeightMultiple=" + volumeWeightMultiple +
                ", volumeAndVolumeWeightContrast=" + volumeAndVolumeWeightContrast +
                ", volumeWeightContrastWidth=" + volumeWeightContrastWidth +
                ", volumeWeightContrastLength=" + volumeWeightContrastLength +
                ", volumeWeightContrastHeight=" + volumeWeightContrastHeight +
                ", residencePrice=" + residencePrice +
                ", isInstallBox=" + isInstallBox +
                ", otherType=" + otherType +
                ", weightSection=" + weightSection +
                ", isCube=" + isCube +
                ", logisticsServiceType=" + logisticsServiceType +
                ", factor=" + factor +
                ", portion=" + portion +
                ", mark='" + mark + '\'' +
                '}';
    }
}
