package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorrespondenceandDocumentsUpdateInputModelCorrespondenceandDocumentsInstanceRecord;
import org.bian.dto.BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCorrespondenceandDocumentsUpdateInputModel
 */
public class BQCorrespondenceandDocumentsUpdateInputModel   {
  private BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String correspondenceandDocumentsInstanceReference = null;

  private BQCorrespondenceandDocumentsUpdateInputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord = null;

  private Object correspondenceandDocumentsUpdateActionTaskRecord = null;

  private String correspondenceandDocumentsUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


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
   * Get correspondenceandDocumentsInstanceRecord
   * @return correspondenceandDocumentsInstanceRecord
  **/

  public BQCorrespondenceandDocumentsUpdateInputModelCorrespondenceandDocumentsInstanceRecord getCorrespondenceandDocumentsInstanceRecord() {
    return correspondenceandDocumentsInstanceRecord;
  }

  public void setCorrespondenceandDocumentsInstanceRecord(BQCorrespondenceandDocumentsUpdateInputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord) {
    this.correspondenceandDocumentsInstanceRecord = correspondenceandDocumentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return correspondenceandDocumentsUpdateActionTaskRecord
  **/

  public Object getCorrespondenceandDocumentsUpdateActionTaskRecord() {
    return correspondenceandDocumentsUpdateActionTaskRecord;
  }

  public void setCorrespondenceandDocumentsUpdateActionTaskRecord(Object correspondenceandDocumentsUpdateActionTaskRecord) {
    this.correspondenceandDocumentsUpdateActionTaskRecord = correspondenceandDocumentsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return correspondenceandDocumentsUpdateActionRequest
  **/

  public String getCorrespondenceandDocumentsUpdateActionRequest() {
    return correspondenceandDocumentsUpdateActionRequest;
  }

  public void setCorrespondenceandDocumentsUpdateActionRequest(String correspondenceandDocumentsUpdateActionRequest) {
    this.correspondenceandDocumentsUpdateActionRequest = correspondenceandDocumentsUpdateActionRequest;
  }


}

