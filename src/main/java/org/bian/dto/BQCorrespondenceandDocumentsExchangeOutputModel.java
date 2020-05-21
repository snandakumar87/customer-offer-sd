package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorrespondenceandDocumentsExchangeOutputModel
 */
public class BQCorrespondenceandDocumentsExchangeOutputModel   {
  private String correspondenceandDocumentsExchangeActionTaskReference = null;

  private Object correspondenceandDocumentsExchangeActionTaskRecord = null;

  private String correspondenceandDocumentsExchangeActionResponse = null;

  private String correspondenceandDocumentsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondence and Documents instance exchange service call 
   * @return correspondenceandDocumentsExchangeActionTaskReference
  **/

  public String getCorrespondenceandDocumentsExchangeActionTaskReference() {
    return correspondenceandDocumentsExchangeActionTaskReference;
  }

  public void setCorrespondenceandDocumentsExchangeActionTaskReference(String correspondenceandDocumentsExchangeActionTaskReference) {
    this.correspondenceandDocumentsExchangeActionTaskReference = correspondenceandDocumentsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return correspondenceandDocumentsExchangeActionTaskRecord
  **/

  public Object getCorrespondenceandDocumentsExchangeActionTaskRecord() {
    return correspondenceandDocumentsExchangeActionTaskRecord;
  }

  public void setCorrespondenceandDocumentsExchangeActionTaskRecord(Object correspondenceandDocumentsExchangeActionTaskRecord) {
    this.correspondenceandDocumentsExchangeActionTaskRecord = correspondenceandDocumentsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return correspondenceandDocumentsExchangeActionResponse
  **/

  public String getCorrespondenceandDocumentsExchangeActionResponse() {
    return correspondenceandDocumentsExchangeActionResponse;
  }

  public void setCorrespondenceandDocumentsExchangeActionResponse(String correspondenceandDocumentsExchangeActionResponse) {
    this.correspondenceandDocumentsExchangeActionResponse = correspondenceandDocumentsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Correspondence and Documents instance (e.g. accepted, rejected, verified) 
   * @return correspondenceandDocumentsInstanceStatus
  **/

  public String getCorrespondenceandDocumentsInstanceStatus() {
    return correspondenceandDocumentsInstanceStatus;
  }

  public void setCorrespondenceandDocumentsInstanceStatus(String correspondenceandDocumentsInstanceStatus) {
    this.correspondenceandDocumentsInstanceStatus = correspondenceandDocumentsInstanceStatus;
  }


}

