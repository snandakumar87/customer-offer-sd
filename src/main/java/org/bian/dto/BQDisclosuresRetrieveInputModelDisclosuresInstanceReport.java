package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisclosuresRetrieveInputModelDisclosuresInstanceReport
 */
public class BQDisclosuresRetrieveInputModelDisclosuresInstanceReport   {
  private String disclosuresInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return disclosuresInstanceReportReference
  **/

  public String getDisclosuresInstanceReportReference() {
    return disclosuresInstanceReportReference;
  }

  public void setDisclosuresInstanceReportReference(String disclosuresInstanceReportReference) {
    this.disclosuresInstanceReportReference = disclosuresInstanceReportReference;
  }


}

