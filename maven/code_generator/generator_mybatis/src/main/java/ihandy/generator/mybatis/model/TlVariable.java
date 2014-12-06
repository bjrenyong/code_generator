package ihandy.generator.mybatis.model;

public class TlVariable {
    private Integer variableId;

    private String variableName;

    private String variableClassname;

    private String variableClassrelation;

    private String variableDesc;

    private Integer variableMust;

    private Integer variableStatus;

    private String variableMemo;

    private Integer relationClassId;

    private Integer orderBy;

    private Integer testType;

    private String testDataset;

    private String testDesc;

    public Integer getVariableId() {
        return variableId;
    }

    public void setVariableId(Integer variableId) {
        this.variableId = variableId;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName == null ? null : variableName.trim();
    }

    public String getVariableClassname() {
        return variableClassname;
    }

    public void setVariableClassname(String variableClassname) {
        this.variableClassname = variableClassname == null ? null : variableClassname.trim();
    }

    public String getVariableClassrelation() {
        return variableClassrelation;
    }

    public void setVariableClassrelation(String variableClassrelation) {
        this.variableClassrelation = variableClassrelation == null ? null : variableClassrelation.trim();
    }

    public String getVariableDesc() {
        return variableDesc;
    }

    public void setVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc == null ? null : variableDesc.trim();
    }

    public Integer getVariableMust() {
        return variableMust;
    }

    public void setVariableMust(Integer variableMust) {
        this.variableMust = variableMust;
    }

    public Integer getVariableStatus() {
        return variableStatus;
    }

    public void setVariableStatus(Integer variableStatus) {
        this.variableStatus = variableStatus;
    }

    public String getVariableMemo() {
        return variableMemo;
    }

    public void setVariableMemo(String variableMemo) {
        this.variableMemo = variableMemo == null ? null : variableMemo.trim();
    }

    public Integer getRelationClassId() {
        return relationClassId;
    }

    public void setRelationClassId(Integer relationClassId) {
        this.relationClassId = relationClassId;
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public String getTestDataset() {
        return testDataset;
    }

    public void setTestDataset(String testDataset) {
        this.testDataset = testDataset == null ? null : testDataset.trim();
    }

    public String getTestDesc() {
        return testDesc;
    }

    public void setTestDesc(String testDesc) {
        this.testDesc = testDesc == null ? null : testDesc.trim();
    }
}