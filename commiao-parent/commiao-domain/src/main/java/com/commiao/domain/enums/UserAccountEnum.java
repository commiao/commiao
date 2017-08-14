package com.commiao.domain.enums;

/**
 * @author jingmiao
 * 资金交易流水MoneyRecord的对应userId及账户名
 */
public enum UserAccountEnum {
	/**
	 * 趸交费用（前期服务费）
	 */
	USER_SATRT_FEE(Long.valueOf(1),"趸交费用"),
	/**
	 * 期缴费用（平台服务费）
	 */
	USER_MONTH_FEE(Long.valueOf(2),"期缴费用"),
	/**
	 * 中转账户（放款及划款时资金流水记录使用）
	 */
	USER_TRANSFER(Long.valueOf(3),"中转账户"),
	/**
	 * 罚息账户
	 */
	USER_DEFAULT_INTEREST(Long.valueOf(4),"罚息账户"),
	/**
	 * 滞纳金账户
	 */
	USER_LATE_FEE(Long.valueOf(5),"滞纳金账户"),
	/**
	 * 第三方费用
	 */
	USER_THIRD_FEE(Long.valueOf(6),"第三方费用");

    public long code;

    public String meaning;

    public long getCode() {
        return code;
    }

    public String getMeaning() {
        return meaning;
    }

    UserAccountEnum(long code,String meaning) {
        this.code = code;
        this.meaning = meaning;
    }

    public static UserAccountEnum value(long code) {
        for(UserAccountEnum e : values()) {
            if(e.code == code) {
                return e;
            }
        }
        return null;
    }
    public static void main(String[] args) {
    	System.out.println(UserAccountEnum.USER_LATE_FEE.getMeaning());
    	System.out.println(UserAccountEnum.USER_LATE_FEE.getCode());
    	System.out.println(UserAccountEnum.value(5));
	}
}
