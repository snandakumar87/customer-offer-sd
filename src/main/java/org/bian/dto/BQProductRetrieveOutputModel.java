package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductRetrieveOutputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQProductRetrieveOutputModelProductInstanceAnalysis;
import org.bian.dto.BQProductRetrieveOutputModelProductInstanceReport;
import org.bian.dto.BQProductUpdateInputModelProductInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductRetrieveOutputModel
 */
public class BQProductRetrieveOutputModel   {
  private BQProductRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQProductUpdateInputModelProductInstanceRecord productInstanceRecord = null;

  private String productRetrieveActionTaskReference = null;

  private Object productRetrieveActionTaskRecord = null;

  private String productRetrieveActionResponse = null;

  private BQProductRetrieveOutputModelProductInstanceReport productInstanceReport = null;

  private BQProductRetrieveOutputModelProductInstanceAnalysis productInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQProductRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQProductRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product instance retrieve service call 
   * @return productRetrieveActionTaskReference
  **/

  public String getProductRetrieveActionTaskReference() {
    return productRetrieveActionTaskReference;
  }

  public void setProductRetrieveActionTaskReference(String productRetrieveActionTaskReference) {
    this.productRetrieveActionTaskReference = productRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productRetrieveActionTaskRecord
  **/

  public Object getProductRetrieveActionTaskRecord() {
    return productRetrieveActionTaskRecord;
  }

  public void setProductRetrieveActionTaskRecord(Object productRetrieveActionTaskRecord) {
    this.productRetrieveActionTaskRecord = productRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productRetrieveActionResponse
  **/

  public String getProductRetrieveActionResponse() {
    return productRetrieveActionResponse;
  }

  public void setProductRetrieveActionResponse(String productRetrieveActionResponse) {
    this.productRetrieveActionResponse = productRetrieveActionResponse;
  }


  /**
   * Get productInstanceReport
   * @return productInstanceReport
  **/

  public BQProductRetrieveOutputModelProductInstanceReport getProductInstanceReport() {
    return productInstanceReport;
  }

  public void setProductInstanceReport(BQProductRetrieveOutputModelProductInstanceReport productInstanceReport) {
    this.productInstanceReport = productInstanceReport;
  }


  /**
   * Get productInstanceAnalysis
   * @return productInstanceAnalysis
  **/

  public BQProductRetrieveOutputModelProductInstanceAnalysis getProductInstanceAnalysis() {
    return productInstanceAnalysis;
  }

  public void setProductInstanceAnalysis(BQProductRetrieveOutputModelProductInstanceAnalysis productInstanceAnalysis) {
    this.productInstanceAnalysis = productInstanceAnalysis;
  }


}

