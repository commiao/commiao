package com.chtwm.mall.pojo.advisor;

import java.io.Serializable;

public class FinancialAdvisorResultForShow implements Serializable {
    private String employeeNo; // 员工号
    private String employeeName;// 员工姓名
    private String careerStatus;// 员工状态
    private String mobileTel;// 手机号
    private String dptName;// 所属部门
    public String getEmployeeNo() {
        return employeeNo;
    }
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getCareerStatus() {
        return careerStatus;
    }
    public void setCareerStatus(String careerStatus) {
        this.careerStatus = careerStatus;
    }
    public String getMobileTel() {
        return mobileTel;
    }
    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }
    public String getDptName() {
        return dptName;
    }
    public void setDptName(String dptName) {
        this.dptName = dptName;
    }
}
