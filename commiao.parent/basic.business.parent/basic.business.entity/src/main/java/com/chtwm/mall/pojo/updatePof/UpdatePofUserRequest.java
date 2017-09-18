package com.chtwm.mall.pojo.updatePof;

/**
 * 公募用户信息修改bean
 * 
 * @author wrx
 *
 */
public class UpdatePofUserRequest {
	private String beneficiary;// 受益人 选填
	private String birthday;// 出生日期
	private String address;// 联系地址 选填
	private String ofundProfCode;//职业
	public String getOfundProfCode() {
		return ofundProfCode;
	}
	public void setOfundProfCode(String ofundProfCode) {
		this.ofundProfCode = ofundProfCode;
	}
	public String getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
