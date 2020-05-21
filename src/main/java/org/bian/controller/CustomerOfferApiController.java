/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CustomerOfferApiController {

	@Autowired
	CustomerOfferApiService service;
	
	@Process.Activate
	public BianResponse<SDCustomerOfferActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerOfferActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDCustomerOfferConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerOfferConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRCustomerOfferProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerOfferProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("agreement")
	@Process.Exchange
	public BianResponse<BQAgreementExchangeOutputModel> exchangeAgreement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAgreementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAgreement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateral")
	@Process.Exchange
	public BianResponse<BQCollateralExchangeOutputModel> exchangeCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCollateral(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("correspondenceanddocuments")
	@Process.Exchange
	public BianResponse<BQCorrespondenceandDocumentsExchangeOutputModel> exchangeCorrespondenceanddocuments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCorrespondenceandDocumentsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCorrespondenceanddocuments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("disclosures")
	@Process.Exchange
	public BianResponse<BQDisclosuresExchangeOutputModel> exchangeDisclosures(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDisclosuresExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeDisclosures(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("product")
	@Process.Exchange
	public BianResponse<BQProductExchangeOutputModel> exchangeProduct(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeProduct(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Exchange
	public BianResponse<CRCustomerOfferProcedureExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerOfferProcedureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRCustomerOfferProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerOfferProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDCustomerOfferFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerOfferFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRCustomerOfferProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerOfferProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRCustomerOfferProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerOfferProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRCustomerOfferProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("agreement")
	@Process.Retrieve
	public BianResponse<BQAgreementRetrieveOutputModel> retrieveAgreement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAgreement(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("audit")
	@Process.Retrieve
	public BianResponse<BQAuditRetrieveOutputModel> retrieveAudit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAudit(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("booking")
	@Process.Retrieve
	public BianResponse<BQBookingRetrieveOutputModel> retrieveBooking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBooking(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("collateral")
	@Process.Retrieve
	public BianResponse<BQCollateralRetrieveOutputModel> retrieveCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCollateral(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("compliance")
	@Process.Retrieve
	public BianResponse<BQComplianceRetrieveOutputModel> retrieveCompliance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCompliance(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("correspondenceanddocuments")
	@Process.Retrieve
	public BianResponse<BQCorrespondenceandDocumentsRetrieveOutputModel> retrieveCorrespondenceanddocuments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCorrespondenceanddocuments(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("credit")
	@Process.Retrieve
	public BianResponse<BQCreditRetrieveOutputModel> retrieveCredit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCredit(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("disclosures")
	@Process.Retrieve
	public BianResponse<BQDisclosuresRetrieveOutputModel> retrieveDisclosures(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDisclosures(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("product")
	@Process.Retrieve
	public BianResponse<BQProductRetrieveOutputModel> retrieveProduct(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProduct(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("productinitialization")
	@Process.Retrieve
	public BianResponse<BQProductInitializationRetrieveOutputModel> retrieveProductinitialization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductinitialization(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("underwriting")
	@Process.Retrieve
	public BianResponse<BQUnderwritingRetrieveOutputModel> retrieveUnderwriting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUnderwriting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDCustomerOfferRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRCustomerOfferProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerOfferProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("agreement")
	@Process.Update
	public BianResponse<BQAgreementUpdateOutputModel> updateAgreement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAgreementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAgreement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("audit")
	@Process.Update
	public BianResponse<BQAuditUpdateOutputModel> updateAudit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAuditUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAudit(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("booking")
	@Process.Update
	public BianResponse<BQBookingUpdateOutputModel> updateBooking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBookingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBooking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateral")
	@Process.Update
	public BianResponse<BQCollateralUpdateOutputModel> updateCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCollateral(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("compliance")
	@Process.Update
	public BianResponse<BQComplianceUpdateOutputModel> updateCompliance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQComplianceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCompliance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("correspondenceanddocuments")
	@Process.Update
	public BianResponse<BQCorrespondenceandDocumentsUpdateOutputModel> updateCorrespondenceanddocuments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCorrespondenceandDocumentsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCorrespondenceanddocuments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("credit")
	@Process.Update
	public BianResponse<BQCreditUpdateOutputModel> updateCredit(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCreditUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCredit(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("disclosures")
	@Process.Update
	public BianResponse<BQDisclosuresUpdateOutputModel> updateDisclosures(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDisclosuresUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDisclosures(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("product")
	@Process.Update
	public BianResponse<BQProductUpdateOutputModel> updateProduct(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProduct(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productinitialization")
	@Process.Update
	public BianResponse<BQProductInitializationUpdateOutputModel> updateProductinitialization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductInitializationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProductinitialization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("underwriting")
	@Process.Update
	public BianResponse<BQUnderwritingUpdateOutputModel> updateUnderwriting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQUnderwritingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateUnderwriting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
