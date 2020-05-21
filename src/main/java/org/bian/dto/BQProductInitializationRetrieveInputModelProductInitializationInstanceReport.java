package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductInitializationRetrieveInputModelProductInitializationInstanceReport
 */
public class BQProductInitializationRetrieveInputModelProductInitializationInstanceReport   {
  private String productInitializationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productInitializationInstanceReportReference
  **/

  public String getProductInitializationInstanceReportReference() {
    return productInitializationInstanceReportReference;
  }

  public void setProductInitializationInstanceReportReference(String productInitializationInstanceReportReference) {
    this.productInitializationInstanceReportReference = productInitializationInstanceReportReference;
  }


}

