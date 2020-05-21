package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport
 */
public class BQDisclosuresRetrieveOutputModelDisclosuresInstanceReport   {
  private Object disclosuresInstanceReportRecord = null;

  private String disclosuresInstanceReportType = null;

  private String disclosuresInstanceReportParameters = null;

  private Object disclosuresInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return disclosuresInstanceReportRecord
  **/

  public Object getDisclosuresInstanceReportRecord() {
    return disclosuresInstanceReportRecord;
  }

  public void setDisclosuresInstanceReportRecord(Object disclosuresInstanceReportRecord) {
    this.disclosuresInstanceReportRecord = disclosuresInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return disclosuresInstanceReportType
  **/

  public String getDisclosuresInstanceReportType() {
    return disclosuresInstanceReportType;
  }

  public void setDisclosuresInstanceReportType(String disclosuresInstanceReportType) {
    this.disclosuresInstanceReportType = disclosuresInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return disclosuresInstanceReportParameters
  **/

  public String getDisclosuresInstanceReportParameters() {
    return disclosuresInstanceReportParameters;
  }

  public void setDisclosuresInstanceReportParameters(String disclosuresInstanceReportParameters) {
    this.disclosuresInstanceReportParameters = disclosuresInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return disclosuresInstanceReport
  **/

  public Object getDisclosuresInstanceReport() {
    return disclosuresInstanceReport;
  }

  public void setDisclosuresInstanceReport(Object disclosuresInstanceReport) {
    this.disclosuresInstanceReport = disclosuresInstanceReport;
  }


}

