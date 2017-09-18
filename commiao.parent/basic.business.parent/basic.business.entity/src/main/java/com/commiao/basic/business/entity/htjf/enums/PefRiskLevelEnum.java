package com.commiao.basic.business.entity.htjf.enums;

import org.apache.commons.lang.StringUtils;

/**
 * @date 2017/06/02 11:46:00
 * @author fushaobin
 *
 */
public enum PefRiskLevelEnum {
    /**
     * 客户风险等级
     */
    /**
     * CUSTRISKLEVEL1:"1","保守型".
     */
    PEFRISKLEVEL1("1", "保守型", "请您根据自身风险识别能力和风险承担能力选择相匹配的私募基金。"),
    /**
     * CUSTRISKLEVEL2:"2","稳健型".
     */
    PEFRISKLEVEL2("2", "稳健型", "请您根据自身风险识别能力和风险承担能力选择相匹配的私募基金。"),
    /**
     * CUSTRISKLEVEL3:"3","温和型".
     */
    PEFRISKLEVEL3("3", "平衡型", "请您根据自身风险识别能力和风险承担能力选择相匹配的私募基金。"),
    /**
     * CUSTRISKLEVEL4:"4","积极型".
     */
    PEFRISKLEVEL4("4", "成长型", "请您根据自身风险识别能力和风险承担能力选择相匹配的私募基金。"),
    /**
     * CUSTRISKLEVEL5:"5","激进型".
     */
    PEFRISKLEVEL5("5", "进取型", "请您根据自身风险识别能力和风险承担能力选择相匹配的私募基金。");

    private String code;
    private String name;
    private String description;

    private PefRiskLevelEnum(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public static  String getDescription(String name){
        String desc = "";
        PefRiskLevelEnum[] enums =  PefRiskLevelEnum.values();
        if(!StringUtils.isEmpty(name)){
            for(PefRiskLevelEnum enu:enums){
                if(enu.name.equalsIgnoreCase(name)){
                    desc = enu.description;
                    break;
                }
                
            }
        }
        return desc;
        
    }
}
