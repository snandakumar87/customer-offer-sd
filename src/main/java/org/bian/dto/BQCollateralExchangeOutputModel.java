package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCollateralExchangeOutputModel
 */
public class BQCollateralExchangeOutputModel   {
  private String collateralExchangeActionTaskReference = null;

  private Object collateralExchangeActionTaskRecord = null;

  private String collateralExchangeActionResponse = null;

  private String collateralInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral instance exchange service call 
   * @return collateralExchangeActionTaskReference
  **/

  public String getCollateralExchangeActionTaskReference() {
    return collateralExchangeActionTaskReference;
  }

  public void setCollateralExchangeActionTaskReference(String collateralExchangeActionTaskReference) {
    this.collateralExchangeActionTaskReference = collateralExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return collateralExchangeActionTaskRecord
  **/

  public Object getCollateralExchangeActionTaskRecord() {
    return collateralExchangeActionTaskRecord;
  }

  public void setCollateralExchangeActionTaskRecord(Object collateralExchangeActionTaskRecord) {
    this.collateralExchangeActionTaskRecord = collateralExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return collateralExchangeActionResponse
  **/

  public String getCollateralExchangeActionResponse() {
    return collateralExchangeActionResponse;
  }

  public void setCollateralExchangeActionResponse(String collateralExchangeActionResponse) {
    this.collateralExchangeActionResponse = collateralExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Collateral instance (e.g. accepted, rejected, verified) 
   * @return collateralInstanceStatus
  **/

  public String getCollateralInstanceStatus() {
    return collateralInstanceStatus;
  }

  public void setCollateralInstanceStatus(String collateralInstanceStatus) {
    this.collateralInstanceStatus = collateralInstanceStatus;
  }


}

