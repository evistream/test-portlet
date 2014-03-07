package com.aimluck.eip.cayenne.om.security.auto;

import java.util.List;

/** Class _TurbineUser was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _TurbineUser extends org.apache.cayenne.CayenneDataObject {

    public static final String CELLULAR_MAIL_PROPERTY = "cellularMail";
    public static final String CELLULAR_PHONE_PROPERTY = "cellularPhone";
    public static final String CELLULAR_UID_PROPERTY = "cellularUid";
    public static final String COMPANY_ID_PROPERTY = "companyId";
    public static final String CONFIRM_VALUE_PROPERTY = "confirmValue";
    public static final String CREATED_PROPERTY = "created";
    public static final String CREATED_USER_ID_PROPERTY = "createdUserId";
    public static final String DISABLED_PROPERTY = "disabled";
    public static final String EMAIL_PROPERTY = "email";
    public static final String FIRST_NAME_PROPERTY = "firstName";
    public static final String FIRST_NAME_KANA_PROPERTY = "firstNameKana";
    public static final String HAS_PHOTO_PROPERTY = "hasPhoto";
    public static final String HAS_PHOTO_SMARTPHONE_PROPERTY = "hasPhotoSmartphone";
    public static final String IN_TELEPHONE_PROPERTY = "inTelephone";
    public static final String LAST_LOGIN_PROPERTY = "lastLogin";
    public static final String LAST_NAME_PROPERTY = "lastName";
    public static final String LAST_NAME_KANA_PROPERTY = "lastNameKana";
    public static final String LOGIN_NAME_PROPERTY = "loginName";
    public static final String MIGRATE_VERSION_PROPERTY = "migrateVersion";
    public static final String MODIFIED_PROPERTY = "modified";
    public static final String OBJECTDATA_PROPERTY = "objectdata";
    public static final String OUT_TELEPHONE_PROPERTY = "outTelephone";
    public static final String PASSWORD_CHANGED_PROPERTY = "passwordChanged";
    public static final String PASSWORD_VALUE_PROPERTY = "passwordValue";
    public static final String PHOTO_PROPERTY = "photo";
    public static final String PHOTO_MODIFIED_PROPERTY = "photoModified";
    public static final String PHOTO_MODIFIED_SMARTPHONE_PROPERTY = "photoModifiedSmartphone";
    public static final String PHOTO_SMARTPHONE_PROPERTY = "photoSmartphone";
    public static final String POSITION_ID_PROPERTY = "positionId";
    public static final String TUTORIAL_FORBID_PROPERTY = "tutorialForbid";
    public static final String UPDATED_USER_ID_PROPERTY = "updatedUserId";
    public static final String EIP_MUSER_POSITION_PROPERTY = "eipMUserPosition";
    public static final String EIP_TACL_USER_ROLE_MAPS_PROPERTY = "eipTAclUserRoleMaps";
    public static final String EIP_TCABINET_FILE_PROPERTY = "eipTCabinetFile";
    public static final String EIP_TEVENTLOG_PROPERTY = "eipTEventlog";
    public static final String EIP_TMSGBOARD_CATEGORY_PROPERTY = "eipTMsgboardCategory";
    public static final String EIP_TREPORT_PROPERTY = "eipTReport";
    public static final String EIP_TTEST_PROPERTY = "eipTTest";
    public static final String EIP_TTIMELINE_PROPERTY = "eipTTimeline";
    public static final String EIP_TTIMELINE_LIKE_PROPERTY = "eipTTimelineLike";
    public static final String EIP_TTODO_PROPERTY = "eipTTodo";
    public static final String EIP_TTODO_CATEGORY_PROPERTY = "eipTTodoCategory";
    public static final String EIP_TWORKFLOW_REQUEST_PROPERTY = "eipTWorkflowRequest";
    public static final String TURBINE_USER_GROUP_ROLE_PROPERTY = "turbineUserGroupRole";

    public static final String USER_ID_PK_COLUMN = "USER_ID";

    public void setCellularMail(String cellularMail) {
        writeProperty("cellularMail", cellularMail);
    }
    public String getCellularMail() {
        return (String)readProperty("cellularMail");
    }
    
    
    public void setCellularPhone(String cellularPhone) {
        writeProperty("cellularPhone", cellularPhone);
    }
    public String getCellularPhone() {
        return (String)readProperty("cellularPhone");
    }
    
    
    public void setCellularUid(String cellularUid) {
        writeProperty("cellularUid", cellularUid);
    }
    public String getCellularUid() {
        return (String)readProperty("cellularUid");
    }
    
    
    public void setCompanyId(Integer companyId) {
        writeProperty("companyId", companyId);
    }
    public Integer getCompanyId() {
        return (Integer)readProperty("companyId");
    }
    
    
    public void setConfirmValue(String confirmValue) {
        writeProperty("confirmValue", confirmValue);
    }
    public String getConfirmValue() {
        return (String)readProperty("confirmValue");
    }
    
    
    public void setCreated(java.util.Date created) {
        writeProperty("created", created);
    }
    public java.util.Date getCreated() {
        return (java.util.Date)readProperty("created");
    }
    
    
    public void setCreatedUserId(Integer createdUserId) {
        writeProperty("createdUserId", createdUserId);
    }
    public Integer getCreatedUserId() {
        return (Integer)readProperty("createdUserId");
    }
    
    
    public void setDisabled(String disabled) {
        writeProperty("disabled", disabled);
    }
    public String getDisabled() {
        return (String)readProperty("disabled");
    }
    
    
    public void setEmail(String email) {
        writeProperty("email", email);
    }
    public String getEmail() {
        return (String)readProperty("email");
    }
    
    
    public void setFirstName(String firstName) {
        writeProperty("firstName", firstName);
    }
    public String getFirstName() {
        return (String)readProperty("firstName");
    }
    
    
    public void setFirstNameKana(String firstNameKana) {
        writeProperty("firstNameKana", firstNameKana);
    }
    public String getFirstNameKana() {
        return (String)readProperty("firstNameKana");
    }
    
    
    public void setHasPhoto(String hasPhoto) {
        writeProperty("hasPhoto", hasPhoto);
    }
    public String getHasPhoto() {
        return (String)readProperty("hasPhoto");
    }
    
    
    public void setHasPhotoSmartphone(String hasPhotoSmartphone) {
        writeProperty("hasPhotoSmartphone", hasPhotoSmartphone);
    }
    public String getHasPhotoSmartphone() {
        return (String)readProperty("hasPhotoSmartphone");
    }
    
    
    public void setInTelephone(String inTelephone) {
        writeProperty("inTelephone", inTelephone);
    }
    public String getInTelephone() {
        return (String)readProperty("inTelephone");
    }
    
    
    public void setLastLogin(java.util.Date lastLogin) {
        writeProperty("lastLogin", lastLogin);
    }
    public java.util.Date getLastLogin() {
        return (java.util.Date)readProperty("lastLogin");
    }
    
    
    public void setLastName(String lastName) {
        writeProperty("lastName", lastName);
    }
    public String getLastName() {
        return (String)readProperty("lastName");
    }
    
    
    public void setLastNameKana(String lastNameKana) {
        writeProperty("lastNameKana", lastNameKana);
    }
    public String getLastNameKana() {
        return (String)readProperty("lastNameKana");
    }
    
    
    public void setLoginName(String loginName) {
        writeProperty("loginName", loginName);
    }
    public String getLoginName() {
        return (String)readProperty("loginName");
    }
    
    
    public void setMigrateVersion(Integer migrateVersion) {
        writeProperty("migrateVersion", migrateVersion);
    }
    public Integer getMigrateVersion() {
        return (Integer)readProperty("migrateVersion");
    }
    
    
    public void setModified(java.util.Date modified) {
        writeProperty("modified", modified);
    }
    public java.util.Date getModified() {
        return (java.util.Date)readProperty("modified");
    }
    
    
    public void setObjectdata(byte[] objectdata) {
        writeProperty("objectdata", objectdata);
    }
    public byte[] getObjectdata() {
        return (byte[])readProperty("objectdata");
    }
    
    
    public void setOutTelephone(String outTelephone) {
        writeProperty("outTelephone", outTelephone);
    }
    public String getOutTelephone() {
        return (String)readProperty("outTelephone");
    }
    
    
    public void setPasswordChanged(java.util.Date passwordChanged) {
        writeProperty("passwordChanged", passwordChanged);
    }
    public java.util.Date getPasswordChanged() {
        return (java.util.Date)readProperty("passwordChanged");
    }
    
    
    public void setPasswordValue(String passwordValue) {
        writeProperty("passwordValue", passwordValue);
    }
    public String getPasswordValue() {
        return (String)readProperty("passwordValue");
    }
    
    
    public void setPhoto(byte[] photo) {
        writeProperty("photo", photo);
    }
    public byte[] getPhoto() {
        return (byte[])readProperty("photo");
    }
    
    
    public void setPhotoModified(java.util.Date photoModified) {
        writeProperty("photoModified", photoModified);
    }
    public java.util.Date getPhotoModified() {
        return (java.util.Date)readProperty("photoModified");
    }
    
    
    public void setPhotoModifiedSmartphone(java.util.Date photoModifiedSmartphone) {
        writeProperty("photoModifiedSmartphone", photoModifiedSmartphone);
    }
    public java.util.Date getPhotoModifiedSmartphone() {
        return (java.util.Date)readProperty("photoModifiedSmartphone");
    }
    
    
    public void setPhotoSmartphone(byte[] photoSmartphone) {
        writeProperty("photoSmartphone", photoSmartphone);
    }
    public byte[] getPhotoSmartphone() {
        return (byte[])readProperty("photoSmartphone");
    }
    
    
    public void setPositionId(Integer positionId) {
        writeProperty("positionId", positionId);
    }
    public Integer getPositionId() {
        return (Integer)readProperty("positionId");
    }
    
    
    public void setTutorialForbid(String tutorialForbid) {
        writeProperty("tutorialForbid", tutorialForbid);
    }
    public String getTutorialForbid() {
        return (String)readProperty("tutorialForbid");
    }
    
    
    public void setUpdatedUserId(Integer updatedUserId) {
        writeProperty("updatedUserId", updatedUserId);
    }
    public Integer getUpdatedUserId() {
        return (Integer)readProperty("updatedUserId");
    }
    
    
    public void setEipMUserPosition(com.aimluck.eip.cayenne.om.account.EipMUserPosition eipMUserPosition) {
        setToOneTarget("eipMUserPosition", eipMUserPosition, true);
    }

    public com.aimluck.eip.cayenne.om.account.EipMUserPosition getEipMUserPosition() {
        return (com.aimluck.eip.cayenne.om.account.EipMUserPosition)readProperty("eipMUserPosition");
    } 
    
    
    public void addToEipTAclUserRoleMaps(com.aimluck.eip.cayenne.om.account.EipTAclUserRoleMap obj) {
        addToManyTarget("eipTAclUserRoleMaps", obj, true);
    }
    public void removeFromEipTAclUserRoleMaps(com.aimluck.eip.cayenne.om.account.EipTAclUserRoleMap obj) {
        removeToManyTarget("eipTAclUserRoleMaps", obj, true);
    }
    public List getEipTAclUserRoleMaps() {
        return (List)readProperty("eipTAclUserRoleMaps");
    }
    
    
    public void addToEipTCabinetFile(com.aimluck.eip.cayenne.om.portlet.EipTCabinetFile obj) {
        addToManyTarget("eipTCabinetFile", obj, true);
    }
    public void removeFromEipTCabinetFile(com.aimluck.eip.cayenne.om.portlet.EipTCabinetFile obj) {
        removeToManyTarget("eipTCabinetFile", obj, true);
    }
    public List getEipTCabinetFile() {
        return (List)readProperty("eipTCabinetFile");
    }
    
    
    public void addToEipTEventlog(com.aimluck.eip.cayenne.om.portlet.EipTEventlog obj) {
        addToManyTarget("eipTEventlog", obj, true);
    }
    public void removeFromEipTEventlog(com.aimluck.eip.cayenne.om.portlet.EipTEventlog obj) {
        removeToManyTarget("eipTEventlog", obj, true);
    }
    public List getEipTEventlog() {
        return (List)readProperty("eipTEventlog");
    }
    
    
    public void addToEipTMsgboardCategory(com.aimluck.eip.cayenne.om.portlet.EipTMsgboardCategory obj) {
        addToManyTarget("eipTMsgboardCategory", obj, true);
    }
    public void removeFromEipTMsgboardCategory(com.aimluck.eip.cayenne.om.portlet.EipTMsgboardCategory obj) {
        removeToManyTarget("eipTMsgboardCategory", obj, true);
    }
    public List getEipTMsgboardCategory() {
        return (List)readProperty("eipTMsgboardCategory");
    }
    
    
    public void addToEipTReport(com.aimluck.eip.cayenne.om.portlet.EipTReport obj) {
        addToManyTarget("eipTReport", obj, true);
    }
    public void removeFromEipTReport(com.aimluck.eip.cayenne.om.portlet.EipTReport obj) {
        removeToManyTarget("eipTReport", obj, true);
    }
    public List getEipTReport() {
        return (List)readProperty("eipTReport");
    }
    
    
    public void addToEipTTest(com.aimluck.eip.cayenne.om.portlet.EipTTest obj) {
        addToManyTarget("eipTTest", obj, true);
    }
    public void removeFromEipTTest(com.aimluck.eip.cayenne.om.portlet.EipTTest obj) {
        removeToManyTarget("eipTTest", obj, true);
    }
    public List getEipTTest() {
        return (List)readProperty("eipTTest");
    }
    
    
    public void addToEipTTimeline(com.aimluck.eip.cayenne.om.portlet.EipTTimeline obj) {
        addToManyTarget("eipTTimeline", obj, true);
    }
    public void removeFromEipTTimeline(com.aimluck.eip.cayenne.om.portlet.EipTTimeline obj) {
        removeToManyTarget("eipTTimeline", obj, true);
    }
    public List getEipTTimeline() {
        return (List)readProperty("eipTTimeline");
    }
    
    
    public void addToEipTTimelineLike(com.aimluck.eip.cayenne.om.portlet.EipTTimelineLike obj) {
        addToManyTarget("eipTTimelineLike", obj, true);
    }
    public void removeFromEipTTimelineLike(com.aimluck.eip.cayenne.om.portlet.EipTTimelineLike obj) {
        removeToManyTarget("eipTTimelineLike", obj, true);
    }
    public List getEipTTimelineLike() {
        return (List)readProperty("eipTTimelineLike");
    }
    
    
    public void addToEipTTodo(com.aimluck.eip.cayenne.om.portlet.EipTTodo obj) {
        addToManyTarget("eipTTodo", obj, true);
    }
    public void removeFromEipTTodo(com.aimluck.eip.cayenne.om.portlet.EipTTodo obj) {
        removeToManyTarget("eipTTodo", obj, true);
    }
    public List getEipTTodo() {
        return (List)readProperty("eipTTodo");
    }
    
    
    public void addToEipTTodoCategory(com.aimluck.eip.cayenne.om.portlet.EipTTodoCategory obj) {
        addToManyTarget("eipTTodoCategory", obj, true);
    }
    public void removeFromEipTTodoCategory(com.aimluck.eip.cayenne.om.portlet.EipTTodoCategory obj) {
        removeToManyTarget("eipTTodoCategory", obj, true);
    }
    public List getEipTTodoCategory() {
        return (List)readProperty("eipTTodoCategory");
    }
    
    
    public void addToEipTWorkflowRequest(com.aimluck.eip.cayenne.om.portlet.EipTWorkflowRequest obj) {
        addToManyTarget("eipTWorkflowRequest", obj, true);
    }
    public void removeFromEipTWorkflowRequest(com.aimluck.eip.cayenne.om.portlet.EipTWorkflowRequest obj) {
        removeToManyTarget("eipTWorkflowRequest", obj, true);
    }
    public List getEipTWorkflowRequest() {
        return (List)readProperty("eipTWorkflowRequest");
    }
    
    
    public void addToTurbineUserGroupRole(com.aimluck.eip.cayenne.om.security.TurbineUserGroupRole obj) {
        addToManyTarget("turbineUserGroupRole", obj, true);
    }
    public void removeFromTurbineUserGroupRole(com.aimluck.eip.cayenne.om.security.TurbineUserGroupRole obj) {
        removeToManyTarget("turbineUserGroupRole", obj, true);
    }
    public List getTurbineUserGroupRole() {
        return (List)readProperty("turbineUserGroupRole");
    }
    
    
}
