package api_configsettings.pojoclasses.getjourneydetails;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class ExtractedField {

        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("Value")
        @Expose
        private String value;
        @SerializedName("OCRValue")
        @Expose
        private String oCRValue;
        @SerializedName("LocalValue")
        @Expose
        private String localValue;
        @SerializedName("OCRLocalValue")
        @Expose
        private String oCRLocalValue;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getOCRValue() {
            return oCRValue;
        }

        public void setOCRValue(String oCRValue) {
            this.oCRValue = oCRValue;
        }

        public String getLocalValue() {
            return localValue;
        }

        public void setLocalValue(String localValue) {
            this.localValue = localValue;
        }

        public String getOCRLocalValue() {
            return oCRLocalValue;
        }

        public void setOCRLocalValue(String oCRLocalValue) {
            this.oCRLocalValue = oCRLocalValue;
        }

    }


