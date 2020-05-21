package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCollateralRetrieveOutputModelCollateralInstanceAnalysis;
import org.bian.dto.BQCollateralRetrieveOutputModelCollateralInstanceRecord;
import org.bian.dto.BQCollateralRetrieveOutputModelCollateralInstanceReport;
import org.bian.dto.BQCollateralRetrieveOutputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCollateralRetrieveOutputModel
 */
public class BQCollateralRetrieveOutputModel   {
  private BQCollateralRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQCollateralRetrieveOutputModelCollateralInstanceRecord collateralInstanceRecord = null;

  private String collateralRetrieveActionTaskReference = null;

  private Object collateralRetrieveActionTaskRecord = null;

  private String collateralRetrieveActionResponse = null;

  private BQCollateralRetrieveOutputModelCollateralInstanceReport collateralInstanceReport = null;

  private BQCollateralRetrieveOutputModelCollateralInstanceAnalysis collateralInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQCollateralRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQCollateralRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get collateralInstanceRecord
   * @return collateralInstanceRecord
  **/

  public BQCollateralRetrieveOutputModelCollateralInstanceRecord getCollateralInstanceRecord() {
    return collateralInstanceRecord;
  }

  public void setCollateralInstanceRecord(BQCollateralRetrieveOutputModelCollateralInstanceRecord collateralInstanceRecord) {
    this.collateralInstanceRecord = collateralInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral instance retrieve service call 
   * @return collateralRetrieveActionTaskReference
  **/

  public String getCollateralRetrieveActionTaskReference() {
    return collateralRetrieveActionTaskReference;
  }

  public void setCollateralRetrieveActionTaskReference(String collateralRetrieveActionTaskReference) {
    this.collateralRetrieveActionTaskReference = collateralRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return collateralRetrieveActionResponse
  **/

  public String getCollateralRetrieveActionResponse() {
    return collateralRetrieveActionResponse;
  }

  public void setCollateralRetrieveActionResponse(String collateralRetrieveActionResponse) {
    this.collateralRetrieveActionResponse = collateralRetrieveActionResponse;
  }


  /**
   * Get collateralInstanceReport
   * @return collateralInstanceReport
  **/

  public BQCollateralRetrieveOutputModelCollateralInstanceReport getCollateralInstanceReport() {
    return collateralInstanceReport;
  }

  public void setCollateralInstanceReport(BQCollateralRetrieveOutputModelCollateralInstanceReport collateralInstanceReport) {
    this.collateralInstanceReport = collateralInstanceReport;
  }


  /**
   * Get collateralInstanceAnalysis
   * @return collateralInstanceAnalysis
  **/

  public BQCollateralRetrieveOutputModelCollateralInstanceAnalysis getCollateralInstanceAnalysis() {
    return collateralInstanceAnalysis;
  }

  public void setCollateralInstanceAnalysis(BQCollateralRetrieveOutputModelCollateralInstanceAnalysis collateralInstanceAnalysis) {
    this.collateralInstanceAnalysis = collateralInstanceAnalysis;
  }


}

