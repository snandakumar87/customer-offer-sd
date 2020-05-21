package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAgreementUpdateInputModelAgreementInstanceRecord;
import org.bian.dto.BQAgreementUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAgreementUpdateOutputModel
 */
public class BQAgreementUpdateOutputModel   {
  private BQAgreementUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQAgreementUpdateInputModelAgreementInstanceRecord agreementInstanceRecord = null;

  private String agreementUpdateActionTaskReference = null;

  private Object agreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQAgreementUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQAgreementUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get agreementInstanceRecord
   * @return agreementInstanceRecord
  **/

  public BQAgreementUpdateInputModelAgreementInstanceRecord getAgreementInstanceRecord() {
    return agreementInstanceRecord;
  }

  public void setAgreementInstanceRecord(BQAgreementUpdateInputModelAgreementInstanceRecord agreementInstanceRecord) {
    this.agreementInstanceRecord = agreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return agreementUpdateActionTaskReference
  **/

  public String getAgreementUpdateActionTaskReference() {
    return agreementUpdateActionTaskReference;
  }

  public void setAgreementUpdateActionTaskReference(String agreementUpdateActionTaskReference) {
    this.agreementUpdateActionTaskReference = agreementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return agreementUpdateActionTaskRecord
  **/

  public Object getAgreementUpdateActionTaskRecord() {
    return agreementUpdateActionTaskRecord;
  }

  public void setAgreementUpdateActionTaskRecord(Object agreementUpdateActionTaskRecord) {
    this.agreementUpdateActionTaskRecord = agreementUpdateActionTaskRecord;
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

