package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTReportMemberMap was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTReportMemberMap extends org.apache.cayenne.CayenneDataObject {

    public static final String REPORT_ID_PROPERTY = "reportId";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String EIP_TREPORT_PROPERTY = "eipTReport";

    public static final String ID_PK_COLUMN = "ID";

    public void setReportId(Integer reportId) {
        writeProperty("reportId", reportId);
    }
    public Integer getReportId() {
        return (Integer)readProperty("reportId");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
    public void setEipTReport(com.aimluck.eip.cayenne.om.portlet.EipTReport eipTReport) {
        setToOneTarget("eipTReport", eipTReport, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTReport getEipTReport() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTReport)readProperty("eipTReport");
    } 
    
    
}
