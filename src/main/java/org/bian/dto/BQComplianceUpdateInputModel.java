package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQComplianceUpdateInputModelComplianceInstanceRecord;
import org.bian.dto.BQComplianceUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQComplianceUpdateInputModel
 */
public class BQComplianceUpdateInputModel   {
  private BQComplianceUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String complianceInstanceReference = null;

  private BQComplianceUpdateInputModelComplianceInstanceRecord complianceInstanceRecord = null;

  private Object complianceUpdateActionTaskRecord = null;

  private String complianceUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQComplianceUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQComplianceUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Compliance instance 
   * @return complianceInstanceReference
  **/

  public String getComplianceInstanceReference() {
    return complianceInstanceReference;
  }

  public void setComplianceInstanceReference(String complianceInstanceReference) {
    this.complianceInstanceReference = complianceInstanceReference;
  }


  /**
   * Get complianceInstanceRecord
   * @return complianceInstanceRecord
  **/

  public BQComplianceUpdateInputModelComplianceInstanceRecord getComplianceInstanceRecord() {
    return complianceInstanceRecord;
  }

  public void setComplianceInstanceRecord(BQComplianceUpdateInputModelComplianceInstanceRecord complianceInstanceRecord) {
    this.complianceInstanceRecord = complianceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return complianceUpdateActionTaskRecord
  **/

  public Object getComplianceUpdateActionTaskRecord() {
    return complianceUpdateActionTaskRecord;
  }

  public void setComplianceUpdateActionTaskRecord(Object complianceUpdateActionTaskRecord) {
    this.complianceUpdateActionTaskRecord = complianceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return complianceUpdateActionRequest
  **/

  public String getComplianceUpdateActionRequest() {
    return complianceUpdateActionRequest;
  }

  public void setComplianceUpdateActionRequest(String complianceUpdateActionRequest) {
    this.complianceUpdateActionRequest = complianceUpdateActionRequest;
  }


}

