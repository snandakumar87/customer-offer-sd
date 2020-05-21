package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUnderwritingRetrieveInputModelUnderwritingInstanceReport
 */
public class BQUnderwritingRetrieveInputModelUnderwritingInstanceReport   {
  private String underwritingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return underwritingInstanceReportReference
  **/

  public String getUnderwritingInstanceReportReference() {
    return underwritingInstanceReportReference;
  }

  public void setUnderwritingInstanceReportReference(String underwritingInstanceReportReference) {
    this.underwritingInstanceReportReference = underwritingInstanceReportReference;
  }


}

