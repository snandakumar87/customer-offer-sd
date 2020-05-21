package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureExecuteInputModelExecuteRecordType
 */
public class CRCustomerOfferProcedureExecuteInputModelExecuteRecordType   {
  private Object executeInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Execute transaction/record (e.g. deposit, withdrawal, fee/penalty, interest) 
   * @return executeInputRecord
  **/

  public Object getExecuteInputRecord() {
    return executeInputRecord;
  }

  public void setExecuteInputRecord(Object executeInputRecord) {
    this.executeInputRecord = executeInputRecord;
  }


}

