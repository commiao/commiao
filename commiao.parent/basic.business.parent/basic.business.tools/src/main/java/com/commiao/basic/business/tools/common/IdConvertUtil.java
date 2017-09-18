package com.commiao.basic.business.tools.common;

import com.commiao.basic.business.tools.common.constant.BigdataConstants.CertTypeConstant;
import com.commiao.basic.business.tools.common.constant.CommonConstant;


public class IdConvertUtil {

    /***
     * 
     * @brief 恒生证件类型转为招商证券
     *
     * @author
     *    - 2016年8月8日  申贺龙  创建初始版本
     *
     * @param hsCertType
     * @return
     */
    public static String hs2eleContract(String hsCertType){
    	String retEleCertType = null;
    	switch(hsCertType){
		    case CommonConstant.UnionConstant.HS_CERT_IDCARD:
		        retEleCertType = CommonConstant.EleContractConstant.ELE_CERT_IDCARD;
		        break;
		    case CommonConstant.UnionConstant.HS_CERT_CHINAPASSPORT:
		    	retEleCertType = CommonConstant.EleContractConstant.ELE_CERT_PASSPORT;
		        break;
		    case CommonConstant.UnionConstant.HS_CERT_FOREIGNPASSPORT:
		    	retEleCertType = CommonConstant.EleContractConstant.ELE_CERT_FOREIGNPASSPORT;
		        break;
		    case CommonConstant.UnionConstant.HS_CERT_OFFICER:
		    	retEleCertType = CommonConstant.EleContractConstant.ELE_CERT_OFFICER;
		        break;
		    case CommonConstant.UnionConstant.HS_CERT_SOLDIERS:
		    	retEleCertType = CommonConstant.EleContractConstant.ELE_CERT_SOLDIERS;
		        break;
		    case CommonConstant.UnionConstant.HS_CERT_HOMEVISITPERMIT:
		    	retEleCertType = CommonConstant.EleContractConstant.ELE_CERT_HOMEVISITPERMIT;
		        break;
		    case CommonConstant.UnionConstant.HS_CERT_TAIWANPERMIT:
		    	retEleCertType = CommonConstant.EleContractConstant.ELE_CERT_TAIWANPERMIT;
		        break;
		    case CommonConstant.UnionConstant.HS_CERT_POLICECARD:
		    	retEleCertType = CommonConstant.EleContractConstant.ELE_CERT_POLICECARD;
		        break;
		    default:
		    	retEleCertType = CommonConstant.EleContractConstant.ELE_CERT_ORTHERS;
    	}
    	return retEleCertType;
    }
    
    /***
     * 
     * @brief 证件类型（银联接口《=》恒生接口）相互转换
     *
     * 恒生证件类型：
     * {"code":"ETS-5BP0000","message":"查询字典信息成功！","details":null,"results":[{"caption":"个人证件类型","key_no":"1005","key_value":"#","english":"","memo":"","sys_name":"TA"},
     * {"caption":"身份证","key_no":"1005","key_value":"0","english":"","memo":"","sys_name":"TA"},
     * {"caption":"中国护照","key_no":"1005","key_value":"1","english":"","memo":"","sys_name":"TA"},
     * {"caption":"军官证","key_no":"1005","key_value":"2","english":"","memo":"","sys_name":"TA"},
     * {"caption":"士兵证","key_no":"1005","key_value":"3","english":"","memo":"","sys_name":"TA"},
     * {"caption":"回乡证","key_no":"1005","key_value":"4","english":"","memo":"","sys_name":"TA"},
     * {"caption":"户口本","key_no":"1005","key_value":"5","english":"","memo":"","sys_name":"TA"},
     * {"caption":"外籍护照","key_no":"1005","key_value":"6","english":"","memo":"","sys_name":"TA"},
     * {"caption":"其他","key_no":"1005","key_value":"7","english":"","memo":"","sys_name":"TA"},
     * {"caption":"文职","key_no":"1005","key_value":"8","english":"","memo":"","sys_name":"TA"},
     * {"caption":"警官","key_no":"1005","key_value":"9","english":"","memo":"","sys_name":"TA"},
     * {"caption":"港澳通行证","key_no":"1005","key_value":"A","english":"","memo":"","sys_name":"TA"},
     * {"caption":"居住证","key_no":"1005","key_value":"B","english":"","memo":"","sys_name":"TA"},
     * {"caption":"社保卡","key_no":"1005","key_value":"C","english":"","memo":"","sys_name":"TA"},
     * {"caption":"台胞证","key_no":"1005","key_value":"D","english":"","memo":"","sys_name":"TA"}]}
     * 
     * 银联证件类型：
     * 01：身份证；
     * 02：军官证；
     * 03：护照；
     * 04: 回乡证；
     * 05: 台胞证；
     * 06: 警官证；
     * 07: 士兵证；
     * 99: 其他证件；
     * 
     * @author
     *    - 2016年8月1日  申贺龙  创建初始版本
     *
     */
	public static enum certTypeEnum{
		IDCARD("01", "0"), PASSPORT("03", "6"), OFFICER("02", "2"),
		SOLDIERS("07", "3"), HOMEVISITPERMIT("04", "4"), TAIWANPERMIT("05", "D"),
		POLICECARD("06", "9"), ORTHERS("99", "7");
		
		private String unionNo;
		private String hsCertno; 
		certTypeEnum(String unionNo, String hsCertno){
			this.unionNo = unionNo;
			this.hsCertno = hsCertno;
		}
		public String getUnionNo() {
			return unionNo;
		}
		public String getHsCertno() {
			return hsCertno;
		}
		public void setUnionNo(String unionNo) {
			this.unionNo = unionNo;
		}
		public void setHsCertno(String hsCertno) {
			this.hsCertno = hsCertno;
		}
	}
	
	
	/**
	 * 
	 * @Description:恒生证件类型--》公募鉴权类型（转换） 
	 * @author wrx
	 * @param pofCertType
	 * @return
	 */
	public static String hS2PofForCertType(String pefCertType){
	    String retHSCertType = null;
	    switch (pefCertType) {
	    case CertTypeConstant.HS_CERT_TYPE_IDCARD:
	        retHSCertType = CertTypeConstant.POF_CERT_TYPE_IDCARD;
	        break;
	    case CertTypeConstant.HS_CERT_TYPE_FOREIGNPASSPORT:
	        retHSCertType = CertTypeConstant.POF_CERT_TYPE_FOREIGNPASSPORT;
	        break;
	    case CertTypeConstant.HS_CERT_TYPE_HOMEVISITPERMIT:
	        retHSCertType = CertTypeConstant.POF_CERT_TYPE_HOMEVISITPERMIT;
	        break;
	    case CertTypeConstant. HS_CERT_TYPE_TAIWANPERMIT:
	        retHSCertType = CertTypeConstant.POF_CERT_TYPE_TAIWANPERMIT;
	        break;
	    default:
	        retHSCertType = pefCertType;
	        break;
	    }
	    return retHSCertType;
	}
	
	/**
	 * 
	 * CreateDate:2016年12月3日下午5:21:34 
	 * @Description: 银行代码 公募--恒生
	 * @author:shl
	 * @version V1.0
	 */
	public static enum BankIdNoEnum{
		YZCX("934", "015"), GSYH("002", "002"), NYYH("003", "003"),
		ZGYH("004", "004"), JSYH("005", "005"), JTYH("006", "006"),
		ZXYH("015", "008"), GDYH("009", "012"), MSYH("014", "014"), 
		GFYH("016", "019"), XYYH("011", "011"), PFYH("010", "009"),
		PAYH("920", "020"), SHYH("017", "018");
		private String pofNo;
		private String hsNo; 
		BankIdNoEnum(String pofNo, String hsNo){
			this.pofNo = pofNo;
			this.hsNo = hsNo;
		}
		public String getHsNo() {
			return hsNo;
		}
		public void setHsNo(String hsNo) {
			this.hsNo = hsNo;
		}
		public String getPofNo() {
			return pofNo;
		}
		public void setPofNo(String pofNo) {
			this.pofNo = pofNo;
		}
	}
	
	
	/**
     * @Description::状态码转对应描述
     * @author chenglong
     * @param code
     * @return
     * 
     */
    public static String convertCodeToDesc(String certType, String custType) {
        String desc = "";
        if(custType.equals("1")){//个人
            switch (certType) {
            case "0":
                desc = "身份证";
                break;
            case "1":
                desc = "中国护照";
                break;
            case "2":
                desc = "军官证";
                break;
            case "3":
                desc = "士兵证";
                break;
            case "4":
                desc = "回乡证";
                break;
            case "5":
                desc = "户口本";
                break;
            case "6":
                desc = "外籍护照";
                break;
            case "7":
                desc = "其他";
                break;
            case "8":
                desc = "文职";
                break;
            case "9":
                desc = "警官";
                break;
            case "A":
                desc = "港澳通行证";
                break;
            case "B":
                desc = "居住证";
                break;
            case "C":
                desc = "社保卡";
                break;
            case "D":
                desc = "台胞证";
                break;
            default:
                break;
            }
        }else if(custType.equals("0")){//机构
            switch (certType) {
            case "1":
                desc = "营业执照";
                break;
            case "2":
                desc = "行政机关";
                break;
            case "3":
                desc = "社会团体";
                break;
            case "4":
                desc = "军队";
                break;
            case "5":
                desc = "武警";
                break;
            case "6":
                desc = "下属机构";
                break;
            case "7":
                desc = "基金会";
                break;
            case "8":
                desc = "其他机构";
                break;
            case "9":
                desc = "事业单位法人证书";
                break;
            case "A":
                desc = "工会法人资格证书";
                break;
            case "B":
                desc = "组织机构代码证";
                break;
            case "C":
                desc = "登记证书";
                break;
            case "D":
                desc = "本公司信托计划代码";
                break;
            case "E":
                desc = "其它公司信托计划代码";
                break;
            case "I":
                desc = "统一社会信用代码";
                break;
            default:
                break;
            }
        }
        return desc;
    }
    
    
    /**
     * @Description::职业id对应中文描述
     * @author wrx
     * @param code
     * @return
     * 
     */
    public static String convertVocationCodeToDesc(String vocationKey) {
    	String desc = "";
    		switch (vocationKey) {
    		case "1":
    			desc = "政府部门";
    			break;
    		case "2":
    			desc = "教科文";
    			break;
    		case "3":
    			desc = "金融";
    			break;
    		case "4":
    			desc = "商贸";
    			break;
    		case "5":
    			desc = "房地产";
    			break;
    		case "6":
    			desc = "制造业";
    			break;
    		case "7":
    			desc = "自由职业";
    			break;
    		case "9":
    			desc = "事业单位";
    			break;
    		case "09":
    			desc = "事业单位";
    			break;
    		case "10":
    			desc = "国有企业";
    			break;
    		case "11":
    			desc = "公务员";
    			break;
    		case "12":
    			desc = "专业技术人员";
    			break;
    		case "13":
    			desc = "办事人员";
    			break;
    		case "14":
    			desc = "军人";
    			break;
    		case "15":
    			desc = "商业和服务类人员";
    			break;
    		case "16":
    			desc = "生产、运输设备操作人员";
    			break;
    		case "18":
    			desc = "农、林、牧、渔、水利业生产人员";
    			break;
    		case "98":
    			desc = "其他";
    			break;
    		default:
    			break;
    		}
    	return desc;
    }
	
	/**
	 * 
	 * @Description:根据公募银行代码获取恒生银行代码 
	 * @author shl
	 * @param pofBankIdNo - 公募银行代码
	 * @return
	 */
	public static String pof2HSForBankIdNo(String pofBankIdNo){
		for(BankIdNoEnum bankIdNoEnum : BankIdNoEnum.values()){
			if(bankIdNoEnum.getPofNo().equals(pofBankIdNo)){
				return bankIdNoEnum.getHsNo();
			}
		}
		return "";
	}
	
	/**
	 * 
	 * @Description:公募鉴权证件类型--》恒生证件类型（转换）
	 * @author shl
	 * @param pofCertType
	 * @return
	 */
	public static String pof2HSForCertType(String pofCertType){
		String retHSCertType = null;
		switch (pofCertType) {
		case CertTypeConstant.POF_CERT_TYPE_IDCARD:
			retHSCertType = CertTypeConstant.HS_CERT_TYPE_IDCARD;
			break;
		case CertTypeConstant.POF_CERT_TYPE_FOREIGNPASSPORT:
			retHSCertType = CertTypeConstant.HS_CERT_TYPE_FOREIGNPASSPORT;
			break;
		case CertTypeConstant.POF_CERT_TYPE_HOMEVISITPERMIT:
			retHSCertType = CertTypeConstant.HS_CERT_TYPE_HOMEVISITPERMIT;
			break;
		case CertTypeConstant.POF_CERT_TYPE_TAIWANPERMIT:
			retHSCertType = CertTypeConstant.HS_CERT_TYPE_TAIWANPERMIT;
			break;
		default:
			retHSCertType = pofCertType;
			break;
		}
		return retHSCertType;
	}
    
}
