package com.commiao.domain.enums;

/**
 * 还款周期
 * @author zhengjinping
 * 2016-3-11 下午2:24:18
 *
 */
public enum TermUnitEnum {
	DAY(1),//日
	WEEK(2),//周
	MONTH(3),//月
	YEAR(4);//年
	
	private final int value;
	
	TermUnitEnum(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
}
