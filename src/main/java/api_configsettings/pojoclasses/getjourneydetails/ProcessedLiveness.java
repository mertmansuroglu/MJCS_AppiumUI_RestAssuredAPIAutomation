package api_configsettings.pojoclasses.getjourneydetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProcessedLiveness {
    @SerializedName("LivenessActions")
    @Expose
    private List<Object> livenessActions = null;

    public List<Object> getLivenessActions() {
        return livenessActions;
    }

        public void setLivenessActions(List<Object> livenessActions) {
            this.livenessActions = livenessActions;
        }

    }

