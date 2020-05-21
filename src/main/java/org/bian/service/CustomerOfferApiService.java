/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerOfferApiService {

	SDCustomerOfferActivateOutputModel activate(SDCustomerOfferActivateInputModel request);
	
	SDCustomerOfferConfigureOutputModel configure(String sdReferenceId, SDCustomerOfferConfigureInputModel request);
	
	CRCustomerOfferProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureControlInputModel request);
	
	BQAgreementExchangeOutputModel exchangeAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementExchangeInputModel request);
	
	BQCollateralExchangeOutputModel exchangeCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralExchangeInputModel request);
	
	BQCorrespondenceandDocumentsExchangeOutputModel exchangeCorrespondenceanddocuments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorrespondenceandDocumentsExchangeInputModel request);
	
	BQDisclosuresExchangeOutputModel exchangeDisclosures(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDisclosuresExchangeInputModel request);
	
	BQProductExchangeOutputModel exchangeProduct(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductExchangeInputModel request);
	
	CRCustomerOfferProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureExchangeInputModel request);
	
	CRCustomerOfferProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureExecuteInputModel request);
	
	SDCustomerOfferFeedbackOutputModel feedback(String sdReferenceId, SDCustomerOfferFeedbackInputModel request);
	
	CRCustomerOfferProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerOfferProcedureInitiateInputModel request);
	
	CRCustomerOfferProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureRequestInputModel request);
	
	CRCustomerOfferProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQAgreementRetrieveOutputModel retrieveAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQAuditRetrieveOutputModel retrieveAudit(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQBookingRetrieveOutputModel retrieveBooking(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCollateralRetrieveOutputModel retrieveCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQComplianceRetrieveOutputModel retrieveCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCorrespondenceandDocumentsRetrieveOutputModel retrieveCorrespondenceanddocuments(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCreditRetrieveOutputModel retrieveCredit(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDisclosuresRetrieveOutputModel retrieveDisclosures(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductRetrieveOutputModel retrieveProduct(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductInitializationRetrieveOutputModel retrieveProductinitialization(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQUnderwritingRetrieveOutputModel retrieveUnderwriting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerOfferRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerOfferProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureUpdateInputModel request);
	
	BQAgreementUpdateOutputModel updateAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementUpdateInputModel request);
	
	BQAuditUpdateOutputModel updateAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditUpdateInputModel request);
	
	BQBookingUpdateOutputModel updateBooking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBookingUpdateInputModel request);
	
	BQCollateralUpdateOutputModel updateCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralUpdateInputModel request);
	
	BQComplianceUpdateOutputModel updateCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQComplianceUpdateInputModel request);
	
	BQCorrespondenceandDocumentsUpdateOutputModel updateCorrespondenceanddocuments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorrespondenceandDocumentsUpdateInputModel request);
	
	BQCreditUpdateOutputModel updateCredit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditUpdateInputModel request);
	
	BQDisclosuresUpdateOutputModel updateDisclosures(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDisclosuresUpdateInputModel request);
	
	BQProductUpdateOutputModel updateProduct(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductUpdateInputModel request);
	
	BQProductInitializationUpdateOutputModel updateProductinitialization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductInitializationUpdateInputModel request);
	
	BQUnderwritingUpdateOutputModel updateUnderwriting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUnderwritingUpdateInputModel request);
	
}
