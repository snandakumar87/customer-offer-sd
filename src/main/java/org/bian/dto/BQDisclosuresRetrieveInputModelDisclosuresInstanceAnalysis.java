package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisclosuresRetrieveInputModelDisclosuresInstanceAnalysis
 */
public class BQDisclosuresRetrieveInputModelDisclosuresInstanceAnalysis   {
  private String disclosuresInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return disclosuresInstanceAnalysisReference
  **/

  public String getDisclosuresInstanceAnalysisReference() {
    return disclosuresInstanceAnalysisReference;
  }

  public void setDisclosuresInstanceAnalysisReference(String disclosuresInstanceAnalysisReference) {
    this.disclosuresInstanceAnalysisReference = disclosuresInstanceAnalysisReference;
  }


}

