package com.tangqijiayou.vo;
import java.sql.Timestamp;

public class AccountVo {

	/** 主键 这里约定统一下主键的数值类型都用Long */
	private Long id;

	/** 电话 */
	private String phone;

	/** 昵称 */
	private String nickName;

	/** 密码 */
	private String password;

	/** 真实姓名 */
	private String realName;

	/** 头像地址 */
	private String logoUrl;

	/** 邮箱地址 */
	private String email;

	/** 账号状态 账号状态 @see AccountStatusEnum */
	private Integer accountStatus;

	/** 角色，这里用作权限控制 @see RoleEnum */
	private String role;

	/** 性别 1为男生， 2为女生，3保密 */
	private Integer sex;

	/** 身份证 */
	private String idCard;

	/** 民族 */
	private String nation;

	/** 籍贯 */
	private String nativePlace;

	/** 婚姻状态 1未婚，2已婚 */
	private int marriage;

	/** 认证状态 1未认证， 2已认证  @see AuthEnum */
	private int auth;

	/** 家庭地址 */
	private String familyAddress;

	/** 创建时间 */
	private Timestamp createTime;

	/** 最后更新时间 */
	private Timestamp updateTime;

	/** 删除标志 1为删除 */
	private Integer del;

	public AccountVo() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(Integer accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public int getMarriage() {
		return marriage;
	}

	public void setMarriage(int marriage) {
		this.marriage = marriage;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	public String getFamilyAddress() {
		return familyAddress;
	}

	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getDel() {
		return del;
	}

	public void setDel(Integer del) {
		this.del = del;
	}
}