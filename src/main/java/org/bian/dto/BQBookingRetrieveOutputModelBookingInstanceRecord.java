package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBookingRetrieveOutputModelBookingInstanceRecord
 */
public class BQBookingRetrieveOutputModelBookingInstanceRecord   {
  private String businessUnitReference = null;

  private String assetLiabilityType = null;

  private String amount = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Defines the booking entity 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the booking rules (e.g. booking value ratios) 
   * @return assetLiabilityType
  **/

  public String getAssetLiabilityType() {
    return assetLiabilityType;
  }

  public void setAssetLiabilityType(String assetLiabilityType) {
    this.assetLiabilityType = assetLiabilityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The principle amount for booking 
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


}

