package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureInitiateInputModelProductInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateInputModelProductInstanceRecord   {
  private String productOptionSelection = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The option setting as agreed/defined with the customer 
   * @return productOptionSelection
  **/

  public String getProductOptionSelection() {
    return productOptionSelection;
  }

  public void setProductOptionSelection(String productOptionSelection) {
    this.productOptionSelection = productOptionSelection;
  }


}

