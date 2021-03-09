package api_configsettings.utils;

public enum ApiResources {
    UpdateConfiguration("/Configuration/Update"),
    GetAllConfiguration("/Configuration/GetAll"),
    GetJourney("/Journey/Get"),
    AddJourneyDefinition("/JourneyDefinition/Add"),
    addJourneyEntry("JourneyEntryDefinition/Add"),
    DeleteJourneyDefinition("/JourneyDefinition/delete"),
    AddUpdateJourneyDefinition("/JourneyDefinition/AddOrUpdateEntryDefinition"),
    GetAllJourneyDefinition("/JourneyDefinition/GetAll");
    private String resource;

    ApiResources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

}
//value of method will execute apiresources constructor
//with this.resource=resource bunla beraber this get resourci kasteder