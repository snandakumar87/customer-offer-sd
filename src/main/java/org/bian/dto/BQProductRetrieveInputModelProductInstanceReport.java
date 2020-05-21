package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductRetrieveInputModelProductInstanceReport
 */
public class BQProductRetrieveInputModelProductInstanceReport   {
  private String productInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productInstanceReportReference
  **/

  public String getProductInstanceReportReference() {
    return productInstanceReportReference;
  }

  public void setProductInstanceReportReference(String productInstanceReportReference) {
    this.productInstanceReportReference = productInstanceReportReference;
  }


}

