package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralUpdateInputModelCollateralInstanceRecord;
import org.bian.dto.BQCollateralUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCollateralUpdateOutputModel
 */
public class BQCollateralUpdateOutputModel   {
  private BQCollateralUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQCollateralUpdateInputModelCollateralInstanceRecord collateralInstanceRecord = null;

  private String collateralUpdateActionTaskReference = null;

  private Object collateralUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQCollateralUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQCollateralUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get collateralInstanceRecord
   * @return collateralInstanceRecord
  **/

  public BQCollateralUpdateInputModelCollateralInstanceRecord getCollateralInstanceRecord() {
    return collateralInstanceRecord;
  }

  public void setCollateralInstanceRecord(BQCollateralUpdateInputModelCollateralInstanceRecord collateralInstanceRecord) {
    this.collateralInstanceRecord = collateralInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return collateralUpdateActionTaskReference
  **/

  public String getCollateralUpdateActionTaskReference() {
    return collateralUpdateActionTaskReference;
  }

  public void setCollateralUpdateActionTaskReference(String collateralUpdateActionTaskReference) {
    this.collateralUpdateActionTaskReference = collateralUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return collateralUpdateActionTaskRecord
  **/

  public Object getCollateralUpdateActionTaskRecord() {
    return collateralUpdateActionTaskRecord;
  }

  public void setCollateralUpdateActionTaskRecord(Object collateralUpdateActionTaskRecord) {
    this.collateralUpdateActionTaskRecord = collateralUpdateActionTaskRecord;
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

