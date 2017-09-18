package com.chtwm.mall.sdk.controller.wap.account.params;

import java.io.Serializable;


/**
 * 问卷答案提交
 *
 */
public class QuestionnaireAnswerSubmitParams implements Serializable{

    private static final long serialVersionUID = -2904678732295576272L;
    
  //问卷答案
    private String questionnaireAnswers;

    public String getQuestionnaireAnswers() {
        return questionnaireAnswers;
    }

    public void setQuestionnaireAnswers(String questionnaireAnswers) {
        this.questionnaireAnswers = questionnaireAnswers;
    }
    
    
   /* private String optionContent;
    private String paperId;
    private String answerName;
    private String certType;
    private String certNo;
    private String mobileTel;
    private String orgContactName;
    
    public String getOrgContactName() {
        return orgContactName;
    }
    public void setOrgContactName(String orgContactName) {
        this.orgContactName = orgContactName;
    }
    public String getOptionContent() {
        return optionContent;
    }
    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent;
    }
    public String getPaperId() {
        return paperId;
    }
    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }
    public String getAnswerName() {
        return answerName;
    }
    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }
    public String getCertType() {
        return certType;
    }
    public void setCertType(String certType) {
        this.certType = certType;
    }
    public String getCertNo() {
        return certNo;
    }
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }
    public String getMobileTel() {
        return mobileTel;
    }
    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }
    
 */   
}
