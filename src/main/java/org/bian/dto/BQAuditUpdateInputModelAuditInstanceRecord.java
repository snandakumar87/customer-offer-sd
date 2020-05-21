package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuditUpdateInputModelAuditInstanceRecord
 */
public class BQAuditUpdateInputModelAuditInstanceRecord   {
  private String guidelineComplianceCheckType = null;

  private String guidelineComplianceCheckRequirement = null;

  private String guidelineComplianceCheckSubmission = null;

  private String guidelineComplianceAdjustmentRequirement = null;

  private String guidelineComplianceCheckAssessment = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_K1lxwG7NEeO82qXU9yOWsg/elements/_ddIbAG7VEeO82qXU9yOWsg  bian-reference: Audit.GuidelineComplianceCheck (as Assessmet).Type  general-info: The required compliance check 
   * @return guidelineComplianceCheckType
  **/

  public String getGuidelineComplianceCheckType() {
    return guidelineComplianceCheckType;
  }

  public void setGuidelineComplianceCheckType(String guidelineComplianceCheckType) {
    this.guidelineComplianceCheckType = guidelineComplianceCheckType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the compliance requirements 
   * @return guidelineComplianceCheckRequirement
  **/

  public String getGuidelineComplianceCheckRequirement() {
    return guidelineComplianceCheckRequirement;
  }

  public void setGuidelineComplianceCheckRequirement(String guidelineComplianceCheckRequirement) {
    this.guidelineComplianceCheckRequirement = guidelineComplianceCheckRequirement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The submitted offer related materials 
   * @return guidelineComplianceCheckSubmission
  **/

  public String getGuidelineComplianceCheckSubmission() {
    return guidelineComplianceCheckSubmission;
  }

  public void setGuidelineComplianceCheckSubmission(String guidelineComplianceCheckSubmission) {
    this.guidelineComplianceCheckSubmission = guidelineComplianceCheckSubmission;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any required changes to the offer needed to comply 
   * @return guidelineComplianceAdjustmentRequirement
  **/

  public String getGuidelineComplianceAdjustmentRequirement() {
    return guidelineComplianceAdjustmentRequirement;
  }

  public void setGuidelineComplianceAdjustmentRequirement(String guidelineComplianceAdjustmentRequirement) {
    this.guidelineComplianceAdjustmentRequirement = guidelineComplianceAdjustmentRequirement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the compliance assessment 
   * @return guidelineComplianceCheckAssessment
  **/

  public String getGuidelineComplianceCheckAssessment() {
    return guidelineComplianceCheckAssessment;
  }

  public void setGuidelineComplianceCheckAssessment(String guidelineComplianceCheckAssessment) {
    this.guidelineComplianceCheckAssessment = guidelineComplianceCheckAssessment;
  }


}

