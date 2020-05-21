package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask;

import javax.validation.Valid;
  
/**
 * BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord
 */
public class BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord   {
  private String customerOfferProcessingSchedule = null;

  private BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask customerOfferProcessingTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines scheduled update/review tasks covering all tracked properties 
   * @return customerOfferProcessingSchedule
  **/

  public String getCustomerOfferProcessingSchedule() {
    return customerOfferProcessingSchedule;
  }

  public void setCustomerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
    this.customerOfferProcessingSchedule = customerOfferProcessingSchedule;
  }


  /**
   * Get customerOfferProcessingTask
   * @return customerOfferProcessingTask
  **/

  public BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask getCustomerOfferProcessingTask() {
    return customerOfferProcessingTask;
  }

  public void setCustomerOfferProcessingTask(BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask customerOfferProcessingTask) {
    this.customerOfferProcessingTask = customerOfferProcessingTask;
  }


}

