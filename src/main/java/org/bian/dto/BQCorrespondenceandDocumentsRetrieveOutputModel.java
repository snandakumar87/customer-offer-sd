package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis;
import org.bian.dto.BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord;
import org.bian.dto.BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport;
import org.bian.dto.BQCorrespondenceandDocumentsRetrieveOutputModelCustomerOfferProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCorrespondenceandDocumentsRetrieveOutputModel
 */
public class BQCorrespondenceandDocumentsRetrieveOutputModel   {
  private BQCorrespondenceandDocumentsRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord = null;

  private String correspondenceandDocumentsRetrieveActionTaskReference = null;

  private Object correspondenceandDocumentsRetrieveActionTaskRecord = null;

  private String correspondenceandDocumentsRetrieveActionResponse = null;

  private BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport correspondenceandDocumentsInstanceReport = null;

  private BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis correspondenceandDocumentsInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQCorrespondenceandDocumentsRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQCorrespondenceandDocumentsRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get correspondenceandDocumentsInstanceRecord
   * @return correspondenceandDocumentsInstanceRecord
  **/

  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord getCorrespondenceandDocumentsInstanceRecord() {
    return correspondenceandDocumentsInstanceRecord;
  }

  public void setCorrespondenceandDocumentsInstanceRecord(BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord) {
    this.correspondenceandDocumentsInstanceRecord = correspondenceandDocumentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence and Documents instance retrieve service call 
   * @return correspondenceandDocumentsRetrieveActionTaskReference
  **/

  public String getCorrespondenceandDocumentsRetrieveActionTaskReference() {
    return correspondenceandDocumentsRetrieveActionTaskReference;
  }

  public void setCorrespondenceandDocumentsRetrieveActionTaskReference(String correspondenceandDocumentsRetrieveActionTaskReference) {
    this.correspondenceandDocumentsRetrieveActionTaskReference = correspondenceandDocumentsRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return correspondenceandDocumentsRetrieveActionResponse
  **/

  public String getCorrespondenceandDocumentsRetrieveActionResponse() {
    return correspondenceandDocumentsRetrieveActionResponse;
  }

  public void setCorrespondenceandDocumentsRetrieveActionResponse(String correspondenceandDocumentsRetrieveActionResponse) {
    this.correspondenceandDocumentsRetrieveActionResponse = correspondenceandDocumentsRetrieveActionResponse;
  }


  /**
   * Get correspondenceandDocumentsInstanceReport
   * @return correspondenceandDocumentsInstanceReport
  **/

  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport getCorrespondenceandDocumentsInstanceReport() {
    return correspondenceandDocumentsInstanceReport;
  }

  public void setCorrespondenceandDocumentsInstanceReport(BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceReport correspondenceandDocumentsInstanceReport) {
    this.correspondenceandDocumentsInstanceReport = correspondenceandDocumentsInstanceReport;
  }


  /**
   * Get correspondenceandDocumentsInstanceAnalysis
   * @return correspondenceandDocumentsInstanceAnalysis
  **/

  public BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis getCorrespondenceandDocumentsInstanceAnalysis() {
    return correspondenceandDocumentsInstanceAnalysis;
  }

  public void setCorrespondenceandDocumentsInstanceAnalysis(BQCorrespondenceandDocumentsRetrieveOutputModelCorrespondenceandDocumentsInstanceAnalysis correspondenceandDocumentsInstanceAnalysis) {
    this.correspondenceandDocumentsInstanceAnalysis = correspondenceandDocumentsInstanceAnalysis;
  }


}

