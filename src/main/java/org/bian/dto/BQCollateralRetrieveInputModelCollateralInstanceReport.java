package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralRetrieveInputModelCollateralInstanceReport
 */
public class BQCollateralRetrieveInputModelCollateralInstanceReport   {
  private String collateralInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return collateralInstanceReportReference
  **/

  public String getCollateralInstanceReportReference() {
    return collateralInstanceReportReference;
  }

  public void setCollateralInstanceReportReference(String collateralInstanceReportReference) {
    this.collateralInstanceReportReference = collateralInstanceReportReference;
  }


}

