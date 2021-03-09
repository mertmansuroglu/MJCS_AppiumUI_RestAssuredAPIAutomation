package api_configsettings.pojoclasses.getjourneydetails;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class DocumentImage {

        @SerializedName("Role")
        @Expose
        private String role;
        @SerializedName("Url")
        @Expose
        private String url;

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

