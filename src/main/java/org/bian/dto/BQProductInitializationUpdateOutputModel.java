package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductInitializationUpdateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQProductInitializationUpdateInputModelProductInitializationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductInitializationUpdateOutputModel
 */
public class BQProductInitializationUpdateOutputModel   {
  private BQProductInitializationUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQProductInitializationUpdateInputModelProductInitializationInstanceRecord productInitializationInstanceRecord = null;

  private String productInitializationUpdateActionTaskReference = null;

  private Object productInitializationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productInitializationUpdateActionTaskReference
  **/

  public String getProductInitializationUpdateActionTaskReference() {
    return productInitializationUpdateActionTaskReference;
  }

  public void setProductInitializationUpdateActionTaskReference(String productInitializationUpdateActionTaskReference) {
    this.productInitializationUpdateActionTaskReference = productInitializationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

