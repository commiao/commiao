package com.chtwm.mall.pojo;

import java.io.Serializable;
import java.util.Map;

public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String user_id;// 客户编号
	private String phone;// 注册手机号
	private String name;
	private String maskName; // 如果使用手机号，中间四位替换为****
	private String id_no;// 证件号
	private String cust_type;// 客户类型
	private String email_internet;// 邮箱
	private String id_kind_gb;// 证件类型
	private String trade_prove_result;// (0000000000第一位实名制，第二位手机绑定，第三位邮箱绑定，第四位银行卡绑定，第五位地址完备性(若为1，直接认为完备，若为0，判断客户资料的地址是否为空，不为空则认为完备，空则认为不完备))
	private String money_account;// 财富账号
	private String mobile_tel;// 联系人手机号
	private String bank_account;
	private String bank_name;
	private String main_broker_name;
	private String regist_date;// 注册日期
	private String is_certification;// 是否实名认证 1.否 2.是（空默认为否）
	private String org_contact_name;// 机构联系人(经办人姓名)
	private String invest_favour;// 风险偏好 1.保守型 2.稳健型 3.平衡性 4.成长型 5.进取型
	private String deptnode_code; // 所属部门编号,中岩或明泽
	private String create_date;//创建时间
	private String birthday = "";// 出生日期
	private String vocation = "";// 职业类型
	private String address; // 通讯地址
	private String beneficiary = "";// 实际受益人
	private String regAddress = "";// 注册地址(机构帐户)
	private String officeAddress = "";// 办公地址(机构帐户)
	private String businessScope = "";// 经营范围(机构帐户)
	private String orgHolding = "";// 机构实际控制人(机构帐户)
	private String investorClassify = "";// 投资者分类
	private String conBirthday;// 经办人生日
	private String conVocation;// 经办人职业
	private String contactIdno; // 经办人证件号码
	private String contactIdtype; // 经办人证件类型
	private String clientId = ""; // 公募客户编号

	private Map<String, Object> pofAcctInfoMap;// 公募客户信息Map

	public String getConBirthday() {
		return conBirthday;
	}

	public void setConBirthday(String conBirthday) {
		this.conBirthday = conBirthday;
	}
	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getConVocation() {
		return conVocation;
	}

	public void setConVocation(String conVocation) {
		this.conVocation = conVocation;
	}

	public String getContactIdno() {
		return contactIdno;
	}

	public void setContactIdno(String contactIdno) {
		this.contactIdno = contactIdno;
	}

	public String getContactIdtype() {
		return contactIdtype;
	}

	public void setContactIdtype(String contactIdtype) {
		this.contactIdtype = contactIdtype;
	}


	public String getInvestorClassify() {
		return investorClassify;
	}

	public void setInvestorClassify(String investorClassify) {
		this.investorClassify = investorClassify;
	}


	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getRegAddress() {
		return regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getOrgHolding() {
		return orgHolding;
	}

	public void setOrgHolding(String orgHolding) {
		this.orgHolding = orgHolding;
	}

	public String getDeptnode_code() {
		return deptnode_code;
	}

	public void setDeptnode_code(String deptnode_code) {
		this.deptnode_code = deptnode_code;
	}

	public String getMaskName() {
		return maskName;
	}

	public void setMaskName(String maskName) {
		this.maskName = maskName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBank_account() {
		return bank_account;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getMain_broker_name() {
		return main_broker_name;
	}

	public void setMain_broker_name(String main_broker_name) {
		this.main_broker_name = main_broker_name;
	}

	public String getMobile_tel() {
		return mobile_tel;
	}

	public void setMobile_tel(String mobile_tel) {
		this.mobile_tel = mobile_tel;
	}

	public String getMoney_account() {
		return money_account;
	}

	public void setMoney_account(String money_account) {
		this.money_account = money_account;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public String getEmail_internet() {
		return email_internet;
	}

	public void setEmail_internet(String email_internet) {
		this.email_internet = email_internet;
	}

	public String getId_kind_gb() {
		return id_kind_gb;
	}

	public void setId_kind_gb(String id_kind_gb) {
		this.id_kind_gb = id_kind_gb;
	}

	public String getTrade_prove_result() {
		return trade_prove_result;
	}

	public void setTrade_prove_result(String trade_prove_result) {
		this.trade_prove_result = trade_prove_result;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegist_date() {
		return regist_date;
	}

	public void setRegist_date(String regist_date) {
		this.regist_date = regist_date;
	}

	public String getIs_certification() {
		return is_certification;
	}

	public void setIs_certification(String is_certification) {
		this.is_certification = is_certification;
	}

	public String getOrg_contact_name() {
		return org_contact_name;
	}

	public void setOrg_contact_name(String org_contact_name) {
		this.org_contact_name = org_contact_name;
	}

	public String getInvest_favour() {
		return invest_favour;
	}

	public void setInvest_favour(String invest_favour) {
		this.invest_favour = invest_favour;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	/**
	 * 获取 #{bare_field_comment}
	 * 
	 * @return pofAcctInfoMap
	 */
	public Map<String, Object> getPofAcctInfoMap() {
		return pofAcctInfoMap;
	}

	/**
	 * 设置 #{bare_field_comment}
	 * 
	 * @param pofAcctInfoMap
	 *            the pofAcctInfoMap to set
	 */
	public void setPofAcctInfoMap(Map<String, Object> pofAcctInfoMap) {
		this.pofAcctInfoMap = pofAcctInfoMap;
	}
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInfo [user_id=" + user_id + ", phone=" + phone + ", name="
				+ name + ", maskName=" + maskName + ", id_no=" + id_no
				+ ", cust_type=" + cust_type + ", email_internet="
				+ email_internet + ", id_kind_gb=" + id_kind_gb
				+ ", trade_prove_result=" + trade_prove_result
				+ ", money_account=" + money_account + ", mobile_tel="
				+ mobile_tel + ", bank_account=" + bank_account
				+ ", bank_name=" + bank_name + ", main_broker_name="
				+ main_broker_name + ", regist_date=" + regist_date
				+ ", is_certification=" + is_certification
				+ ", org_contact_name=" + org_contact_name + ", invest_favour="
				+ invest_favour + ", deptnode_code=" + deptnode_code
				+ ", create_date=" + create_date + ", birthday=" + birthday
				+ ", vocation=" + vocation + ", address=" + address
				+ ", beneficiary=" + beneficiary + ", regAddress=" + regAddress
				+ ", officeAddress=" + officeAddress + ", businessScope="
				+ businessScope + ", orgHolding=" + orgHolding
				+ ", investorClassify=" + investorClassify + ", conBirthday="
				+ conBirthday + ", conVocation=" + conVocation
				+ ", contactIdno=" + contactIdno + ", contactIdtype="
				+ contactIdtype + ", clientId=" + clientId
				+ ", pofAcctInfoMap=" + pofAcctInfoMap + "]";
	}
	

	

	
}
