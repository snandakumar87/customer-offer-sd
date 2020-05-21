package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralRetrieveInputModelCollateralInstanceAnalysis;
import org.bian.dto.BQCollateralRetrieveInputModelCollateralInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCollateralRetrieveInputModel
 */
public class BQCollateralRetrieveInputModel   {
  private Object collateralRetrieveActionTaskRecord = null;

  private String collateralRetrieveActionRequest = null;

  private BQCollateralRetrieveInputModelCollateralInstanceReport collateralInstanceReport = null;

  private BQCollateralRetrieveInputModelCollateralInstanceAnalysis collateralInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collateralRetrieveActionTaskRecord
  **/

  public Object getCollateralRetrieveActionTaskRecord() {
    return collateralRetrieveActionTaskRecord;
  }

  public void setCollateralRetrieveActionTaskRecord(Object collateralRetrieveActionTaskRecord) {
    this.collateralRetrieveActionTaskRecord = collateralRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collateralRetrieveActionRequest
  **/

  public String getCollateralRetrieveActionRequest() {
    return collateralRetrieveActionRequest;
  }

  public void setCollateralRetrieveActionRequest(String collateralRetrieveActionRequest) {
    this.collateralRetrieveActionRequest = collateralRetrieveActionRequest;
  }


  /**
   * Get collateralInstanceReport
   * @return collateralInstanceReport
  **/

  public BQCollateralRetrieveInputModelCollateralInstanceReport getCollateralInstanceReport() {
    return collateralInstanceReport;
  }

  public void setCollateralInstanceReport(BQCollateralRetrieveInputModelCollateralInstanceReport collateralInstanceReport) {
    this.collateralInstanceReport = collateralInstanceReport;
  }


  /**
   * Get collateralInstanceAnalysis
   * @return collateralInstanceAnalysis
  **/

  public BQCollateralRetrieveInputModelCollateralInstanceAnalysis getCollateralInstanceAnalysis() {
    return collateralInstanceAnalysis;
  }

  public void setCollateralInstanceAnalysis(BQCollateralRetrieveInputModelCollateralInstanceAnalysis collateralInstanceAnalysis) {
    this.collateralInstanceAnalysis = collateralInstanceAnalysis;
  }


}

