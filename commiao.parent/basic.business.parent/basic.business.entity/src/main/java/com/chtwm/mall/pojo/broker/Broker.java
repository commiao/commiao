package com.chtwm.mall.pojo.broker;

/**
 * 
 * CreateDate:2017年9月5日下午3:41:01 
 * @Description: 预约理财师查询返回实体类 
 * @author:zw
 * @version V1.0
 */
public class Broker {
	
	/**员工编号 */
	private String code;
	/**姓名 */
	private String name;
	/**证书 */
	private String certificate;
	/**是否有从业资格证书（Y是 N否） */
	private String isFundPractitione;
	/**头像地址 */
	private String photo;
	/**简介 */
	private String summary;
	/**手机号*/
	private String mobile;
	/**理顾照片是否存在*/
	private String isPhotoExist;
	
	public String getIsPhotoExist() {
		return isPhotoExist;
	}
	public void setIsPhotoExist(String isPhotoExist) {
		this.isPhotoExist = isPhotoExist;
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
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getIsFundPractitione() {
		return isFundPractitione;
	}
	public void setIsFundPractitione(String isFundPractitione) {
		this.isFundPractitione = isFundPractitione;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
