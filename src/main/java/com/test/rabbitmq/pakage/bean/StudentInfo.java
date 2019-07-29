package com.test.rabbitmq.pakage.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 学生客户基本信息表-未分配
 * </p>
 *
 * @author crm
 * @since 2019-06-06
 */
public class StudentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;
    /**
     * 客户编号
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 客户类型ABCDE
     */
    private String type;
    /**
     * 分中心客户类别
     */
    private String brType;
    /**
     * oem卡号学籍号
     */
    private String oemAccount;
    /**
     * oem类型
     */
    private String oemType;
    /**
     * 账号
     */
    private String account;
    /**
     * 电话
     */
    @NotEmpty(message="手机号不能为空")
    private String phone;
    /**
     * 来源：门户，分中心...
     */
    private String dataFrom;
    /**
     * 获取方式
     */
    private String dataFromType;
    /**
     * 导入进口
     */
    private String dataFromInterface;
    /**
     * apiId，对外接口
     */
    private String apiId;
    /**
     * 导入部门
     */
    private String importDepartment;
    /**
     * 进展
     */
    private String progress;
    /**
     * 是否签约
     */
    private String isSign;
    /**
     * 是否锁定
     */
    private String isLock;
    /**
     * 跟进次数
     */
    private Integer trackingNum;
    /**
     * 呼叫次数
     */
    private Integer callNum;
    /**
     * 签约数量
     */
    private Integer signNum;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private String sex;
    /**
     * 学校
     */
    private String school;
    /**
     * 学制
     */
    private String schoolSystem;
    /**
     * 年级
     */
    private String grade;
    /**
     * 父母名字
     */
    private String parentName;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 区县
     */
    private String area;
    /**
     * 手动输入地址
     */
    private String areaInput;
    /**
     * 与父母关系
     */
    private String relationShip;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 微信
     */
    private String wechat;
    /**
     * qq
     */
    private String qq;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 最新更新时间
     */
    private Date updateDate;
    /**
     * 最新分配时间
     */
    private Date assignDate;
    /**
     * 分配方式，手动自动默认
     */
    private String assignType;
    /**
     * 最新签约时间
     */
    private Date signDate;
    /**
     * 最新跟进人
     */
    private String trackingPeople;
    /**
     * 最新流转时间
     */
    private Date moveDate;
    /**
     * 最新跟进时间
     */
    private Date trackingDate;
    /**
     * 下次跟进时间
     */
    private Date nextTrackingDate;
    /**
     * 最新呼叫时间
     */
    private Date callDate;
    /**
     * 一级部门
     */
    private Long oneLevelDepartment;
    /**
     * 二级部门
     */
    private Long twoLevelDepartment;
    /**
     * 三级部门
     */
    private Long threeLevelDepartment;
    /**
     * 属于主体id
     */
    private String belongTo;
    /**
     * 属于类型：个人/部门/分中心等
     */
    private String belongToType;
    /**
     * 之前的belongTo
     */
    private String belongToPre;
    /**
     * 之前的belongToType
     */
    private String belongToTypePre;
    /**
     * 归属分中心
     */
    private String providerAgent;
    /**
     * 归属人 总部1 分中心2
     */
    private String provider;
    /**
     * 所属教师,不可修改
     */
    private String providerTeacher;
    /**
     * 创建人/系统/分中心
     */
    private String createPeople;
    /**
     * 系统对接/系统导入/手动添加/分中心导入
     */
    private String createType;
    /**
     * 网络推广来源所填科目
     */
    private String subject;
    /**
     * 网络推广来源所搜索关键字
     */
    private String keyWords;
    /**
     * 来源：1学酷推广 2培优推广 3 101门户 4学酷主站 5班课主站
     */
    private String source;
    /**
     * 设备 字符串  1代表PC，2代表移动
     */
    private String equipment;
    /**
     * 页面地址
     */
    private String pageAddress;
    /**
     * 回收参照时间
     */
    private Date recycleDate;
    /**
     * 排序时间
     */
    private Date seqDate;
    /**
     * 排序字段（我的客户同一天按来源排）
     */
    private Integer seqList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrType() {
        return brType;
    }

    public void setBrType(String brType) {
        this.brType = brType;
    }

    public String getOemAccount() {
        return oemAccount;
    }

    public void setOemAccount(String oemAccount) {
        this.oemAccount = oemAccount;
    }

    public String getOemType() {
        return oemType;
    }

    public void setOemType(String oemType) {
        this.oemType = oemType;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
    }

    public String getDataFromType() {
        return dataFromType;
    }

    public void setDataFromType(String dataFromType) {
        this.dataFromType = dataFromType;
    }

    public String getDataFromInterface() {
        return dataFromInterface;
    }

    public void setDataFromInterface(String dataFromInterface) {
        this.dataFromInterface = dataFromInterface;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getImportDepartment() {
        return importDepartment;
    }

    public void setImportDepartment(String importDepartment) {
        this.importDepartment = importDepartment;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getIsSign() {
        return isSign;
    }

    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }

    public String getIsLock() {
        return isLock;
    }

    public void setIsLock(String isLock) {
        this.isLock = isLock;
    }

    public Integer getTrackingNum() {
        return trackingNum;
    }

    public void setTrackingNum(Integer trackingNum) {
        this.trackingNum = trackingNum;
    }

    public Integer getCallNum() {
        return callNum;
    }

    public void setCallNum(Integer callNum) {
        this.callNum = callNum;
    }

    public Integer getSignNum() {
        return signNum;
    }

    public void setSignNum(Integer signNum) {
        this.signNum = signNum;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchoolSystem() {
        return schoolSystem;
    }

    public void setSchoolSystem(String schoolSystem) {
        this.schoolSystem = schoolSystem;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaInput() {
        return areaInput;
    }

    public void setAreaInput(String areaInput) {
        this.areaInput = areaInput;
    }

    public String getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(String relationShip) {
        this.relationShip = relationShip;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public String getAssignType() {
        return assignType;
    }

    public void setAssignType(String assignType) {
        this.assignType = assignType;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getTrackingPeople() {
        return trackingPeople;
    }

    public void setTrackingPeople(String trackingPeople) {
        this.trackingPeople = trackingPeople;
    }

    public Date getMoveDate() {
        return moveDate;
    }

    public void setMoveDate(Date moveDate) {
        this.moveDate = moveDate;
    }

    public Date getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(Date trackingDate) {
        this.trackingDate = trackingDate;
    }

    public Date getNextTrackingDate() {
        return nextTrackingDate;
    }

    public void setNextTrackingDate(Date nextTrackingDate) {
        this.nextTrackingDate = nextTrackingDate;
    }

    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }

    public Long getOneLevelDepartment() {
        return oneLevelDepartment;
    }

    public void setOneLevelDepartment(Long oneLevelDepartment) {
        this.oneLevelDepartment = oneLevelDepartment;
    }

    public Long getTwoLevelDepartment() {
        return twoLevelDepartment;
    }

    public void setTwoLevelDepartment(Long twoLevelDepartment) {
        this.twoLevelDepartment = twoLevelDepartment;
    }

    public Long getThreeLevelDepartment() {
        return threeLevelDepartment;
    }

    public void setThreeLevelDepartment(Long threeLevelDepartment) {
        this.threeLevelDepartment = threeLevelDepartment;
    }

    public String getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(String belongTo) {
        this.belongTo = belongTo;
    }

    public String getBelongToType() {
        return belongToType;
    }

    public void setBelongToType(String belongToType) {
        this.belongToType = belongToType;
    }

    public String getBelongToPre() {
        return belongToPre;
    }

    public void setBelongToPre(String belongToPre) {
        this.belongToPre = belongToPre;
    }

    public String getBelongToTypePre() {
        return belongToTypePre;
    }

    public void setBelongToTypePre(String belongToTypePre) {
        this.belongToTypePre = belongToTypePre;
    }

    public String getProviderAgent() {
        return providerAgent;
    }

    public void setProviderAgent(String providerAgent) {
        this.providerAgent = providerAgent;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProviderTeacher() {
        return providerTeacher;
    }

    public void setProviderTeacher(String providerTeacher) {
        this.providerTeacher = providerTeacher;
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople;
    }

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getPageAddress() {
        return pageAddress;
    }

    public void setPageAddress(String pageAddress) {
        this.pageAddress = pageAddress;
    }

    public Date getRecycleDate() {
        return recycleDate;
    }

    public void setRecycleDate(Date recycleDate) {
        this.recycleDate = recycleDate;
    }

    public Date getSeqDate() {
        return seqDate;
    }

    public void setSeqDate(Date seqDate) {
        this.seqDate = seqDate;
    }

    public Integer getSeqList() {
        return seqList;
    }

    public void setSeqList(Integer seqList) {
        this.seqList = seqList;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
        "id=" + id +
        ", code=" + code +
        ", name=" + name +
        ", type=" + type +
        ", brType=" + brType +
        ", oemAccount=" + oemAccount +
        ", oemType=" + oemType +
        ", account=" + account +
        ", phone=" + phone +
        ", dataFrom=" + dataFrom +
        ", dataFromType=" + dataFromType +
        ", dataFromInterface=" + dataFromInterface +
        ", apiId=" + apiId +
        ", importDepartment=" + importDepartment +
        ", progress=" + progress +
        ", isSign=" + isSign +
        ", isLock=" + isLock +
        ", trackingNum=" + trackingNum +
        ", callNum=" + callNum +
        ", signNum=" + signNum +
        ", age=" + age +
        ", sex=" + sex +
        ", school=" + school +
        ", schoolSystem=" + schoolSystem +
        ", grade=" + grade +
        ", parentName=" + parentName +
        ", province=" + province +
        ", city=" + city +
        ", area=" + area +
        ", areaInput=" + areaInput +
        ", relationShip=" + relationShip +
        ", idCard=" + idCard +
        ", wechat=" + wechat +
        ", qq=" + qq +
        ", email=" + email +
        ", createDate=" + createDate +
        ", updateDate=" + updateDate +
        ", assignDate=" + assignDate +
        ", assignType=" + assignType +
        ", signDate=" + signDate +
        ", trackingPeople=" + trackingPeople +
        ", moveDate=" + moveDate +
        ", trackingDate=" + trackingDate +
        ", nextTrackingDate=" + nextTrackingDate +
        ", callDate=" + callDate +
        ", oneLevelDepartment=" + oneLevelDepartment +
        ", twoLevelDepartment=" + twoLevelDepartment +
        ", threeLevelDepartment=" + threeLevelDepartment +
        ", belongTo=" + belongTo +
        ", belongToType=" + belongToType +
        ", belongToPre=" + belongToPre +
        ", belongToTypePre=" + belongToTypePre +
        ", providerAgent=" + providerAgent +
        ", provider=" + provider +
        ", providerTeacher=" + providerTeacher +
        ", createPeople=" + createPeople +
        ", createType=" + createType +
        ", subject=" + subject +
        ", keyWords=" + keyWords +
        ", source=" + source +
        ", equipment=" + equipment +
        ", pageAddress=" + pageAddress +
        ", recycleDate=" + recycleDate +
        ", seqDate=" + seqDate +
        ", seqList=" + seqList +
        "}";
    }
}
