package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord   {
  private String customerOfferRequiredDocuments = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636  bian-reference: Document  general-info: Description of the required documents and time limits on receipt where appropriate 
   * @return customerOfferRequiredDocuments
  **/

  public String getCustomerOfferRequiredDocuments() {
    return customerOfferRequiredDocuments;
  }

  public void setCustomerOfferRequiredDocuments(String customerOfferRequiredDocuments) {
    this.customerOfferRequiredDocuments = customerOfferRequiredDocuments;
  }


}

