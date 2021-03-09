package api_configsettings.pojoclasses.getjourneydetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JourneyDetails {

    @SerializedName("JourneyId")
    @Expose
    private String journeyId;
    @SerializedName("HighLevelResult")
    @Expose
    private String highLevelResult;
    @SerializedName("HighLevelResultDetails")
        @Expose
        private List<String> highLevelResultDetails = null;
        @SerializedName("InitiatedDateTime")
        @Expose
        private String initiatedDateTime;
        @SerializedName("ProcessedDocuments")
        @Expose
        private List<ProcessedDocument> processedDocuments = null;
        @SerializedName("ReferenceNumber")
        @Expose
        private String referenceNumber;
        @SerializedName("AuthenticationToleranceLevel")
        @Expose
        private String authenticationToleranceLevel;
        @SerializedName("LastDecision")
        @Expose
        private LastDecision lastDecision;

        @SerializedName("AdditionalData")
        @Expose
        private List<AdditionalData> additionalData = null;

        @SerializedName("ProcessedLiveness")
        @Expose
        private ProcessedLiveness processedLiveness;
        @SerializedName("JourneySteps")
        @Expose
        private List<JourneyStep> journeySteps = null;

        public String getJourneyId() {
            return journeyId;
        }

        public void setJourneyId(String journeyId) {
            this.journeyId = journeyId;
        }

        public String getHighLevelResult() {
            return highLevelResult;
        }

        public void setHighLevelResult(String highLevelResult) {
            this.highLevelResult = highLevelResult;
        }

        public List<String> getHighLevelResultDetails() {
            return highLevelResultDetails;
        }

        public void setHighLevelResultDetails(List<String> highLevelResultDetails) {
            this.highLevelResultDetails = highLevelResultDetails;
        }

        public String getInitiatedDateTime() {
            return initiatedDateTime;
        }

        public void setInitiatedDateTime(String initiatedDateTime) {
            this.initiatedDateTime = initiatedDateTime;
        }

        public List<ProcessedDocument> getProcessedDocuments() {
            return processedDocuments;
        }

        public void setProcessedDocuments(List<ProcessedDocument> processedDocuments) {
            this.processedDocuments = processedDocuments;
        }

        public String getReferenceNumber() {
            return referenceNumber;
        }

        public void setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
        }

        public String getAuthenticationToleranceLevel() {
            return authenticationToleranceLevel;
        }

        public void setAuthenticationToleranceLevel(String authenticationToleranceLevel) {
            this.authenticationToleranceLevel = authenticationToleranceLevel;
        }

        public LastDecision getLastDecision() {
            return lastDecision;
        }

        public void setLastDecision(LastDecision lastDecision) {
            this.lastDecision = lastDecision;
        }

        public List<AdditionalData> getAdditionalData() {
            return additionalData;
        }

        public void setAdditionalData(List<AdditionalData> additionalData) {
            this.additionalData = additionalData;
        }

        public ProcessedLiveness getProcessedLiveness() {
            return processedLiveness;
        }

        public void setProcessedLiveness(ProcessedLiveness processedLiveness) {
            this.processedLiveness = processedLiveness;
        }

        public List<JourneyStep> getJourneySteps() {
            return journeySteps;
        }

        public void setJourneySteps(List<JourneyStep> journeySteps) {
            this.journeySteps = journeySteps;
        }

    }

