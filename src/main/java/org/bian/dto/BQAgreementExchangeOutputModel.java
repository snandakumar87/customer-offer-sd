package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAgreementExchangeOutputModel
 */
public class BQAgreementExchangeOutputModel   {
  private String agreementExchangeActionTaskReference = null;

  private Object agreementExchangeActionTaskRecord = null;

  private String agreementExchangeActionResponse = null;

  private String agreementInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Agreement instance exchange service call 
   * @return agreementExchangeActionTaskReference
  **/

  public String getAgreementExchangeActionTaskReference() {
    return agreementExchangeActionTaskReference;
  }

  public void setAgreementExchangeActionTaskReference(String agreementExchangeActionTaskReference) {
    this.agreementExchangeActionTaskReference = agreementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return agreementExchangeActionTaskRecord
  **/

  public Object getAgreementExchangeActionTaskRecord() {
    return agreementExchangeActionTaskRecord;
  }

  public void setAgreementExchangeActionTaskRecord(Object agreementExchangeActionTaskRecord) {
    this.agreementExchangeActionTaskRecord = agreementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return agreementExchangeActionResponse
  **/

  public String getAgreementExchangeActionResponse() {
    return agreementExchangeActionResponse;
  }

  public void setAgreementExchangeActionResponse(String agreementExchangeActionResponse) {
    this.agreementExchangeActionResponse = agreementExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Agreement instance (e.g. accepted, rejected, verified) 
   * @return agreementInstanceStatus
  **/

  public String getAgreementInstanceStatus() {
    return agreementInstanceStatus;
  }

  public void setAgreementInstanceStatus(String agreementInstanceStatus) {
    this.agreementInstanceStatus = agreementInstanceStatus;
  }


}

