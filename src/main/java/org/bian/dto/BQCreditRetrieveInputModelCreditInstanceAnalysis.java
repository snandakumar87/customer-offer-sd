package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditRetrieveInputModelCreditInstanceAnalysis
 */
public class BQCreditRetrieveInputModelCreditInstanceAnalysis   {
  private String creditInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return creditInstanceAnalysisReference
  **/

  public String getCreditInstanceAnalysisReference() {
    return creditInstanceAnalysisReference;
  }

  public void setCreditInstanceAnalysisReference(String creditInstanceAnalysisReference) {
    this.creditInstanceAnalysisReference = creditInstanceAnalysisReference;
  }


}

