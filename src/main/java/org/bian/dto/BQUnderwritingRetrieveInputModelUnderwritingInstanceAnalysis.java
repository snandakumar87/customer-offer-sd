package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUnderwritingRetrieveInputModelUnderwritingInstanceAnalysis
 */
public class BQUnderwritingRetrieveInputModelUnderwritingInstanceAnalysis   {
  private String underwritingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return underwritingInstanceAnalysisReference
  **/

  public String getUnderwritingInstanceAnalysisReference() {
    return underwritingInstanceAnalysisReference;
  }

  public void setUnderwritingInstanceAnalysisReference(String underwritingInstanceAnalysisReference) {
    this.underwritingInstanceAnalysisReference = underwritingInstanceAnalysisReference;
  }


}

