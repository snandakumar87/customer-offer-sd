package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductInitializationRetrieveInputModelProductInitializationInstanceAnalysis
 */
public class BQProductInitializationRetrieveInputModelProductInitializationInstanceAnalysis   {
  private String productInitializationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productInitializationInstanceAnalysisReference
  **/

  public String getProductInitializationInstanceAnalysisReference() {
    return productInitializationInstanceAnalysisReference;
  }

  public void setProductInitializationInstanceAnalysisReference(String productInitializationInstanceAnalysisReference) {
    this.productInitializationInstanceAnalysisReference = productInitializationInstanceAnalysisReference;
  }


}

