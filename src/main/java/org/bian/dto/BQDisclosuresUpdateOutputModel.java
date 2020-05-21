package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQDisclosuresUpdateInputModelDisclosuresInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDisclosuresUpdateOutputModel
 */
public class BQDisclosuresUpdateOutputModel   {
  private BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQDisclosuresUpdateInputModelDisclosuresInstanceRecord disclosuresInstanceRecord = null;

  private String disclosuresUpdateActionTaskReference = null;

  private Object disclosuresUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return disclosuresUpdateActionTaskReference
  **/

  public String getDisclosuresUpdateActionTaskReference() {
    return disclosuresUpdateActionTaskReference;
  }

  public void setDisclosuresUpdateActionTaskReference(String disclosuresUpdateActionTaskReference) {
    this.disclosuresUpdateActionTaskReference = disclosuresUpdateActionTaskReference;
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

