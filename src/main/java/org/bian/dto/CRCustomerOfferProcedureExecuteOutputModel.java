package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureExecuteOutputModel
 */
public class CRCustomerOfferProcedureExecuteOutputModel   {
  private CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureExecuteActionTaskReference = null;

  private Object customerOfferProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance execute service call 
   * @return customerOfferProcedureExecuteActionTaskReference
  **/

  public String getCustomerOfferProcedureExecuteActionTaskReference() {
    return customerOfferProcedureExecuteActionTaskReference;
  }

  public void setCustomerOfferProcedureExecuteActionTaskReference(String customerOfferProcedureExecuteActionTaskReference) {
    this.customerOfferProcedureExecuteActionTaskReference = customerOfferProcedureExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerOfferProcedureExecuteActionTaskRecord
  **/

  public Object getCustomerOfferProcedureExecuteActionTaskRecord() {
    return customerOfferProcedureExecuteActionTaskRecord;
  }

  public void setCustomerOfferProcedureExecuteActionTaskRecord(Object customerOfferProcedureExecuteActionTaskRecord) {
    this.customerOfferProcedureExecuteActionTaskRecord = customerOfferProcedureExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

