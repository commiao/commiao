package com.chtwm.mall.pojo.product;

/**
 * 私募产品详情
 */
/*
{
    data: 
    {
            expected_profit:””,//预期收益
            prod_term:””,//产品期限
            issue_scale:””,//产品规模
            risk_level:””,//风险等级
            fund_status:””,//产品状态
            bonus_type:””,//收益类型
			fin_objective:””,// 募集资金用途
			repayment_source:””,// 还款来源
			issue_date:””,//募集开始日期
			issue_end_date:””,//募集结束日期
			setup_date:””,//成立日期
			effective_date:””,//计息日
			end_date:””,//到期日
            memo:””//产品详情
	}
    ,
    hmac:"", //预留字段
    msg: "success",
    status: "0"
}
 */
public class ProductDetailPef {

    private String expected_profit_min;
    
    private String expected_profit_max;
    
    private String prod_term;
    
    private String issue_scale;
    
    private String risk_level;
    
    private String risk_level_ori;//风险等级 原值
    
    private String fund_status;
    
    private String bonus_type;
    
    private String bonus_type_key;
	
    private String fin_objective;
	
    private String repayment_source;
	
    private String issue_date;
	
    private String issue_end_date;
	
    private String setup_date;
	
    private String effective_date;
	
    private String end_date;
    
    private String memo;
    
    private String reserve_base_balance;
    
    private String project_name;
    private String project_code;
    
    private String sale_project_name;
    
    private String risk_disclosure;
    
    private int isRisk = 1;		//当前登录用户是否符合该产品的风险等级		-1：未知错误；0：符合；1：不符合
    private String available_risk; // 适合客户风险等级
    
    private String isAllowAppend;   //产品是否可以追加
    
    public String getIsAllowAppend() {
        return isAllowAppend;
    }

    public void setIsAllowAppend(String isAllowAppend) {
        this.isAllowAppend = isAllowAppend;
    }

    public String getAvailable_risk() {
        return available_risk;
    }

    public void setAvailable_risk(String available_risk) {
        this.available_risk = available_risk;
    }

    public String getProject_code() {
		return project_code;
	}

	public void setProject_code(String project_code) {
		this.project_code = project_code;
	}

	private String coop_orgid;
    
    private String fund_code;
    
    
    private String order_no;
	
	private String order_status;
	
	private String order_time;
	
	private String order_balance;
	
	private String fund_name;
	
	private String fund_name_short;
	
	
	private String client_id;
	
	private String client_name;
    

	private String subscribe_unit;//最小认购单位
	
	private String project_status;
	
	private String net_val;
	
	private String net_val_date;
	
	private String min_balance;
	
	
	private String total_net_value;//累计净值
	
	private String manager_name;//管理人名称
	
	private String pro_serialno;//营销项目编号
	
	public String getPro_serialno() {
        return pro_serialno;
    }

    public void setPro_serialno(String pro_serialno) {
        this.pro_serialno = pro_serialno;
    }

    public String getTotal_net_value() {
		return total_net_value;
	}

	public void setTotal_net_value(String total_net_value) {
		this.total_net_value = total_net_value;
	}

	public String getMin_balance() {
		return min_balance;
	}

	public void setMin_balance(String min_balance) {
		this.min_balance = min_balance;
	}

	public String getBonus_type_key() {
		return bonus_type_key;
	}

	public void setBonus_type_key(String bonus_type_key) {
		this.bonus_type_key = bonus_type_key;
	}

	public String getNet_val() {
		return net_val;
	}

	public void setNet_val(String net_val) {
		this.net_val = net_val;
	}

	public String getNet_val_date() {
		return net_val_date;
	}

	public void setNet_val_date(String net_val_date) {
		this.net_val_date = net_val_date;
	}

	public String getProject_status() {
		return project_status;
	}

	public void setProject_status(String project_status) {
		this.project_status = project_status;
	}

	public String getReserve_base_balance() {
		return reserve_base_balance;
	}

	public void setReserve_base_balance(String reserve_base_balance) {
		this.reserve_base_balance = reserve_base_balance;
	}

	public String getSubscribe_unit() {
		return subscribe_unit;
	}

	public void setSubscribe_unit(String subscribe_unit) {
		this.subscribe_unit = subscribe_unit;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public String getOrder_balance() {
		return order_balance;
	}

	public void setOrder_balance(String order_balance) {
		this.order_balance = order_balance;
	}

	public String getFund_name() {
		return fund_name;
	}

	public void setFund_name(String fund_name) {
		this.fund_name = fund_name;
	}

	public String getFund_name_short() {
		return fund_name_short;
	}

	public void setFund_name_short(String fund_name_short) {
		this.fund_name_short = fund_name_short;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public String getCoop_orgid() {
		return coop_orgid;
	}

	public void setCoop_orgid(String coop_orgid) {
		this.coop_orgid = coop_orgid;
	}

	public String getFund_code() {
		return fund_code;
	}

	public void setFund_code(String fund_code) {
		this.fund_code = fund_code;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getExpected_profit_min() {
		return expected_profit_min;
	}

	public void setExpected_profit_min(String expected_profit_min) {
		this.expected_profit_min = expected_profit_min;
	}

	public String getExpected_profit_max() {
		return expected_profit_max;
	}

	public void setExpected_profit_max(String expected_profit_max) {
		this.expected_profit_max = expected_profit_max;
	}

	public String getProd_term() {
		return prod_term;
	}

	public void setProd_term(String prod_term) {
		this.prod_term = prod_term;
	}

	public String getIssue_scale() {
		return issue_scale;
	}

	public void setIssue_scale(String issue_scale) {
		this.issue_scale = issue_scale;
	}

	public String getRisk_level() {
		return risk_level;
	}

	public void setRisk_level(String risk_level) {
		this.risk_level = risk_level;
	}

	public String getFund_status() {
		return fund_status;
	}

	public void setFund_status(String fund_status) {
		this.fund_status = fund_status;
	}

	public String getBonus_type() {
		return bonus_type;
	}

	public void setBonus_type(String bonus_type) {
		this.bonus_type = bonus_type;
	}

	public String getFin_objective() {
		return fin_objective;
	}

	public void setFin_objective(String fin_objective) {
		this.fin_objective = fin_objective;
	}

	public String getRepayment_source() {
		return repayment_source;
	}

	public void setRepayment_source(String repayment_source) {
		this.repayment_source = repayment_source;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public String getIssue_end_date() {
		return issue_end_date;
	}

	public void setIssue_end_date(String issue_end_date) {
		this.issue_end_date = issue_end_date;
	}

	public String getSetup_date() {
		return setup_date;
	}

	public void setSetup_date(String setup_date) {
		this.setup_date = setup_date;
	}

	public String getEffective_date() {
		return effective_date;
	}

	public void setEffective_date(String effective_date) {
		this.effective_date = effective_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getSale_project_name() {
		return sale_project_name;
	}

	public void setSale_project_name(String sale_project_name) {
		this.sale_project_name = sale_project_name;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getRisk_level_ori() {
		return risk_level_ori;
	}

	public void setRisk_level_ori(String risk_level_ori) {
		this.risk_level_ori = risk_level_ori;
	}

	public String getRisk_disclosure() {
		return risk_disclosure;
	}

	public void setRisk_disclosure(String risk_disclosure) {
		this.risk_disclosure = risk_disclosure;
	}

	public int getIsRisk() {
		return isRisk;
	}

	public void setIsRisk(int isRisk) {
		this.isRisk = isRisk;
	}
	
	
    
}
