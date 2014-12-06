package ihandy.generator.mybatis.model;

import java.util.Date;

public class TlClassInfo {
    private Integer classId;

    private Integer projectId;

    private String packageName;

    private String className;

    private String classCn;

    private Integer classType;

    private Integer status;

    private Integer classBelong;

    private String classMemo;

    private Float orderBy;

    private Date updateDate;

    private String testUrl;

    private Integer testType;

    private String testDemo;

    private String testDemoDesc;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getClassCn() {
        return classCn;
    }

    public void setClassCn(String classCn) {
        this.classCn = classCn == null ? null : classCn.trim();
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClassBelong() {
        return classBelong;
    }

    public void setClassBelong(Integer classBelong) {
        this.classBelong = classBelong;
    }

    public String getClassMemo() {
        return classMemo;
    }

    public void setClassMemo(String classMemo) {
        this.classMemo = classMemo == null ? null : classMemo.trim();
    }

    public Float getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Float orderBy) {
        this.orderBy = orderBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(String testUrl) {
        this.testUrl = testUrl == null ? null : testUrl.trim();
    }

    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public String getTestDemo() {
        return testDemo;
    }

    public void setTestDemo(String testDemo) {
        this.testDemo = testDemo == null ? null : testDemo.trim();
    }

    public String getTestDemoDesc() {
        return testDemoDesc;
    }

    public void setTestDemoDesc(String testDemoDesc) {
        this.testDemoDesc = testDemoDesc == null ? null : testDemoDesc.trim();
    }
}