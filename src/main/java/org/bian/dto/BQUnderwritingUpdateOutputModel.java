package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUnderwritingUpdateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQUnderwritingUpdateInputModelUnderwritingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUnderwritingUpdateOutputModel
 */
public class BQUnderwritingUpdateOutputModel   {
  private BQUnderwritingUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQUnderwritingUpdateInputModelUnderwritingInstanceRecord underwritingInstanceRecord = null;

  private String underwritingUpdateActionTaskReference = null;

  private Object underwritingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQUnderwritingUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQUnderwritingUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get underwritingInstanceRecord
   * @return underwritingInstanceRecord
  **/

  public BQUnderwritingUpdateInputModelUnderwritingInstanceRecord getUnderwritingInstanceRecord() {
    return underwritingInstanceRecord;
  }

  public void setUnderwritingInstanceRecord(BQUnderwritingUpdateInputModelUnderwritingInstanceRecord underwritingInstanceRecord) {
    this.underwritingInstanceRecord = underwritingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return underwritingUpdateActionTaskReference
  **/

  public String getUnderwritingUpdateActionTaskReference() {
    return underwritingUpdateActionTaskReference;
  }

  public void setUnderwritingUpdateActionTaskReference(String underwritingUpdateActionTaskReference) {
    this.underwritingUpdateActionTaskReference = underwritingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return underwritingUpdateActionTaskRecord
  **/

  public Object getUnderwritingUpdateActionTaskRecord() {
    return underwritingUpdateActionTaskRecord;
  }

  public void setUnderwritingUpdateActionTaskRecord(Object underwritingUpdateActionTaskRecord) {
    this.underwritingUpdateActionTaskRecord = underwritingUpdateActionTaskRecord;
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

