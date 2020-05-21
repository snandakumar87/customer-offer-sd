package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisclosuresExchangeOutputModel
 */
public class BQDisclosuresExchangeOutputModel   {
  private String disclosuresExchangeActionTaskReference = null;

  private Object disclosuresExchangeActionTaskRecord = null;

  private String disclosuresExchangeActionResponse = null;

  private String disclosuresInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disclosures instance exchange service call 
   * @return disclosuresExchangeActionTaskReference
  **/

  public String getDisclosuresExchangeActionTaskReference() {
    return disclosuresExchangeActionTaskReference;
  }

  public void setDisclosuresExchangeActionTaskReference(String disclosuresExchangeActionTaskReference) {
    this.disclosuresExchangeActionTaskReference = disclosuresExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return disclosuresExchangeActionTaskRecord
  **/

  public Object getDisclosuresExchangeActionTaskRecord() {
    return disclosuresExchangeActionTaskRecord;
  }

  public void setDisclosuresExchangeActionTaskRecord(Object disclosuresExchangeActionTaskRecord) {
    this.disclosuresExchangeActionTaskRecord = disclosuresExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return disclosuresExchangeActionResponse
  **/

  public String getDisclosuresExchangeActionResponse() {
    return disclosuresExchangeActionResponse;
  }

  public void setDisclosuresExchangeActionResponse(String disclosuresExchangeActionResponse) {
    this.disclosuresExchangeActionResponse = disclosuresExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Disclosures instance (e.g. accepted, rejected, verified) 
   * @return disclosuresInstanceStatus
  **/

  public String getDisclosuresInstanceStatus() {
    return disclosuresInstanceStatus;
  }

  public void setDisclosuresInstanceStatus(String disclosuresInstanceStatus) {
    this.disclosuresInstanceStatus = disclosuresInstanceStatus;
  }


}

