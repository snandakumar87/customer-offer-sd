package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQDisclosuresUpdateInputModelDisclosuresInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDisclosuresUpdateInputModel
 */
public class BQDisclosuresUpdateInputModel   {
  private BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String disclosuresInstanceReference = null;

  private BQDisclosuresUpdateInputModelDisclosuresInstanceRecord disclosuresInstanceRecord = null;

  private Object disclosuresUpdateActionTaskRecord = null;

  private String disclosuresUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Disclosures instance 
   * @return disclosuresInstanceReference
  **/

  public String getDisclosuresInstanceReference() {
    return disclosuresInstanceReference;
  }

  public void setDisclosuresInstanceReference(String disclosuresInstanceReference) {
    this.disclosuresInstanceReference = disclosuresInstanceReference;
  }


  /**
   * Get disclosuresInstanceRecord
   * @return disclosuresInstanceRecord
  **/

  public BQDisclosuresUpdateInputModelDisclosuresInstanceRecord getDisclosuresInstanceRecord() {
    return disclosuresInstanceRecord;
  }

  public void setDisclosuresInstanceRecord(BQDisclosuresUpdateInputModelDisclosuresInstanceRecord disclosuresInstanceRecord) {
    this.disclosuresInstanceRecord = disclosuresInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return disclosuresUpdateActionTaskRecord
  **/

  public Object getDisclosuresUpdateActionTaskRecord() {
    return disclosuresUpdateActionTaskRecord;
  }

  public void setDisclosuresUpdateActionTaskRecord(Object disclosuresUpdateActionTaskRecord) {
    this.disclosuresUpdateActionTaskRecord = disclosuresUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return disclosuresUpdateActionRequest
  **/

  public String getDisclosuresUpdateActionRequest() {
    return disclosuresUpdateActionRequest;
  }

  public void setDisclosuresUpdateActionRequest(String disclosuresUpdateActionRequest) {
    this.disclosuresUpdateActionRequest = disclosuresUpdateActionRequest;
  }


}

