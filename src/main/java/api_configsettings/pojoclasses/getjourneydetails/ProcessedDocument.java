package api_configsettings.pojoclasses.getjourneydetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProcessedDocument {

    @SerializedName("IssuingCountryCode")
    @Expose
    private String issuingCountryCode;
        @SerializedName("IssuingCountryName")
        @Expose
        private String issuingCountryName;
        @SerializedName("IssuingStateName")
        @Expose
        private String issuingStateName;
        @SerializedName("DocumentCategory")
        @Expose
        private String documentCategory;
        @SerializedName("DocumentType")
        @Expose
        private String documentType;
        @SerializedName("DocumentName")
        @Expose
        private String documentName;
        @SerializedName("DocumentSide")
        @Expose
        private String documentSide;
        @SerializedName("IsValidated")
        @Expose
        private String isValidated;
        @SerializedName("ScanDateTime")
        @Expose
        private String scanDateTime;
        @SerializedName("HighLevelResult")
        @Expose
        private String highLevelResult;
        @SerializedName("ExtractedFields")
        @Expose
        private List<ExtractedField> extractedFields = null;
        @SerializedName("DocumentImages")
        @Expose
        private List<DocumentImage> documentImages = null;
        @SerializedName("DigitalTamperingValidator")
        @Expose
        private String digitalTamperingValidator;

        public String getIssuingCountryCode() {
            return issuingCountryCode;
        }

        public void setIssuingCountryCode(String issuingCountryCode) {
            this.issuingCountryCode = issuingCountryCode;
        }

        public String getIssuingCountryName() {
            return issuingCountryName;
        }

        public void setIssuingCountryName(String issuingCountryName) {
            this.issuingCountryName = issuingCountryName;
        }

        public String getIssuingStateName() {
            return issuingStateName;
        }

        public void setIssuingStateName(String issuingStateName) {
            this.issuingStateName = issuingStateName;
        }

        public String getDocumentCategory() {
            return documentCategory;
        }

        public void setDocumentCategory(String documentCategory) {
            this.documentCategory = documentCategory;
        }

        public String getDocumentType() {
            return documentType;
        }

        public void setDocumentType(String documentType) {
            this.documentType = documentType;
        }

        public String getDocumentName() {
            return documentName;
        }

        public void setDocumentName(String documentName) {
            this.documentName = documentName;
        }

        public String getDocumentSide() {
            return documentSide;
        }

        public void setDocumentSide(String documentSide) {
            this.documentSide = documentSide;
        }

        public String getIsValidated() {
            return isValidated;
        }

        public void setIsValidated(String isValidated) {
            this.isValidated = isValidated;
        }

        public String getScanDateTime() {
            return scanDateTime;
        }

        public void setScanDateTime(String scanDateTime) {
            this.scanDateTime = scanDateTime;
        }

        public String getHighLevelResult() {
            return highLevelResult;
        }

        public void setHighLevelResult(String highLevelResult) {
            this.highLevelResult = highLevelResult;
        }

        public List<ExtractedField> getExtractedFields() {
            return extractedFields;
        }

        public void setExtractedFields(List<ExtractedField> extractedFields) {
            this.extractedFields = extractedFields;
        }

        public List<DocumentImage> getDocumentImages() {
            return documentImages;
        }

        public void setDocumentImages(List<DocumentImage> documentImages) {
            this.documentImages = documentImages;
        }

        public String getDigitalTamperingValidator() {
            return digitalTamperingValidator;
        }

        public void setDigitalTamperingValidator(String digitalTamperingValidator) {
            this.digitalTamperingValidator = digitalTamperingValidator;
        }

    }

