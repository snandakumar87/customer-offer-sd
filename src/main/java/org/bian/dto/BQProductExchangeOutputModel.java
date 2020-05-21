package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductExchangeOutputModel
 */
public class BQProductExchangeOutputModel   {
  private String productExchangeActionTaskReference = null;

  private Object productExchangeActionTaskRecord = null;

  private String productExchangeActionResponse = null;

  private String productInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product instance exchange service call 
   * @return productExchangeActionTaskReference
  **/

  public String getProductExchangeActionTaskReference() {
    return productExchangeActionTaskReference;
  }

  public void setProductExchangeActionTaskReference(String productExchangeActionTaskReference) {
    this.productExchangeActionTaskReference = productExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productExchangeActionTaskRecord
  **/

  public Object getProductExchangeActionTaskRecord() {
    return productExchangeActionTaskRecord;
  }

  public void setProductExchangeActionTaskRecord(Object productExchangeActionTaskRecord) {
    this.productExchangeActionTaskRecord = productExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return productExchangeActionResponse
  **/

  public String getProductExchangeActionResponse() {
    return productExchangeActionResponse;
  }

  public void setProductExchangeActionResponse(String productExchangeActionResponse) {
    this.productExchangeActionResponse = productExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product instance (e.g. accepted, rejected, verified) 
   * @return productInstanceStatus
  **/

  public String getProductInstanceStatus() {
    return productInstanceStatus;
  }

  public void setProductInstanceStatus(String productInstanceStatus) {
    this.productInstanceStatus = productInstanceStatus;
  }


}

