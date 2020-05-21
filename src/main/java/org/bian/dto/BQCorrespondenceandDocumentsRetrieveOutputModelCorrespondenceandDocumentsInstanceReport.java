package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport
 */
public class BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport   {
  private Object correspondenceandDocumentsInstanceReportRecord = null;

  private String correspondenceandDocumentsInstanceReportType = null;

  private String correspondenceandDocumentsInstanceReportParameters = null;

  private Object correspondenceandDocumentsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return correspondenceandDocumentsInstanceReportRecord
  **/

  public Object getCorrespondenceandDocumentsInstanceReportRecord() {
    return correspondenceandDocumentsInstanceReportRecord;
  }

  public void setCorrespondenceandDocumentsInstanceReportRecord(Object correspondenceandDocumentsInstanceReportRecord) {
    this.correspondenceandDocumentsInstanceReportRecord = correspondenceandDocumentsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return correspondenceandDocumentsInstanceReportType
  **/

  public String getCorrespondenceandDocumentsInstanceReportType() {
    return correspondenceandDocumentsInstanceReportType;
  }

  public void setCorrespondenceandDocumentsInstanceReportType(String correspondenceandDocumentsInstanceReportType) {
    this.correspondenceandDocumentsInstanceReportType = correspondenceandDocumentsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return correspondenceandDocumentsInstanceReportParameters
  **/

  public String getCorrespondenceandDocumentsInstanceReportParameters() {
    return correspondenceandDocumentsInstanceReportParameters;
  }

  public void setCorrespondenceandDocumentsInstanceReportParameters(String correspondenceandDocumentsInstanceReportParameters) {
    this.correspondenceandDocumentsInstanceReportParameters = correspondenceandDocumentsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return correspondenceandDocumentsInstanceReport
  **/

  public Object getCorrespondenceandDocumentsInstanceReport() {
    return correspondenceandDocumentsInstanceReport;
  }

  public void setCorrespondenceandDocumentsInstanceReport(Object correspondenceandDocumentsInstanceReport) {
    this.correspondenceandDocumentsInstanceReport = correspondenceandDocumentsInstanceReport;
  }


}

