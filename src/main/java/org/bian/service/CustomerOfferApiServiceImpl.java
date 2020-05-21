/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerOfferApiServiceImpl implements CustomerOfferApiService {

	public SDCustomerOfferActivateOutputModel activate(SDCustomerOfferActivateInputModel request){
		return JsonReader.read("activate-SDCustomerOfferActivateOutputModel.json",new TypeReference<SDCustomerOfferActivateOutputModel>(){});
	}
	
	public SDCustomerOfferConfigureOutputModel configure(String sdReferenceId, SDCustomerOfferConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerOfferConfigureOutputModel.json",new TypeReference<SDCustomerOfferConfigureOutputModel>(){});
	}
	
	public CRCustomerOfferProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureControlInputModel request){
		return JsonReader.read("control-CRCustomerOfferProcedureControlOutputModel.json",new TypeReference<CRCustomerOfferProcedureControlOutputModel>(){});
	}
	
	public BQAgreementExchangeOutputModel exchangeAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementExchangeInputModel request){
		return JsonReader.read("exchange-BQAgreementExchangeOutputModel.json",new TypeReference<BQAgreementExchangeOutputModel>(){});
	}
	
	public BQCollateralExchangeOutputModel exchangeCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralExchangeInputModel request){
		return JsonReader.read("exchange-BQCollateralExchangeOutputModel.json",new TypeReference<BQCollateralExchangeOutputModel>(){});
	}
	
	public BQCorrespondenceandDocumentsExchangeOutputModel exchangeCorrespondenceanddocuments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorrespondenceandDocumentsExchangeInputModel request){
		return JsonReader.read("exchange-BQCorrespondenceandDocumentsExchangeOutputModel.json",new TypeReference<BQCorrespondenceandDocumentsExchangeOutputModel>(){});
	}
	
	public BQDisclosuresExchangeOutputModel exchangeDisclosures(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDisclosuresExchangeInputModel request){
		return JsonReader.read("exchange-BQDisclosuresExchangeOutputModel.json",new TypeReference<BQDisclosuresExchangeOutputModel>(){});
	}
	
	public BQProductExchangeOutputModel exchangeProduct(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductExchangeInputModel request){
		return JsonReader.read("exchange-BQProductExchangeOutputModel.json",new TypeReference<BQProductExchangeOutputModel>(){});
	}
	
	public CRCustomerOfferProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerOfferProcedureExchangeOutputModel.json",new TypeReference<CRCustomerOfferProcedureExchangeOutputModel>(){});
	}
	
	public CRCustomerOfferProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerOfferProcedureExecuteOutputModel.json",new TypeReference<CRCustomerOfferProcedureExecuteOutputModel>(){});
	}
	
	public SDCustomerOfferFeedbackOutputModel feedback(String sdReferenceId, SDCustomerOfferFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerOfferFeedbackOutputModel.json",new TypeReference<SDCustomerOfferFeedbackOutputModel>(){});
	}
	
	public CRCustomerOfferProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerOfferProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerOfferProcedureInitiateOutputModel.json",new TypeReference<CRCustomerOfferProcedureInitiateOutputModel>(){});
	}
	
	public CRCustomerOfferProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureRequestInputModel request){
		return JsonReader.read("request-CRCustomerOfferProcedureRequestOutputModel.json",new TypeReference<CRCustomerOfferProcedureRequestOutputModel>(){});
	}
	
	public CRCustomerOfferProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerOfferProcedureRetrieveOutputModel.json",new TypeReference<CRCustomerOfferProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAgreementRetrieveOutputModel retrieveAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAgreementRetrieveOutputModel.json",new TypeReference<BQAgreementRetrieveOutputModel>(){});
	}
	
	public BQAuditRetrieveOutputModel retrieveAudit(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAuditRetrieveOutputModel.json",new TypeReference<BQAuditRetrieveOutputModel>(){});
	}
	
	public BQBookingRetrieveOutputModel retrieveBooking(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBookingRetrieveOutputModel.json",new TypeReference<BQBookingRetrieveOutputModel>(){});
	}
	
	public BQCollateralRetrieveOutputModel retrieveCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCollateralRetrieveOutputModel.json",new TypeReference<BQCollateralRetrieveOutputModel>(){});
	}
	
	public BQComplianceRetrieveOutputModel retrieveCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQComplianceRetrieveOutputModel.json",new TypeReference<BQComplianceRetrieveOutputModel>(){});
	}
	
	public BQCorrespondenceandDocumentsRetrieveOutputModel retrieveCorrespondenceanddocuments(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCorrespondenceandDocumentsRetrieveOutputModel.json",new TypeReference<BQCorrespondenceandDocumentsRetrieveOutputModel>(){});
	}
	
	public BQCreditRetrieveOutputModel retrieveCredit(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCreditRetrieveOutputModel.json",new TypeReference<BQCreditRetrieveOutputModel>(){});
	}
	
	public BQDisclosuresRetrieveOutputModel retrieveDisclosures(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDisclosuresRetrieveOutputModel.json",new TypeReference<BQDisclosuresRetrieveOutputModel>(){});
	}
	
	public BQProductRetrieveOutputModel retrieveProduct(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductRetrieveOutputModel.json",new TypeReference<BQProductRetrieveOutputModel>(){});
	}
	
	public BQProductInitializationRetrieveOutputModel retrieveProductinitialization(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductInitializationRetrieveOutputModel.json",new TypeReference<BQProductInitializationRetrieveOutputModel>(){});
	}
	
	public BQUnderwritingRetrieveOutputModel retrieveUnderwriting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQUnderwritingRetrieveOutputModel.json",new TypeReference<BQUnderwritingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerOfferRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerOfferRetrieveOutputModel.json",new TypeReference<SDCustomerOfferRetrieveOutputModel>(){});
	}
	
	public CRCustomerOfferProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerOfferProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCustomerOfferProcedureUpdateOutputModel.json",new TypeReference<CRCustomerOfferProcedureUpdateOutputModel>(){});
	}
	
	public BQAgreementUpdateOutputModel updateAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementUpdateInputModel request){
		return JsonReader.read("update-BQAgreementUpdateOutputModel.json",new TypeReference<BQAgreementUpdateOutputModel>(){});
	}
	
	public BQAuditUpdateOutputModel updateAudit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuditUpdateInputModel request){
		return JsonReader.read("update-BQAuditUpdateOutputModel.json",new TypeReference<BQAuditUpdateOutputModel>(){});
	}
	
	public BQBookingUpdateOutputModel updateBooking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBookingUpdateInputModel request){
		return JsonReader.read("update-BQBookingUpdateOutputModel.json",new TypeReference<BQBookingUpdateOutputModel>(){});
	}
	
	public BQCollateralUpdateOutputModel updateCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralUpdateInputModel request){
		return JsonReader.read("update-BQCollateralUpdateOutputModel.json",new TypeReference<BQCollateralUpdateOutputModel>(){});
	}
	
	public BQComplianceUpdateOutputModel updateCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQComplianceUpdateInputModel request){
		return JsonReader.read("update-BQComplianceUpdateOutputModel.json",new TypeReference<BQComplianceUpdateOutputModel>(){});
	}
	
	public BQCorrespondenceandDocumentsUpdateOutputModel updateCorrespondenceanddocuments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorrespondenceandDocumentsUpdateInputModel request){
		return JsonReader.read("update-BQCorrespondenceandDocumentsUpdateOutputModel.json",new TypeReference<BQCorrespondenceandDocumentsUpdateOutputModel>(){});
	}
	
	public BQCreditUpdateOutputModel updateCredit(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditUpdateInputModel request){
		return JsonReader.read("update-BQCreditUpdateOutputModel.json",new TypeReference<BQCreditUpdateOutputModel>(){});
	}
	
	public BQDisclosuresUpdateOutputModel updateDisclosures(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDisclosuresUpdateInputModel request){
		return JsonReader.read("update-BQDisclosuresUpdateOutputModel.json",new TypeReference<BQDisclosuresUpdateOutputModel>(){});
	}
	
	public BQProductUpdateOutputModel updateProduct(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductUpdateInputModel request){
		return JsonReader.read("update-BQProductUpdateOutputModel.json",new TypeReference<BQProductUpdateOutputModel>(){});
	}
	
	public BQProductInitializationUpdateOutputModel updateProductinitialization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductInitializationUpdateInputModel request){
		return JsonReader.read("update-BQProductInitializationUpdateOutputModel.json",new TypeReference<BQProductInitializationUpdateOutputModel>(){});
	}
	
	public BQUnderwritingUpdateOutputModel updateUnderwriting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUnderwritingUpdateInputModel request){
		return JsonReader.read("update-BQUnderwritingUpdateOutputModel.json",new TypeReference<BQUnderwritingUpdateOutputModel>(){});
	}
	
}
