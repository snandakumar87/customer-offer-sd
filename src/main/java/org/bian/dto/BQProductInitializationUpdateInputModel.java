package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductInitializationUpdateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQProductInitializationUpdateInputModelProductInitializationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductInitializationUpdateInputModel
 */
public class BQProductInitializationUpdateInputModel   {
  private BQProductInitializationUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String productInitializationInstanceReference = null;

  private BQProductInitializationUpdateInputModelProductInitializationInstanceRecord productInitializationInstanceRecord = null;

  private Object productInitializationUpdateActionTaskRecord = null;

  private String productInitializationUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQProductInitializationUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQProductInitializationUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Initialization instance 
   * @return productInitializationInstanceReference
  **/

  public String getProductInitializationInstanceReference() {
    return productInitializationInstanceReference;
  }

  public void setProductInitializationInstanceReference(String productInitializationInstanceReference) {
    this.productInitializationInstanceReference = productInitializationInstanceReference;
  }


  /**
   * Get productInitializationInstanceRecord
   * @return productInitializationInstanceRecord
  **/

  public BQProductInitializationUpdateInputModelProductInitializationInstanceRecord getProductInitializationInstanceRecord() {
    return productInitializationInstanceRecord;
  }

  public void setProductInitializationInstanceRecord(BQProductInitializationUpdateInputModelProductInitializationInstanceRecord productInitializationInstanceRecord) {
    this.productInitializationInstanceRecord = productInitializationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productInitializationUpdateActionTaskRecord
  **/

  public Object getProductInitializationUpdateActionTaskRecord() {
    return productInitializationUpdateActionTaskRecord;
  }

  public void setProductInitializationUpdateActionTaskRecord(Object productInitializationUpdateActionTaskRecord) {
    this.productInitializationUpdateActionTaskRecord = productInitializationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productInitializationUpdateActionRequest
  **/

  public String getProductInitializationUpdateActionRequest() {
    return productInitializationUpdateActionRequest;
  }

  public void setProductInitializationUpdateActionRequest(String productInitializationUpdateActionRequest) {
    this.productInitializationUpdateActionRequest = productInitializationUpdateActionRequest;
  }


}

