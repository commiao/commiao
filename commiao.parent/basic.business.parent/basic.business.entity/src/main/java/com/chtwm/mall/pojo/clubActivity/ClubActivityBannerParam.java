package com.chtwm.mall.pojo.clubActivity;


/**
 * 恒乐会首页入参bean
 * @author wrx
 *
 */
public class ClubActivityBannerParam {
	private int page_no;//当前页
	private int page_size;//每页记录数
	private String act_type;//”,//活动类型
	private String member_level;//”,//会员级别
	private String sign_area;//”,//报名区域
	private String act_time_min;//”,//活动时间 yyyy-MM-dd
	private String act_time_max;//”//活动时间
	private String limitCount;//展示条数
	private String act_theme;//活动主题
    private String date_order;//时间排序方式0：升序、1：降序
    private String city;//城市   
    private String act_id;//活动主键id
	public String getAct_id() {
        return act_id;
    }
    public void setAct_id(String act_id) {
        this.act_id = act_id;
    }
    public String getAct_theme() {
        return act_theme;
    }
    public void setAct_theme(String act_theme) {
        this.act_theme = act_theme;
    }
    public String getDate_order() {
        return date_order;
    }
    public void setDate_order(String date_order) {
        this.date_order = date_order;
    }

	public String getLimitCount() {
        return limitCount;
    }
    public void setLimitCount(String limitCount) {
        this.limitCount = limitCount;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

	public int getPage_no() {
		return page_no;
	}
	public void setPage_no(int page_no) {
		this.page_no = page_no;
	}
	public int getPage_size() {
		return page_size;
	}
	public void setPage_size(int page_size) {
		this.page_size = page_size;
	}
	public String getAct_type() {
		return act_type;
	}
	public void setAct_type(String act_type) {
		this.act_type = act_type;
	}
	public String getMember_level() {
		return member_level;
	}
	public void setMember_level(String member_level) {
		this.member_level = member_level;
	}
	public String getSign_area() {
		return sign_area;
	}
	public void setSign_area(String sign_area) {
		this.sign_area = sign_area;
	}
	public String getAct_time_min() {
		return act_time_min;
	}
	public void setAct_time_min(String act_time_min) {
		this.act_time_min = act_time_min;
	}
	public String getAct_time_max() {
		return act_time_max;
	}
	public void setAct_time_max(String act_time_max) {
		this.act_time_max = act_time_max;
	}

	
	
}
