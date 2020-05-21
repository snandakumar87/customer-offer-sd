package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralUpdateInputModelCollateralInstanceRecord;
import org.bian.dto.BQCollateralUpdateInputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCollateralUpdateInputModel
 */
public class BQCollateralUpdateInputModel   {
  private BQCollateralUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureInstanceReference = null;

  private String collateralInstanceReference = null;

  private BQCollateralUpdateInputModelCollateralInstanceRecord collateralInstanceRecord = null;

  private Object collateralUpdateActionTaskRecord = null;

  private String collateralUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collateral instance 
   * @return collateralInstanceReference
  **/

  public String getCollateralInstanceReference() {
    return collateralInstanceReference;
  }

  public void setCollateralInstanceReference(String collateralInstanceReference) {
    this.collateralInstanceReference = collateralInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return collateralUpdateActionRequest
  **/

  public String getCollateralUpdateActionRequest() {
    return collateralUpdateActionRequest;
  }

  public void setCollateralUpdateActionRequest(String collateralUpdateActionRequest) {
    this.collateralUpdateActionRequest = collateralUpdateActionRequest;
  }


}

