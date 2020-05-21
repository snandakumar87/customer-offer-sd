package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUnderwritingRetrieveOutputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQUnderwritingRetrieveOutputModelUnderwritingInstanceAnalysis;
import org.bian.dto.BQUnderwritingRetrieveOutputModelUnderwritingInstanceRecord;
import org.bian.dto.BQUnderwritingRetrieveOutputModelUnderwritingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQUnderwritingRetrieveOutputModel
 */
public class BQUnderwritingRetrieveOutputModel   {
  private BQUnderwritingRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQUnderwritingRetrieveOutputModelUnderwritingInstanceRecord underwritingInstanceRecord = null;

  private String underwritingRetrieveActionTaskReference = null;

  private Object underwritingRetrieveActionTaskRecord = null;

  private String underwritingRetrieveActionResponse = null;

  private BQUnderwritingRetrieveOutputModelUnderwritingInstanceReport underwritingInstanceReport = null;

  private BQUnderwritingRetrieveOutputModelUnderwritingInstanceAnalysis underwritingInstanceAnalysis = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQUnderwritingRetrieveOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQUnderwritingRetrieveOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get underwritingInstanceRecord
   * @return underwritingInstanceRecord
  **/

  public BQUnderwritingRetrieveOutputModelUnderwritingInstanceRecord getUnderwritingInstanceRecord() {
    return underwritingInstanceRecord;
  }

  public void setUnderwritingInstanceRecord(BQUnderwritingRetrieveOutputModelUnderwritingInstanceRecord underwritingInstanceRecord) {
    this.underwritingInstanceRecord = underwritingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Underwriting instance retrieve service call 
   * @return underwritingRetrieveActionTaskReference
  **/

  public String getUnderwritingRetrieveActionTaskReference() {
    return underwritingRetrieveActionTaskReference;
  }

  public void setUnderwritingRetrieveActionTaskReference(String underwritingRetrieveActionTaskReference) {
    this.underwritingRetrieveActionTaskReference = underwritingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return underwritingRetrieveActionTaskRecord
  **/

  public Object getUnderwritingRetrieveActionTaskRecord() {
    return underwritingRetrieveActionTaskRecord;
  }

  public void setUnderwritingRetrieveActionTaskRecord(Object underwritingRetrieveActionTaskRecord) {
    this.underwritingRetrieveActionTaskRecord = underwritingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return underwritingRetrieveActionResponse
  **/

  public String getUnderwritingRetrieveActionResponse() {
    return underwritingRetrieveActionResponse;
  }

  public void setUnderwritingRetrieveActionResponse(String underwritingRetrieveActionResponse) {
    this.underwritingRetrieveActionResponse = underwritingRetrieveActionResponse;
  }


  /**
   * Get underwritingInstanceReport
   * @return underwritingInstanceReport
  **/

  public BQUnderwritingRetrieveOutputModelUnderwritingInstanceReport getUnderwritingInstanceReport() {
    return underwritingInstanceReport;
  }

  public void setUnderwritingInstanceReport(BQUnderwritingRetrieveOutputModelUnderwritingInstanceReport underwritingInstanceReport) {
    this.underwritingInstanceReport = underwritingInstanceReport;
  }


  /**
   * Get underwritingInstanceAnalysis
   * @return underwritingInstanceAnalysis
  **/

  public BQUnderwritingRetrieveOutputModelUnderwritingInstanceAnalysis getUnderwritingInstanceAnalysis() {
    return underwritingInstanceAnalysis;
  }

  public void setUnderwritingInstanceAnalysis(BQUnderwritingRetrieveOutputModelUnderwritingInstanceAnalysis underwritingInstanceAnalysis) {
    this.underwritingInstanceAnalysis = underwritingInstanceAnalysis;
  }


}

