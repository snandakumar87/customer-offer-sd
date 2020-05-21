package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceRetrieveInputModelComplianceInstanceAnalysis
 */
public class BQComplianceRetrieveInputModelComplianceInstanceAnalysis   {
  private String complianceInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return complianceInstanceAnalysisReference
  **/

  public String getComplianceInstanceAnalysisReference() {
    return complianceInstanceAnalysisReference;
  }

  public void setComplianceInstanceAnalysisReference(String complianceInstanceAnalysisReference) {
    this.complianceInstanceAnalysisReference = complianceInstanceAnalysisReference;
  }


}

