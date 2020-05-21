package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceRetrieveInputModelComplianceInstanceReport
 */
public class BQComplianceRetrieveInputModelComplianceInstanceReport   {
  private String complianceInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return complianceInstanceReportReference
  **/

  public String getComplianceInstanceReportReference() {
    return complianceInstanceReportReference;
  }

  public void setComplianceInstanceReportReference(String complianceInstanceReportReference) {
    this.complianceInstanceReportReference = complianceInstanceReportReference;
  }


}

