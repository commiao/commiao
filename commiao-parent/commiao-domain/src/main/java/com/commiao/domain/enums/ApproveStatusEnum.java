package com.commiao.domain.enums;

/**
 * 审批状态
 * Author ningzhitao 
 * Date   15/12/19
 */
public enum ApproveStatusEnum {

    FAILURE(0, "失败"),
    SUCCESS(1, "成功"),
    ONGOING(2, "处理中");

    public int code;

    public String meaning;

    public int getCode() {
        return code;
    }

    public String getMeaning() {
        return meaning;
    }

    ApproveStatusEnum(int code,String meaning) {
        this.code = code;
        this.meaning = meaning;
    }

    public static ApproveStatusEnum value(int code) {
        for(ApproveStatusEnum e : values()) {
            if(e.code == code) {
                return e;
            }
        }
        return null;
    }
}
