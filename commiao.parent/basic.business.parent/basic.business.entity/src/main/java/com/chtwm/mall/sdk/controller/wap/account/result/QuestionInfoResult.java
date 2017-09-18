package com.chtwm.mall.sdk.controller.wap.account.result;

import java.util.List;
/**
 * @date 2017/05/25
 * @description 风险评测
 * @author fushaobin
 *
 */
public class QuestionInfoResult {
    
    //序号
    private String orderNo;
    
    //题号
    private String questionNo;
    
    //题目
    private String questionContent;
    
    //总题数
    private String totalQuestionCount;
    
    //选项信息
    private List<QuestionList> optionInfo;
    
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getTotalQuestionCount() {
        return totalQuestionCount;
    }

    public void setTotalQuestionCount(String totalQuestionCount) {
        this.totalQuestionCount = totalQuestionCount;
    }

    public List<QuestionList> getOptionInfo() {
        return optionInfo;
    }

    public void setOptionInfo(List<QuestionList> optionInfo) {
        this.optionInfo = optionInfo;
    }

    //选项信息
    public static class QuestionList{
        
        //题号
        private String questionNo;
        
        //选项编号
        private String optionNo;
        
        //选项内容
        private String optionContent;
        
        //选项分数
        private String optionScore;
        
        //选项序号
        private String orderNo;
        
        //总选项数
        private String totalOptionCount;

        public String getQuestionNo() {
            return questionNo;
        }

        public void setQuestionNo(String questionNo) {
            this.questionNo = questionNo;
        }

        public String getOptionNo() {
            return optionNo;
        }

        public void setOptionNo(String optionNo) {
            this.optionNo = optionNo;
        }

        public String getOptionContent() {
            return optionContent;
        }

        public void setOptionContent(String optionContent) {
            this.optionContent = optionContent;
        }

        public String getOptionScore() {
            return optionScore;
        }

        public void setOptionScore(String optionScore) {
            this.optionScore = optionScore;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getTotalOptionCount() {
            return totalOptionCount;
        }

        public void setTotalOptionCount(String totalOptionCount) {
            this.totalOptionCount = totalOptionCount;
        }
    }
}
