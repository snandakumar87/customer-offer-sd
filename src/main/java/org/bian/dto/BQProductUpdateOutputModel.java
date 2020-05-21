package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductUpdateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQProductUpdateInputModelProductInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductUpdateOutputModel
 */
public class BQProductUpdateOutputModel   {
  private BQProductUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQProductUpdateInputModelProductInstanceRecord productInstanceRecord = null;

  private String productUpdateActionTaskReference = null;

  private Object productUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productUpdateActionTaskReference
  **/

  public String getProductUpdateActionTaskReference() {
    return productUpdateActionTaskReference;
  }

  public void setProductUpdateActionTaskReference(String productUpdateActionTaskReference) {
    this.productUpdateActionTaskReference = productUpdateActionTaskReference;
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

