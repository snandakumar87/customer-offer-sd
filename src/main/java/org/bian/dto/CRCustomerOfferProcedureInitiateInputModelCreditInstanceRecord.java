package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureInitiateInputModelCreditInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateInputModelCreditInstanceRecord   {
  private String customerCreditRating = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FQCvV8TGEeChad0JzLk7QA_1351565206  bian-reference: CustomerOffer.TagetCustomer.CustomerRating (as CustomerCreditRating)  general-info: The customer's current credit rating 
   * @return customerCreditRating
  **/

  public String getCustomerCreditRating() {
    return customerCreditRating;
  }

  public void setCustomerCreditRating(String customerCreditRating) {
    this.customerCreditRating = customerCreditRating;
  }


}

