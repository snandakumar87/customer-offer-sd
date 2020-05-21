package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureInitiateInputModelComplianceInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateInputModelComplianceInstanceRecord   {
  private String regulatoryComplianceCheckType = null;

  private String regulatoryComplianceCheckRequirement = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_K1lxwG7NEeO82qXU9yOWsg/elements/_ddIbAG7VEeO82qXU9yOWsg  bian-reference: RegulatoryComplianceCheck (as Assessmet).Type  general-info: The required check 
   * @return regulatoryComplianceCheckType
  **/

  public String getRegulatoryComplianceCheckType() {
    return regulatoryComplianceCheckType;
  }

  public void setRegulatoryComplianceCheckType(String regulatoryComplianceCheckType) {
    this.regulatoryComplianceCheckType = regulatoryComplianceCheckType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the compliance requirements 
   * @return regulatoryComplianceCheckRequirement
  **/

  public String getRegulatoryComplianceCheckRequirement() {
    return regulatoryComplianceCheckRequirement;
  }

  public void setRegulatoryComplianceCheckRequirement(String regulatoryComplianceCheckRequirement) {
    this.regulatoryComplianceCheckRequirement = regulatoryComplianceCheckRequirement;
  }


}

