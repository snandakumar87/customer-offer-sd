package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQCorrespondenceandDocumentsExchangeInputModel
 */
public class BQCorrespondenceandDocumentsExchangeInputModel   {
  private String customerOfferProcedureInstanceReference = null;

  private String correspondenceandDocumentsInstanceReference = null;

  private Object correspondenceandDocumentsExchangeActionTaskRecord = null;

  private CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest correspondenceandDocumentsExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/

  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Correspondence and Documents instance 
   * @return correspondenceandDocumentsInstanceReference
  **/

  public String getCorrespondenceandDocumentsInstanceReference() {
    return correspondenceandDocumentsInstanceReference;
  }

  public void setCorrespondenceandDocumentsInstanceReference(String correspondenceandDocumentsInstanceReference) {
    this.correspondenceandDocumentsInstanceReference = correspondenceandDocumentsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return correspondenceandDocumentsExchangeActionTaskRecord
  **/

  public Object getCorrespondenceandDocumentsExchangeActionTaskRecord() {
    return correspondenceandDocumentsExchangeActionTaskRecord;
  }

  public void setCorrespondenceandDocumentsExchangeActionTaskRecord(Object correspondenceandDocumentsExchangeActionTaskRecord) {
    this.correspondenceandDocumentsExchangeActionTaskRecord = correspondenceandDocumentsExchangeActionTaskRecord;
  }


  /**
   * Get correspondenceandDocumentsExchangeActionRequest
   * @return correspondenceandDocumentsExchangeActionRequest
  **/

  public CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest getCorrespondenceandDocumentsExchangeActionRequest() {
    return correspondenceandDocumentsExchangeActionRequest;
  }

  public void setCorrespondenceandDocumentsExchangeActionRequest(CRCustomerOfferProcedureExchangeInputModelCustomerOfferProcedureExchangeActionRequest correspondenceandDocumentsExchangeActionRequest) {
    this.correspondenceandDocumentsExchangeActionRequest = correspondenceandDocumentsExchangeActionRequest;
  }


}

