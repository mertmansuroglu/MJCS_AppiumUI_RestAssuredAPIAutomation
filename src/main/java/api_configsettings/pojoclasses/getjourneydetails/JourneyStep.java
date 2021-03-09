package api_configsettings.pojoclasses.getjourneydetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JourneyStep {


    @SerializedName("Type")
    @Expose
        private String type;
        @SerializedName("HighLevelresult")
        @Expose
        private String highLevelresult;
        @SerializedName("ValidationChecks")
        @Expose
        private List<String> validationChecks = null;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getHighLevelresult() {
            return highLevelresult;
        }

        public void setHighLevelresult(String highLevelresult) {
            this.highLevelresult = highLevelresult;
        }

        public List<String> getValidationChecks() {
            return validationChecks;
        }

        public void setValidationChecks(List<String> validationChecks) {
            this.validationChecks = validationChecks;
        }

    }


