package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord;
import org.bian.dto.BQCorrespondenceandDocumentsUpdateOutputModelCorrespondenceandDocumentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCorrespondenceandDocumentsUpdateOutputModel
 */
public class BQCorrespondenceandDocumentsUpdateOutputModel   {
  private BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private BQCorrespondenceandDocumentsUpdateOutputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord = null;

  private String correspondenceandDocumentsUpdateActionTaskReference = null;

  private Object correspondenceandDocumentsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(BQCorrespondenceandDocumentsUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get correspondenceandDocumentsInstanceRecord
   * @return correspondenceandDocumentsInstanceRecord
  **/

  public BQCorrespondenceandDocumentsUpdateOutputModelCorrespondenceandDocumentsInstanceRecord getCorrespondenceandDocumentsInstanceRecord() {
    return correspondenceandDocumentsInstanceRecord;
  }

  public void setCorrespondenceandDocumentsInstanceRecord(BQCorrespondenceandDocumentsUpdateOutputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord) {
    this.correspondenceandDocumentsInstanceRecord = correspondenceandDocumentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return correspondenceandDocumentsUpdateActionTaskReference
  **/

  public String getCorrespondenceandDocumentsUpdateActionTaskReference() {
    return correspondenceandDocumentsUpdateActionTaskReference;
  }

  public void setCorrespondenceandDocumentsUpdateActionTaskReference(String correspondenceandDocumentsUpdateActionTaskReference) {
    this.correspondenceandDocumentsUpdateActionTaskReference = correspondenceandDocumentsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return correspondenceandDocumentsUpdateActionTaskRecord
  **/

  public Object getCorrespondenceandDocumentsUpdateActionTaskRecord() {
    return correspondenceandDocumentsUpdateActionTaskRecord;
  }

  public void setCorrespondenceandDocumentsUpdateActionTaskRecord(Object correspondenceandDocumentsUpdateActionTaskRecord) {
    this.correspondenceandDocumentsUpdateActionTaskRecord = correspondenceandDocumentsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

