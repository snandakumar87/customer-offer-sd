package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductInitializationRetrieveOutputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQProductInitializationRetrieveOutputModelProductInitializationInstanceAnalysis;
import org.bian.dto.BQProductInitializationRetrieveOutputModelProductInitializationInstanceRecord;
import org.bian.dto.BQProductInitializationRetrieveOutputModelProductInitializationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductInitializationRetrieveOutputModel
 */
public class BQProductInitializationRetrieveOutputModel   {
  private BQProductInitializationRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQProductInitializationRetrieveOutputModelProductInitializationInstanceRecord productInitializationInstanceRecord = null;

  private String productInitializationRetrieveActionTaskReference = null;

  private Object productInitializationRetrieveActionTaskRecord = null;

  private String productInitializationRetrieveActionResponse = null;

  private BQProductInitializationRetrieveOutputModelProductInitializationInstanceReport productInitializationInstanceReport = null;

  private BQProductInitializationRetrieveOutputModelProductInitializationInstanceAnalysis productInitializationInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQProductInitializationRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQProductInitializationRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get productInitializationInstanceRecord
   * @return productInitializationInstanceRecord
  **/

  public BQProductInitializationRetrieveOutputModelProductInitializationInstanceRecord getProductInitializationInstanceRecord() {
    return productInitializationInstanceRecord;
  }

  public void setProductInitializationInstanceRecord(BQProductInitializationRetrieveOutputModelProductInitializationInstanceRecord productInitializationInstanceRecord) {
    this.productInitializationInstanceRecord = productInitializationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Initialization instance retrieve service call 
   * @return productInitializationRetrieveActionTaskReference
  **/

  public String getProductInitializationRetrieveActionTaskReference() {
    return productInitializationRetrieveActionTaskReference;
  }

  public void setProductInitializationRetrieveActionTaskReference(String productInitializationRetrieveActionTaskReference) {
    this.productInitializationRetrieveActionTaskReference = productInitializationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productInitializationRetrieveActionTaskRecord
  **/

  public Object getProductInitializationRetrieveActionTaskRecord() {
    return productInitializationRetrieveActionTaskRecord;
  }

  public void setProductInitializationRetrieveActionTaskRecord(Object productInitializationRetrieveActionTaskRecord) {
    this.productInitializationRetrieveActionTaskRecord = productInitializationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productInitializationRetrieveActionResponse
  **/

  public String getProductInitializationRetrieveActionResponse() {
    return productInitializationRetrieveActionResponse;
  }

  public void setProductInitializationRetrieveActionResponse(String productInitializationRetrieveActionResponse) {
    this.productInitializationRetrieveActionResponse = productInitializationRetrieveActionResponse;
  }


  /**
   * Get productInitializationInstanceReport
   * @return productInitializationInstanceReport
  **/

  public BQProductInitializationRetrieveOutputModelProductInitializationInstanceReport getProductInitializationInstanceReport() {
    return productInitializationInstanceReport;
  }

  public void setProductInitializationInstanceReport(BQProductInitializationRetrieveOutputModelProductInitializationInstanceReport productInitializationInstanceReport) {
    this.productInitializationInstanceReport = productInitializationInstanceReport;
  }


  /**
   * Get productInitializationInstanceAnalysis
   * @return productInitializationInstanceAnalysis
  **/

  public BQProductInitializationRetrieveOutputModelProductInitializationInstanceAnalysis getProductInitializationInstanceAnalysis() {
    return productInitializationInstanceAnalysis;
  }

  public void setProductInitializationInstanceAnalysis(BQProductInitializationRetrieveOutputModelProductInitializationInstanceAnalysis productInitializationInstanceAnalysis) {
    this.productInitializationInstanceAnalysis = productInitializationInstanceAnalysis;
  }


}

