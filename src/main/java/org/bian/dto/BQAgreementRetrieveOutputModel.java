package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAgreementRetrieveOutputModelAgreementInstanceAnalysis;
import org.bian.dto.BQAgreementRetrieveOutputModelAgreementInstanceRecord;
import org.bian.dto.BQAgreementRetrieveOutputModelAgreementInstanceReport;
import org.bian.dto.BQAgreementRetrieveOutputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAgreementRetrieveOutputModel
 */
public class BQAgreementRetrieveOutputModel   {
  private BQAgreementRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQAgreementRetrieveOutputModelAgreementInstanceRecord agreementInstanceRecord = null;

  private String agreementRetrieveActionTaskReference = null;

  private Object agreementRetrieveActionTaskRecord = null;

  private String agreementRetrieveActionResponse = null;

  private BQAgreementRetrieveOutputModelAgreementInstanceReport agreementInstanceReport = null;

  private BQAgreementRetrieveOutputModelAgreementInstanceAnalysis agreementInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQAgreementRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQAgreementRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get agreementInstanceRecord
   * @return agreementInstanceRecord
  **/

  public BQAgreementRetrieveOutputModelAgreementInstanceRecord getAgreementInstanceRecord() {
    return agreementInstanceRecord;
  }

  public void setAgreementInstanceRecord(BQAgreementRetrieveOutputModelAgreementInstanceRecord agreementInstanceRecord) {
    this.agreementInstanceRecord = agreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Agreement instance retrieve service call 
   * @return agreementRetrieveActionTaskReference
  **/

  public String getAgreementRetrieveActionTaskReference() {
    return agreementRetrieveActionTaskReference;
  }

  public void setAgreementRetrieveActionTaskReference(String agreementRetrieveActionTaskReference) {
    this.agreementRetrieveActionTaskReference = agreementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return agreementRetrieveActionTaskRecord
  **/

  public Object getAgreementRetrieveActionTaskRecord() {
    return agreementRetrieveActionTaskRecord;
  }

  public void setAgreementRetrieveActionTaskRecord(Object agreementRetrieveActionTaskRecord) {
    this.agreementRetrieveActionTaskRecord = agreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return agreementRetrieveActionResponse
  **/

  public String getAgreementRetrieveActionResponse() {
    return agreementRetrieveActionResponse;
  }

  public void setAgreementRetrieveActionResponse(String agreementRetrieveActionResponse) {
    this.agreementRetrieveActionResponse = agreementRetrieveActionResponse;
  }


  /**
   * Get agreementInstanceReport
   * @return agreementInstanceReport
  **/

  public BQAgreementRetrieveOutputModelAgreementInstanceReport getAgreementInstanceReport() {
    return agreementInstanceReport;
  }

  public void setAgreementInstanceReport(BQAgreementRetrieveOutputModelAgreementInstanceReport agreementInstanceReport) {
    this.agreementInstanceReport = agreementInstanceReport;
  }


  /**
   * Get agreementInstanceAnalysis
   * @return agreementInstanceAnalysis
  **/

  public BQAgreementRetrieveOutputModelAgreementInstanceAnalysis getAgreementInstanceAnalysis() {
    return agreementInstanceAnalysis;
  }

  public void setAgreementInstanceAnalysis(BQAgreementRetrieveOutputModelAgreementInstanceAnalysis agreementInstanceAnalysis) {
    this.agreementInstanceAnalysis = agreementInstanceAnalysis;
  }


}

