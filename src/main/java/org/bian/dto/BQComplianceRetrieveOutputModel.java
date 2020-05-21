package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQComplianceRetrieveOutputModelComplianceInstanceAnalysis;
import org.bian.dto.BQComplianceRetrieveOutputModelComplianceInstanceReport;
import org.bian.dto.BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQComplianceUpdateInputModelComplianceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQComplianceRetrieveOutputModel
 */
public class BQComplianceRetrieveOutputModel   {
  private BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQComplianceUpdateInputModelComplianceInstanceRecord complianceInstanceRecord = null;

  private String complianceRetrieveActionTaskReference = null;

  private Object complianceRetrieveActionTaskRecord = null;

  private String complianceRetrieveActionResponse = null;

  private BQComplianceRetrieveOutputModelComplianceInstanceReport complianceInstanceReport = null;

  private BQComplianceRetrieveOutputModelComplianceInstanceAnalysis complianceInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Compliance instance retrieve service call 
   * @return complianceRetrieveActionTaskReference
  **/

  public String getComplianceRetrieveActionTaskReference() {
    return complianceRetrieveActionTaskReference;
  }

  public void setComplianceRetrieveActionTaskReference(String complianceRetrieveActionTaskReference) {
    this.complianceRetrieveActionTaskReference = complianceRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return complianceRetrieveActionTaskRecord
  **/

  public Object getComplianceRetrieveActionTaskRecord() {
    return complianceRetrieveActionTaskRecord;
  }

  public void setComplianceRetrieveActionTaskRecord(Object complianceRetrieveActionTaskRecord) {
    this.complianceRetrieveActionTaskRecord = complianceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return complianceRetrieveActionResponse
  **/

  public String getComplianceRetrieveActionResponse() {
    return complianceRetrieveActionResponse;
  }

  public void setComplianceRetrieveActionResponse(String complianceRetrieveActionResponse) {
    this.complianceRetrieveActionResponse = complianceRetrieveActionResponse;
  }


  /**
   * Get complianceInstanceReport
   * @return complianceInstanceReport
  **/

  public BQComplianceRetrieveOutputModelComplianceInstanceReport getComplianceInstanceReport() {
    return complianceInstanceReport;
  }

  public void setComplianceInstanceReport(BQComplianceRetrieveOutputModelComplianceInstanceReport complianceInstanceReport) {
    this.complianceInstanceReport = complianceInstanceReport;
  }


  /**
   * Get complianceInstanceAnalysis
   * @return complianceInstanceAnalysis
  **/

  public BQComplianceRetrieveOutputModelComplianceInstanceAnalysis getComplianceInstanceAnalysis() {
    return complianceInstanceAnalysis;
  }

  public void setComplianceInstanceAnalysis(BQComplianceRetrieveOutputModelComplianceInstanceAnalysis complianceInstanceAnalysis) {
    this.complianceInstanceAnalysis = complianceInstanceAnalysis;
  }


}

