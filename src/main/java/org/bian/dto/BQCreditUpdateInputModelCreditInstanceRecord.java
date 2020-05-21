package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditUpdateInputModelCreditInstanceRecord
 */
public class BQCreditUpdateInputModelCreditInstanceRecord   {
  private String customerCreditRating = null;

  private String creditAuthorizationDecisionReference = null;

  private String creditAuthorizationDecision = null;


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


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_K1lxwG7NEeO82qXU9yOWsg  bian-reference: CustomerOffer.TagetCustomer.CustomerRating (as CustomerCreditRating).CustomerCreditRatingAssessment  general-info: Reference to the authorization if an aspect of the offer procedure 
   * @return creditAuthorizationDecisionReference
  **/

  public String getCreditAuthorizationDecisionReference() {
    return creditAuthorizationDecisionReference;
  }

  public void setCreditAuthorizationDecisionReference(String creditAuthorizationDecisionReference) {
    this.creditAuthorizationDecisionReference = creditAuthorizationDecisionReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_K1lxwG7NEeO82qXU9yOWsg  bian-reference: CustomerOffer.TagetCustomer.CustomerRating (as CustomerCreditRating).CustomerCreditRatingAssessment `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The credit decision (indicates credit position is adequate for the offer) 
   * @return creditAuthorizationDecision
  **/

  public String getCreditAuthorizationDecision() {
    return creditAuthorizationDecision;
  }

  public void setCreditAuthorizationDecision(String creditAuthorizationDecision) {
    this.creditAuthorizationDecision = creditAuthorizationDecision;
  }


}

