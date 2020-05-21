package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuditRetrieveInputModelAuditInstanceReport
 */
public class BQAuditRetrieveInputModelAuditInstanceReport   {
  private String auditInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return auditInstanceReportReference
  **/

  public String getAuditInstanceReportReference() {
    return auditInstanceReportReference;
  }

  public void setAuditInstanceReportReference(String auditInstanceReportReference) {
    this.auditInstanceReportReference = auditInstanceReportReference;
  }


}

