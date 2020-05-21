package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUnderwritingUpdateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQUnderwritingUpdateInputModelUnderwritingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUnderwritingUpdateInputModel
 */
public class BQUnderwritingUpdateInputModel   {
  private BQUnderwritingUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String underwritingInstanceReference = null;

  private BQUnderwritingUpdateInputModelUnderwritingInstanceRecord underwritingInstanceRecord = null;

  private Object underwritingUpdateActionTaskRecord = null;

  private String underwritingUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQUnderwritingUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQUnderwritingUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Underwriting instance 
   * @return underwritingInstanceReference
  **/

  public String getUnderwritingInstanceReference() {
    return underwritingInstanceReference;
  }

  public void setUnderwritingInstanceReference(String underwritingInstanceReference) {
    this.underwritingInstanceReference = underwritingInstanceReference;
  }


  /**
   * Get underwritingInstanceRecord
   * @return underwritingInstanceRecord
  **/

  public BQUnderwritingUpdateInputModelUnderwritingInstanceRecord getUnderwritingInstanceRecord() {
    return underwritingInstanceRecord;
  }

  public void setUnderwritingInstanceRecord(BQUnderwritingUpdateInputModelUnderwritingInstanceRecord underwritingInstanceRecord) {
    this.underwritingInstanceRecord = underwritingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return underwritingUpdateActionTaskRecord
  **/

  public Object getUnderwritingUpdateActionTaskRecord() {
    return underwritingUpdateActionTaskRecord;
  }

  public void setUnderwritingUpdateActionTaskRecord(Object underwritingUpdateActionTaskRecord) {
    this.underwritingUpdateActionTaskRecord = underwritingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return underwritingUpdateActionRequest
  **/

  public String getUnderwritingUpdateActionRequest() {
    return underwritingUpdateActionRequest;
  }

  public void setUnderwritingUpdateActionRequest(String underwritingUpdateActionRequest) {
    this.underwritingUpdateActionRequest = underwritingUpdateActionRequest;
  }


}

