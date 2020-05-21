package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAgreementRetrieveInputModelAgreementInstanceAnalysis
 */
public class BQAgreementRetrieveInputModelAgreementInstanceAnalysis   {
  private String agreementInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return agreementInstanceAnalysisReference
  **/

  public String getAgreementInstanceAnalysisReference() {
    return agreementInstanceAnalysisReference;
  }

  public void setAgreementInstanceAnalysisReference(String agreementInstanceAnalysisReference) {
    this.agreementInstanceAnalysisReference = agreementInstanceAnalysisReference;
  }


}

