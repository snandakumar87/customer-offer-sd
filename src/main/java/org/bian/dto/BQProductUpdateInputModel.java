package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductUpdateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQProductUpdateInputModelProductInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductUpdateInputModel
 */
public class BQProductUpdateInputModel   {
  private BQProductUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String productInstanceReference = null;

  private BQProductUpdateInputModelProductInstanceRecord productInstanceRecord = null;

  private Object productUpdateActionTaskRecord = null;

  private String productUpdateActionRequest = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQProductUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQProductUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * Get productInstanceRecord
   * @return productInstanceRecord
  **/

  public BQProductUpdateInputModelProductInstanceRecord getProductInstanceRecord() {
    return productInstanceRecord;
  }

  public void setProductInstanceRecord(BQProductUpdateInputModelProductInstanceRecord productInstanceRecord) {
    this.productInstanceRecord = productInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productUpdateActionTaskRecord
  **/

  public Object getProductUpdateActionTaskRecord() {
    return productUpdateActionTaskRecord;
  }

  public void setProductUpdateActionTaskRecord(Object productUpdateActionTaskRecord) {
    this.productUpdateActionTaskRecord = productUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productUpdateActionRequest
  **/

  public String getProductUpdateActionRequest() {
    return productUpdateActionRequest;
  }

  public void setProductUpdateActionRequest(String productUpdateActionRequest) {
    this.productUpdateActionRequest = productUpdateActionRequest;
  }


}

