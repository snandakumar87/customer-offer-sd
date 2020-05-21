package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralRetrieveInputModelCollateralInstanceAnalysis
 */
public class BQCollateralRetrieveInputModelCollateralInstanceAnalysis   {
  private String collateralInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return collateralInstanceAnalysisReference
  **/

  public String getCollateralInstanceAnalysisReference() {
    return collateralInstanceAnalysisReference;
  }

  public void setCollateralInstanceAnalysisReference(String collateralInstanceAnalysisReference) {
    this.collateralInstanceAnalysisReference = collateralInstanceAnalysisReference;
  }


}

