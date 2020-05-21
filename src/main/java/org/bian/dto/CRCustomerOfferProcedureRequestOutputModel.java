package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureRequestOutputModel
 */
public class CRCustomerOfferProcedureRequestOutputModel   {
  private CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureRequestActionTaskReference = null;

  private Object customerOfferProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance request service call 
   * @return customerOfferProcedureRequestActionTaskReference
  **/

  public String getCustomerOfferProcedureRequestActionTaskReference() {
    return customerOfferProcedureRequestActionTaskReference;
  }

  public void setCustomerOfferProcedureRequestActionTaskReference(String customerOfferProcedureRequestActionTaskReference) {
    this.customerOfferProcedureRequestActionTaskReference = customerOfferProcedureRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

