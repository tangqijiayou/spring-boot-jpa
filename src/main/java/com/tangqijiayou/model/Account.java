package com.tangqijiayou.model;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "account")
public class Account{
	private static final long serialVersionUID = -3557626145536185945L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 主键 这里约定统一下主键的数值类型都用Long */
	private Long id;

	/** 电话 */
	@Column(name = "phone", columnDefinition = "varchar(255) default '' ")
	private String phone;

	/** 昵称 */
	@Column(name = "nick_name", columnDefinition = "varchar(255) default '' ")
	private String nickName;

	/** 密码 */
	@Column(name = "password", columnDefinition = "varchar(255) default '' ")
	private String password;

	/** 真实姓名 */
	@Column(name = "real_name", columnDefinition = "varchar(255) default '' ")
	private String realName;

	/** 头像地址 */
	@Column(name = "logo_url", columnDefinition = "varchar(255) default '' ")
	private String logoUrl;

	/** 邮箱地址 */
	@Column(name = "email", columnDefinition = "varchar(255) default '' ")
	private String email;

	/** 账号状态 账号状态 @see AccountStatusEnum */
	@Column(name = "account_status", columnDefinition = "int not null default 1")
	private Integer accountStatus;

	/** 角色，这里用作权限控制 @see RoleEnum */
	@Column(name = "role", columnDefinition = "varchar(255) default '' ")
	private String role;

	/** 性别 1为男生， 2为女生，3保密 */
	@Column(name = "sex", columnDefinition = "int not null default 1")
	private Integer sex;

	/** 身份证 */
	@Column(name = "id_card", columnDefinition = "varchar(255) default '' ")
	private String idCard;

	/** 民族 */
	@Column(name = "nation", columnDefinition = "varchar(255) default '' ")
	private String nation;

	/** 籍贯 */
	@Column(name = "native_place", columnDefinition = "varchar(255) default '' ")
	private String nativePlace;

	/** 婚姻状态 1未婚，2已婚 */
	@Column(name = "marriage", columnDefinition = "int not null default 1")
	private int marriage;

	/** 认证状态 1未认证， 2已认证  @see AuthEnum */
	@Column(name = "auth", columnDefinition = "int not null default 1")
	private int auth;

	/** 家庭地址 */
	@Column(name = "family_address", columnDefinition = "varchar(255) default '' ")
	private String familyAddress;

	/** 创建时间 */
	@Column(name = "create_time")
	@org.hibernate.annotations.CreationTimestamp
	private Timestamp createTime;

	/** 最后更新时间 */
	@Column(name = "update_time")
	@org.hibernate.annotations.UpdateTimestamp
	private Timestamp updateTime;

	/** 删除标志 1为删除 */
	@Column(name = "del", columnDefinition = "int not null default 2")
	private Integer del;

	public Account() {

	}

	/***
	 * 用于新增用户
	 * 
	 * */
	public Account(String phone,String password) {
		super();
		this.phone = phone;
		this.nickName = "";
		this.password = password;
		this.realName = "";
		this.logoUrl = "";
		this.email = "";
		this.accountStatus = AccountStatusEnum.Enable.value;
		this.role = RoleEnum.user.name;
		this.sex = 3;
		this.idCard = "";
		this.nation = "";
		this.nativePlace = "";
		this.marriage = 1;
		this.auth = 1;
		this.familyAddress = "";
		this.del = 1;
	}

	public static enum AccountStatusEnum {
		Enable(1, "正常"), Disenable(2, "冻结");

		public final int value;
		public final String name;

		AccountStatusEnum(int value, String name) {
			this.value = value;
			this.name = name;
		}

		public static final AccountStatusEnum accountStatusEnum(int state) {
			switch (state) {
			case 1:
				return Enable;
			case 2:
				return Disenable;
			default:
				throw new IllegalArgumentException("Illegal state value:'" + state + "'");
			}
		}
	}
	
	public static enum AuthEnum {
		Disenable(1, "未认证"), Enable(2, "已认证");

		public final int value;
		public final String name;

		AuthEnum(int value, String name) {
			this.value = value;
			this.name = name;
		}

		public static final AuthEnum authEnum(int state) {
			switch (state) {
			case 1:
				return Disenable;
			case 2:
				return Enable;
			default:
				throw new IllegalArgumentException("Illegal state value:'" + state + "'");
			}
		}
	}

	public static enum RoleEnum {
		user(1, "user"), admin(2, "admin");

		public final int value;
		public final String name;

		RoleEnum(int value, String name) {
			this.value = value;
			this.name = name;
		}

		public static final RoleEnum roleEnum(int state) {
			switch (state) {
			case 1:
				return user;
			case 2:
				return admin;
			default:
				throw new IllegalArgumentException("Illegal state value:'" + state + "'");
			}
		}
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