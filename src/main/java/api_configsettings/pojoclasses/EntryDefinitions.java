package api_configsettings.pojoclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryDefinitions {

    @SerializedName("JourneyEntryDefinitionId")
    @Expose
    private String journeyEntryDefinitionId;
    @SerializedName("JourneyDefinitionId")
    @Expose
    private String journeyDefinitionId;
    @SerializedName("Type")
    @Expose
    private Long type;
    @SerializedName("Order")
    @Expose
    private Long order;
    @SerializedName("IsOptional")
    @Expose
    private Boolean isOptional;

    public String getJourneyEntryDefinitionId() {
        return journeyEntryDefinitionId;
    }

    public void setJourneyEntryDefinitionId(String journeyEntryDefinitionId) {
        this.journeyEntryDefinitionId = journeyEntryDefinitionId;
    }

    public String getJourneyDefinitionId() {
        return journeyDefinitionId;
    }

    public void setJourneyDefinitionId(String journeyDefinitionId) {
        this.journeyDefinitionId = journeyDefinitionId;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Boolean getIsOptional() {
        return isOptional;
    }

    public void setIsOptional(Boolean isOptional) {
        this.isOptional = isOptional;
    }

}