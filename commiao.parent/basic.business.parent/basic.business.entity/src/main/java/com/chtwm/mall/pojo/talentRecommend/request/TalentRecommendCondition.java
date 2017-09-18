package com.chtwm.mall.pojo.talentRecommend.request;

import com.chtwm.mall.pojo.talentRecommend.TalentRecommend;

/**
 * 请求参数,请求条件等
 */
public class TalentRecommendCondition extends TalentRecommend {
    private static final long serialVersionUID = 6851794280101498332L;

    private int curPage;
    
    private int pageSize;
    
    private String ids;
    
    private String filePath;

    private String startDateApplicantString;
    private String endDateApplicantString;

      
    public String getStartDateApplicantString() {
        return startDateApplicantString;
    }

    public void setStartDateApplicantString(String startDateApplicantString) {
        this.startDateApplicantString = startDateApplicantString;
    }

    public String getEndDateApplicantString() {
        return endDateApplicantString;
    }

    public void setEndDateApplicantString(String endDateApplicantString) {
        this.endDateApplicantString = endDateApplicantString;
    }

    public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

}