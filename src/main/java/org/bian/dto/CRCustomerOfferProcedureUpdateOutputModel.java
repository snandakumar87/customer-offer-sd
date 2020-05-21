package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureUpdateOutputModel
 */
public class CRCustomerOfferProcedureUpdateOutputModel   {
  private CRCustomerOfferProcedureUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureUpdateActionTaskReference = null;

  private Object customerOfferProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public CRCustomerOfferProcedureUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CRCustomerOfferProcedureUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerOfferProcedureUpdateActionTaskReference
  **/

  public String getCustomerOfferProcedureUpdateActionTaskReference() {
    return customerOfferProcedureUpdateActionTaskReference;
  }

  public void setCustomerOfferProcedureUpdateActionTaskReference(String customerOfferProcedureUpdateActionTaskReference) {
    this.customerOfferProcedureUpdateActionTaskReference = customerOfferProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerOfferProcedureUpdateActionTaskRecord
  **/

  public Object getCustomerOfferProcedureUpdateActionTaskRecord() {
    return customerOfferProcedureUpdateActionTaskRecord;
  }

  public void setCustomerOfferProcedureUpdateActionTaskRecord(Object customerOfferProcedureUpdateActionTaskRecord) {
    this.customerOfferProcedureUpdateActionTaskRecord = customerOfferProcedureUpdateActionTaskRecord;
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

