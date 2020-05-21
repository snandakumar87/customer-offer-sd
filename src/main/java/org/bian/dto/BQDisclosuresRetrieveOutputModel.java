package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDisclosuresRetrieveOutputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis;
import org.bian.dto.BQDisclosuresRetrieveOutputModelDisclosuresInstanceRecord;
import org.bian.dto.BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDisclosuresRetrieveOutputModel
 */
public class BQDisclosuresRetrieveOutputModel   {
  private BQDisclosuresRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQDisclosuresRetrieveOutputModelDisclosuresInstanceRecord disclosuresInstanceRecord = null;

  private String disclosuresRetrieveActionTaskReference = null;

  private Object disclosuresRetrieveActionTaskRecord = null;

  private String disclosuresRetrieveActionResponse = null;

  private BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport disclosuresInstanceReport = null;

  private BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis disclosuresInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQDisclosuresRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQDisclosuresRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get disclosuresInstanceRecord
   * @return disclosuresInstanceRecord
  **/

  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceRecord getDisclosuresInstanceRecord() {
    return disclosuresInstanceRecord;
  }

  public void setDisclosuresInstanceRecord(BQDisclosuresRetrieveOutputModelDisclosuresInstanceRecord disclosuresInstanceRecord) {
    this.disclosuresInstanceRecord = disclosuresInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disclosures instance retrieve service call 
   * @return disclosuresRetrieveActionTaskReference
  **/

  public String getDisclosuresRetrieveActionTaskReference() {
    return disclosuresRetrieveActionTaskReference;
  }

  public void setDisclosuresRetrieveActionTaskReference(String disclosuresRetrieveActionTaskReference) {
    this.disclosuresRetrieveActionTaskReference = disclosuresRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return disclosuresRetrieveActionTaskRecord
  **/

  public Object getDisclosuresRetrieveActionTaskRecord() {
    return disclosuresRetrieveActionTaskRecord;
  }

  public void setDisclosuresRetrieveActionTaskRecord(Object disclosuresRetrieveActionTaskRecord) {
    this.disclosuresRetrieveActionTaskRecord = disclosuresRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return disclosuresRetrieveActionResponse
  **/

  public String getDisclosuresRetrieveActionResponse() {
    return disclosuresRetrieveActionResponse;
  }

  public void setDisclosuresRetrieveActionResponse(String disclosuresRetrieveActionResponse) {
    this.disclosuresRetrieveActionResponse = disclosuresRetrieveActionResponse;
  }


  /**
   * Get disclosuresInstanceReport
   * @return disclosuresInstanceReport
  **/

  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport getDisclosuresInstanceReport() {
    return disclosuresInstanceReport;
  }

  public void setDisclosuresInstanceReport(BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport disclosuresInstanceReport) {
    this.disclosuresInstanceReport = disclosuresInstanceReport;
  }


  /**
   * Get disclosuresInstanceAnalysis
   * @return disclosuresInstanceAnalysis
  **/

  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis getDisclosuresInstanceAnalysis() {
    return disclosuresInstanceAnalysis;
  }

  public void setDisclosuresInstanceAnalysis(BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis disclosuresInstanceAnalysis) {
    this.disclosuresInstanceAnalysis = disclosuresInstanceAnalysis;
  }


}

