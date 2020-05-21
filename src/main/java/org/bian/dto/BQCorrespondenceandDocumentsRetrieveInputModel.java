package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorrespondenceandDocumentsRetrieveInputModelCorrespondenceandDocumentsInstanceAnalysis;
import org.bian.dto.BQCorrespondenceandDocumentsRetrieveInputModelCorrespondenceandDocumentsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCorrespondenceandDocumentsRetrieveInputModel
 */
public class BQCorrespondenceandDocumentsRetrieveInputModel   {
  private Object correspondenceandDocumentsRetrieveActionTaskRecord = null;

  private String correspondenceandDocumentsRetrieveActionRequest = null;

  private BQCorrespondenceandDocumentsRetrieveInputModelCorrespondenceandDocumentsInstanceReport correspondenceandDocumentsInstanceReport = null;

  private BQCorrespondenceandDocumentsRetrieveInputModelCorrespondenceandDocumentsInstanceAnalysis correspondenceandDocumentsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return correspondenceandDocumentsRetrieveActionTaskRecord
  **/

  public Object getCorrespondenceandDocumentsRetrieveActionTaskRecord() {
    return correspondenceandDocumentsRetrieveActionTaskRecord;
  }

  public void setCorrespondenceandDocumentsRetrieveActionTaskRecord(Object correspondenceandDocumentsRetrieveActionTaskRecord) {
    this.correspondenceandDocumentsRetrieveActionTaskRecord = correspondenceandDocumentsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return correspondenceandDocumentsRetrieveActionRequest
  **/

  public String getCorrespondenceandDocumentsRetrieveActionRequest() {
    return correspondenceandDocumentsRetrieveActionRequest;
  }

  public void setCorrespondenceandDocumentsRetrieveActionRequest(String correspondenceandDocumentsRetrieveActionRequest) {
    this.correspondenceandDocumentsRetrieveActionRequest = correspondenceandDocumentsRetrieveActionRequest;
  }


  /**
   * Get correspondenceandDocumentsInstanceReport
   * @return correspondenceandDocumentsInstanceReport
  **/

  public BQCorrespondenceandDocumentsRetrieveInputModelCorrespondenceandDocumentsInstanceReport getCorrespondenceandDocumentsInstanceReport() {
    return correspondenceandDocumentsInstanceReport;
  }

  public void setCorrespondenceandDocumentsInstanceReport(BQCorrespondenceandDocumentsRetrieveInputModelCorrespondenceandDocumentsInstanceReport correspondenceandDocumentsInstanceReport) {
    this.correspondenceandDocumentsInstanceReport = correspondenceandDocumentsInstanceReport;
  }


  /**
   * Get correspondenceandDocumentsInstanceAnalysis
   * @return correspondenceandDocumentsInstanceAnalysis
  **/

  public BQCorrespondenceandDocumentsRetrieveInputModelCorrespondenceandDocumentsInstanceAnalysis getCorrespondenceandDocumentsInstanceAnalysis() {
    return correspondenceandDocumentsInstanceAnalysis;
  }

  public void setCorrespondenceandDocumentsInstanceAnalysis(BQCorrespondenceandDocumentsRetrieveInputModelCorrespondenceandDocumentsInstanceAnalysis correspondenceandDocumentsInstanceAnalysis) {
    this.correspondenceandDocumentsInstanceAnalysis = correspondenceandDocumentsInstanceAnalysis;
  }


}

