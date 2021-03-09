package api_configsettings.pojoclasses.getjourneydetails;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastDecision {

        @SerializedName("Comments")
        @Expose
        private String comments;
        @SerializedName("DecisionCode")
        @Expose
        private String decisionCode;
        @SerializedName("DecisionDateTime")
        @Expose
        private String decisionDateTime;
        @SerializedName("DecisionId")
        @Expose
        private String decisionId;
        @SerializedName("Origin")
        @Expose
        private String origin;
        @SerializedName("UserName")
        @Expose
        private String userName;

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public String getDecisionCode() {
            return decisionCode;
        }

        public void setDecisionCode(String decisionCode) {
            this.decisionCode = decisionCode;
        }

        public String getDecisionDateTime() {
            return decisionDateTime;
        }

        public void setDecisionDateTime(String decisionDateTime) {
            this.decisionDateTime = decisionDateTime;
        }

        public String getDecisionId() {
            return decisionId;
        }

        public void setDecisionId(String decisionId) {
            this.decisionId = decisionId;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

    }


