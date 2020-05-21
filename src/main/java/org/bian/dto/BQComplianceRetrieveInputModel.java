package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQComplianceRetrieveInputModelComplianceInstanceAnalysis;
import org.bian.dto.BQComplianceRetrieveInputModelComplianceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQComplianceRetrieveInputModel
 */
public class BQComplianceRetrieveInputModel   {
  private Object complianceRetrieveActionTaskRecord = null;

  private String complianceRetrieveActionRequest = null;

  private BQComplianceRetrieveInputModelComplianceInstanceReport complianceInstanceReport = null;

  private BQComplianceRetrieveInputModelComplianceInstanceAnalysis complianceInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return complianceRetrieveActionRequest
  **/

  public String getComplianceRetrieveActionRequest() {
    return complianceRetrieveActionRequest;
  }

  public void setComplianceRetrieveActionRequest(String complianceRetrieveActionRequest) {
    this.complianceRetrieveActionRequest = complianceRetrieveActionRequest;
  }


  /**
   * Get complianceInstanceReport
   * @return complianceInstanceReport
  **/

  public BQComplianceRetrieveInputModelComplianceInstanceReport getComplianceInstanceReport() {
    return complianceInstanceReport;
  }

  public void setComplianceInstanceReport(BQComplianceRetrieveInputModelComplianceInstanceReport complianceInstanceReport) {
    this.complianceInstanceReport = complianceInstanceReport;
  }


  /**
   * Get complianceInstanceAnalysis
   * @return complianceInstanceAnalysis
  **/

  public BQComplianceRetrieveInputModelComplianceInstanceAnalysis getComplianceInstanceAnalysis() {
    return complianceInstanceAnalysis;
  }

  public void setComplianceInstanceAnalysis(BQComplianceRetrieveInputModelComplianceInstanceAnalysis complianceInstanceAnalysis) {
    this.complianceInstanceAnalysis = complianceInstanceAnalysis;
  }


}

