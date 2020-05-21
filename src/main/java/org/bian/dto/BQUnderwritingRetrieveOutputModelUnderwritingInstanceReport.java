package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUnderwritingRetrieveOutputModelUnderwritingInstanceReport
 */
public class BQUnderwritingRetrieveOutputModelUnderwritingInstanceReport   {
  private Object underwritingInstanceReportRecord = null;

  private String underwritingInstanceReportType = null;

  private String underwritingInstanceReportParameters = null;

  private Object underwritingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return underwritingInstanceReportRecord
  **/

  public Object getUnderwritingInstanceReportRecord() {
    return underwritingInstanceReportRecord;
  }

  public void setUnderwritingInstanceReportRecord(Object underwritingInstanceReportRecord) {
    this.underwritingInstanceReportRecord = underwritingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return underwritingInstanceReportType
  **/

  public String getUnderwritingInstanceReportType() {
    return underwritingInstanceReportType;
  }

  public void setUnderwritingInstanceReportType(String underwritingInstanceReportType) {
    this.underwritingInstanceReportType = underwritingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return underwritingInstanceReportParameters
  **/

  public String getUnderwritingInstanceReportParameters() {
    return underwritingInstanceReportParameters;
  }

  public void setUnderwritingInstanceReportParameters(String underwritingInstanceReportParameters) {
    this.underwritingInstanceReportParameters = underwritingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return underwritingInstanceReport
  **/

  public Object getUnderwritingInstanceReport() {
    return underwritingInstanceReport;
  }

  public void setUnderwritingInstanceReport(Object underwritingInstanceReport) {
    this.underwritingInstanceReport = underwritingInstanceReport;
  }


}

