package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceUpdateInputModelComplianceInstanceRecord
 */
public class BQComplianceUpdateInputModelComplianceInstanceRecord   {
  private String regulatoryComplianceCheckType = null;

  private String regulatoryComplianceCheckRequirement = null;

  private String regulatoryComplianceCheckSubmission = null;

  private String regulatoryComplianceAdjustmentRequirement = null;

  private String regulatoryComplianceCheckAssessment = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The submitted offer related materials 
   * @return regulatoryComplianceCheckSubmission
  **/

  public String getRegulatoryComplianceCheckSubmission() {
    return regulatoryComplianceCheckSubmission;
  }

  public void setRegulatoryComplianceCheckSubmission(String regulatoryComplianceCheckSubmission) {
    this.regulatoryComplianceCheckSubmission = regulatoryComplianceCheckSubmission;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any required changes to the offer needed to comply 
   * @return regulatoryComplianceAdjustmentRequirement
  **/

  public String getRegulatoryComplianceAdjustmentRequirement() {
    return regulatoryComplianceAdjustmentRequirement;
  }

  public void setRegulatoryComplianceAdjustmentRequirement(String regulatoryComplianceAdjustmentRequirement) {
    this.regulatoryComplianceAdjustmentRequirement = regulatoryComplianceAdjustmentRequirement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the compliance assessment 
   * @return regulatoryComplianceCheckAssessment
  **/

  public String getRegulatoryComplianceCheckAssessment() {
    return regulatoryComplianceCheckAssessment;
  }

  public void setRegulatoryComplianceCheckAssessment(String regulatoryComplianceCheckAssessment) {
    this.regulatoryComplianceCheckAssessment = regulatoryComplianceCheckAssessment;
  }


}

