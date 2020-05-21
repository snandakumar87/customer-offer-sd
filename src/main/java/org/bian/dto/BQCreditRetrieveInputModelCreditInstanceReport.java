package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditRetrieveInputModelCreditInstanceReport
 */
public class BQCreditRetrieveInputModelCreditInstanceReport   {
  private String creditInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditInstanceReportReference
  **/

  public String getCreditInstanceReportReference() {
    return creditInstanceReportReference;
  }

  public void setCreditInstanceReportReference(String creditInstanceReportReference) {
    this.creditInstanceReportReference = creditInstanceReportReference;
  }


}

