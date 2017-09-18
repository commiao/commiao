package com.chtwm.mall.sdk.controller.wap.account.result;

import java.io.Serializable;

/**
totalScore:"100",//问卷总分数
optionScore:"80",//得分
grade:"进取型",//风险等级
allowProduct:"成长级、平衡级、稳健级、保守级",//可购买的产品等级

 * Create Author: chenglong
 * CreateDate:2016年9月21日下午4:29:57 
 * @Description: TODO 
 * @version V1.0
 */
public class QuestionScoreQueryResult implements Serializable{

    private static final long serialVersionUID = 6799674073652015581L;
    
    private String totalScore;          //问卷总分数
    private String optionScore;         //得分
    private String description;         //等级描述
	private String grade;               //风险等级
	private String allowProduct;        //可购买的产品等级
	
    public String getTotalScore() {
        return totalScore;
    }
    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }
    public String getOptionScore() {
        return optionScore;
    }
    public void setOptionScore(String optionScore) {
        this.optionScore = optionScore;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAllowProduct() {
        return allowProduct;
    }
    public void setAllowProduct(String allowProduct) {
        this.allowProduct = allowProduct;
    }
	
}
