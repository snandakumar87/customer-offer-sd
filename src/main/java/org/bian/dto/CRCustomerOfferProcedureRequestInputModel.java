package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureRequestInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureRequestInputModel
 */
public class CRCustomerOfferProcedureRequestInputModel   {
  private String customerOfferServicingSessionReference = null;

  private String customerOfferProcedureInstanceReference = null;

  private CRCustomerOfferProcedureRequestInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private Object customerOfferProcedureRequestActionTaskRecord = null;

  private CRCustomerOfferProcedureRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerOfferServicingSessionReference
  **/

  public String getCustomerOfferServicingSessionReference() {
    return customerOfferServicingSessionReference;
  }

  public void setCustomerOfferServicingSessionReference(String customerOfferServicingSessionReference) {
    this.customerOfferServicingSessionReference = customerOfferServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/

  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public CRCustomerOfferProcedureRequestInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CRCustomerOfferProcedureRequestInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerOfferProcedureRequestActionTaskRecord
  **/

  public Object getCustomerOfferProcedureRequestActionTaskRecord() {
    return customerOfferProcedureRequestActionTaskRecord;
  }

  public void setCustomerOfferProcedureRequestActionTaskRecord(Object customerOfferProcedureRequestActionTaskRecord) {
    this.customerOfferProcedureRequestActionTaskRecord = customerOfferProcedureRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerOfferProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerOfferProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

