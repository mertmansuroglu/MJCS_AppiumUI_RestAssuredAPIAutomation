package api_configsettings.pojoclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JourneyDefinitionItem {

    @SerializedName("JourneyDefinitionId")
    @Expose
    private String journeyDefinitionId;

    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("ChannelType")
    @Expose
    private int channelType;

    @SerializedName("CapturingMedia")
    @Expose
    private int capturingMedia;

    @SerializedName("LastUpdatedDateTime")
    @Expose
    private String lastUpdatedDateTime;

    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;

    @SerializedName("EntryDefinitions")
    @Expose
    private List<EntryDefinitions> entryDefinitions = null;

    public String getJourneyDefinitionId() {
        return journeyDefinitionId;
    }

    public void setJourneyDefinitionId(String journeyDefinitionId) {
        this.journeyDefinitionId = journeyDefinitionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChannelType() {
        return channelType;
    }

    public void setChannelType(int channelType) {
        this.channelType = channelType;
    }

    public int getCapturingMedia() {
        return capturingMedia;
    }

    public void setCapturingMedia(int capturingMedia) {
        this.capturingMedia = capturingMedia;
    }

    public String getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(String lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<EntryDefinitions> getEntryDefinitions() {
        return entryDefinitions;
    }

    public void setEntryDefinitions(List<EntryDefinitions> entryDefinitions) {
        this.entryDefinitions = entryDefinitions;
    }

}
