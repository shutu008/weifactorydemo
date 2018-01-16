package com.vastsum.social.alipay.api;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlipayUserInfo implements Serializable {

	private static final long serialVersionUID = 5706155357771862079L;

	/** 
	 * 详细地址。
	 */
	private String address;

	/** 
	 * 区县名称。
	 */
	private String area;

	/** 
	 * 用户头像地址
	 */
	private String avatar;

	/** 
	 * 经营/业务范围（用户类型是公司类型时才有此字段）。
	 */
	private String businessScope;

	/** 
	 * 证件号码，结合证件类型使用.
	 */
	private String certNo;

	/** 
	 * 0:身份证
	1:护照
	2:军官证
	3:士兵证
	4:回乡证
	5:临时身份证
	6:户口簿
	7:警官证
	8:台胞证
	9:营业执照
	10:其它证件
	11:港澳居民来往内地通行证
	12:台湾居民来往大陆通行证
	 */
	private String certType;

	/** 
	 * 市名称。
	 */
	private String city;

	/** 
	 * 国家码
	 */
	private String countryCode;

	/** 
	 * 用户支付宝邮箱登录名
	 */
	private String email;

	/** 
	 * 企业代理人证件有效期（用户类型是公司类型时才有此字段）。
	 */
	private String firmAgentPersonCertExpiryDate;

	/** 
	 * 企业代理人证件号码（用户类型是公司类型时才有此字段）。
	 */
	private String firmAgentPersonCertNo;

	/** 
	 * 企业代理人证件类型, 返回值参考cert_type字段（用户类型是公司类型时才有此字段）。
	 */
	private String firmAgentPersonCertType;

	/** 
	 * 企业代理人姓名（用户类型是公司类型时才有此字段）。
	 */
	private String firmAgentPersonName;

	/** 
	 * 企业法人证件有效期（用户类型是公司类型时才有此字段）。
	 */
	private String firmLegalPersonCertExpiryDate;

	/** 
	 * 法人证件号码（用户类型是公司类型时才有此字段）。
	 */
	private String firmLegalPersonCertNo;

	/** 
	 * 企业法人证件类型, 返回值参考cert_type字段（用户类型是公司类型时才有此字段）。
	 */
	private String firmLegalPersonCertType;

	/** 
	 * 企业法人名称（用户类型是公司类型时才有此字段）。
	 */
	private String firmLegalPersonName;



	/** 
	 * 公司类型，包括（用户类型是公司类型时才有此字段）：
	CO(公司)
	INST(事业单位),
	COMM(社会团体),
	NGO(民办非企业组织),
	STATEORGAN(党政国家机关)
	 */
	private String firmType;

	/** 
	 * 性别（F：女性；M：男性）。
	 */
	private String gender;

	/** 
	 * 余额账户是否被冻结。
	T--被冻结；F--未冻结
	 */
	private String isBalanceFrozen;

	/** 
	 * 是否通过实名认证。T是通过 F是没有实名认证。
	 */
	private String isCertified;

	/** 
	 * 是否是学生
	 */
	private String isStudentCertified;

	/** 
	 * 营业执照有效期，yyyyMMdd或长期，（用户类型是公司类型时才有此字段）。
	 */
	private String licenseExpiryDate;

	/** 
	 * 企业执照号码（用户类型是公司类型时才有此字段）。
	 */
	private String licenseNo;

	/** 
	 * 支付宝会员等级
	 */
	private String memberGrade;

	/** 
	 * 手机号码。
	 */
	private String mobile;

	/** 
	 * 用户昵称
	 */
	private String nickName;

	/** 
	 * 组织机构代码（用户类型是公司类型时才有此字段）。
	 */
	private String organizationCode;

	/** 
	 * 个人用户生日。
	 */
	private String personBirthday;

	/** 
	 * 证件有效期（用户类型是个人的时候才有此字段）。
	 */
	private String personCertExpiryDate;

	/** 
	 * 电话号码。
	 */
	private String phone;

	/** 
	 * 职业
	 */
	private String profession;

	/** 
	 * 省份名称
	 */
	private String province;

	/** 
	 * 淘宝id
	 */
	private String taobaoId;

	/** 
	 * 支付宝用户的userId
	 */
	@Id
	private String userId;

	/** 
	 * 若用户是个人用户，则是用户的真实姓名；若是企业用户，则是企业名称。
	 */
	private String userName;

	/** 
	 * 用户状态（Q/T/B/W）。
		Q代表快速注册用户
		T代表已认证用户
		B代表被冻结账户
		W代表已注册，未激活的账户
	 */
	private String userStatus;

	/** 
	 * 用户类型（1/2）
		1代表公司账户2代表个人账户
	 */
	private String userType;

	/** 
	 * 邮政编码。
	 */
	private String zip;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirmAgentPersonCertExpiryDate() {
		return firmAgentPersonCertExpiryDate;
	}

	public void setFirmAgentPersonCertExpiryDate(String firmAgentPersonCertExpiryDate) {
		this.firmAgentPersonCertExpiryDate = firmAgentPersonCertExpiryDate;
	}

	public String getFirmAgentPersonCertNo() {
		return firmAgentPersonCertNo;
	}

	public void setFirmAgentPersonCertNo(String firmAgentPersonCertNo) {
		this.firmAgentPersonCertNo = firmAgentPersonCertNo;
	}

	public String getFirmAgentPersonCertType() {
		return firmAgentPersonCertType;
	}

	public void setFirmAgentPersonCertType(String firmAgentPersonCertType) {
		this.firmAgentPersonCertType = firmAgentPersonCertType;
	}

	public String getFirmAgentPersonName() {
		return firmAgentPersonName;
	}

	public void setFirmAgentPersonName(String firmAgentPersonName) {
		this.firmAgentPersonName = firmAgentPersonName;
	}

	public String getFirmLegalPersonCertExpiryDate() {
		return firmLegalPersonCertExpiryDate;
	}

	public void setFirmLegalPersonCertExpiryDate(String firmLegalPersonCertExpiryDate) {
		this.firmLegalPersonCertExpiryDate = firmLegalPersonCertExpiryDate;
	}

	public String getFirmLegalPersonCertNo() {
		return firmLegalPersonCertNo;
	}

	public void setFirmLegalPersonCertNo(String firmLegalPersonCertNo) {
		this.firmLegalPersonCertNo = firmLegalPersonCertNo;
	}

	public String getFirmLegalPersonCertType() {
		return firmLegalPersonCertType;
	}

	public void setFirmLegalPersonCertType(String firmLegalPersonCertType) {
		this.firmLegalPersonCertType = firmLegalPersonCertType;
	}

	public String getFirmLegalPersonName() {
		return firmLegalPersonName;
	}

	public void setFirmLegalPersonName(String firmLegalPersonName) {
		this.firmLegalPersonName = firmLegalPersonName;
	}

	public String getFirmType() {
		return firmType;
	}

	public void setFirmType(String firmType) {
		this.firmType = firmType;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsBalanceFrozen() {
		return isBalanceFrozen;
	}

	public void setIsBalanceFrozen(String isBalanceFrozen) {
		this.isBalanceFrozen = isBalanceFrozen;
	}

	public String getIsCertified() {
		return isCertified;
	}

	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

	public String getIsStudentCertified() {
		return isStudentCertified;
	}

	public void setIsStudentCertified(String isStudentCertified) {
		this.isStudentCertified = isStudentCertified;
	}

	public String getLicenseExpiryDate() {
		return licenseExpiryDate;
	}

	public void setLicenseExpiryDate(String licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getPersonBirthday() {
		return personBirthday;
	}

	public void setPersonBirthday(String personBirthday) {
		this.personBirthday = personBirthday;
	}

	public String getPersonCertExpiryDate() {
		return personCertExpiryDate;
	}

	public void setPersonCertExpiryDate(String personCertExpiryDate) {
		this.personCertExpiryDate = personCertExpiryDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getTaobaoId() {
		return taobaoId;
	}

	public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	
}
