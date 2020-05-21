package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQComplianceUpdateInputModelComplianceInstanceRecord;
import org.bian.dto.BQComplianceUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQComplianceUpdateOutputModel
 */
public class BQComplianceUpdateOutputModel   {
  private BQComplianceUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQComplianceUpdateInputModelComplianceInstanceRecord complianceInstanceRecord = null;

  private String complianceUpdateActionTaskReference = null;

  private Object complianceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return complianceUpdateActionTaskReference
  **/

  public String getComplianceUpdateActionTaskReference() {
    return complianceUpdateActionTaskReference;
  }

  public void setComplianceUpdateActionTaskReference(String complianceUpdateActionTaskReference) {
    this.complianceUpdateActionTaskReference = complianceUpdateActionTaskReference;
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

