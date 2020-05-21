package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureRetrieveOutputModel
 */
public class CRCustomerOfferProcedureRetrieveOutputModel   {
  private CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private String customerOfferProcedureRetrieveActionTaskReference = null;

  private Object customerOfferProcedureRetrieveActionTaskRecord = null;

  private String customerOfferProcedureRetrieveActionResponse = null;

  private CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceReportRecord customerOfferProcedureInstanceReportRecord = null;

  private CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceAnalysis customerOfferProcedureInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance retrieve service call 
   * @return customerOfferProcedureRetrieveActionTaskReference
  **/

  public String getCustomerOfferProcedureRetrieveActionTaskReference() {
    return customerOfferProcedureRetrieveActionTaskReference;
  }

  public void setCustomerOfferProcedureRetrieveActionTaskReference(String customerOfferProcedureRetrieveActionTaskReference) {
    this.customerOfferProcedureRetrieveActionTaskReference = customerOfferProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerOfferProcedureRetrieveActionTaskRecord
  **/

  public Object getCustomerOfferProcedureRetrieveActionTaskRecord() {
    return customerOfferProcedureRetrieveActionTaskRecord;
  }

  public void setCustomerOfferProcedureRetrieveActionTaskRecord(Object customerOfferProcedureRetrieveActionTaskRecord) {
    this.customerOfferProcedureRetrieveActionTaskRecord = customerOfferProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerOfferProcedureRetrieveActionResponse
  **/

  public String getCustomerOfferProcedureRetrieveActionResponse() {
    return customerOfferProcedureRetrieveActionResponse;
  }

  public void setCustomerOfferProcedureRetrieveActionResponse(String customerOfferProcedureRetrieveActionResponse) {
    this.customerOfferProcedureRetrieveActionResponse = customerOfferProcedureRetrieveActionResponse;
  }


  /**
   * Get customerOfferProcedureInstanceReportRecord
   * @return customerOfferProcedureInstanceReportRecord
  **/

  public CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceReportRecord getCustomerOfferProcedureInstanceReportRecord() {
    return customerOfferProcedureInstanceReportRecord;
  }

  public void setCustomerOfferProcedureInstanceReportRecord(CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceReportRecord customerOfferProcedureInstanceReportRecord) {
    this.customerOfferProcedureInstanceReportRecord = customerOfferProcedureInstanceReportRecord;
  }


  /**
   * Get customerOfferProcedureInstanceAnalysis
   * @return customerOfferProcedureInstanceAnalysis
  **/

  public CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceAnalysis getCustomerOfferProcedureInstanceAnalysis() {
    return customerOfferProcedureInstanceAnalysis;
  }

  public void setCustomerOfferProcedureInstanceAnalysis(CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceAnalysis customerOfferProcedureInstanceAnalysis) {
    this.customerOfferProcedureInstanceAnalysis = customerOfferProcedureInstanceAnalysis;
  }


}

