package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditUpdateInputModelCreditInstanceRecord;
import org.bian.dto.BQCreditUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCreditUpdateOutputModel
 */
public class BQCreditUpdateOutputModel   {
  private BQCreditUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQCreditUpdateInputModelCreditInstanceRecord creditInstanceRecord = null;

  private String creditUpdateActionTaskReference = null;

  private Object creditUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQCreditUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQCreditUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get creditInstanceRecord
   * @return creditInstanceRecord
  **/

  public BQCreditUpdateInputModelCreditInstanceRecord getCreditInstanceRecord() {
    return creditInstanceRecord;
  }

  public void setCreditInstanceRecord(BQCreditUpdateInputModelCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return creditUpdateActionTaskReference
  **/

  public String getCreditUpdateActionTaskReference() {
    return creditUpdateActionTaskReference;
  }

  public void setCreditUpdateActionTaskReference(String creditUpdateActionTaskReference) {
    this.creditUpdateActionTaskReference = creditUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditUpdateActionTaskRecord
  **/

  public Object getCreditUpdateActionTaskRecord() {
    return creditUpdateActionTaskRecord;
  }

  public void setCreditUpdateActionTaskRecord(Object creditUpdateActionTaskRecord) {
    this.creditUpdateActionTaskRecord = creditUpdateActionTaskRecord;
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

