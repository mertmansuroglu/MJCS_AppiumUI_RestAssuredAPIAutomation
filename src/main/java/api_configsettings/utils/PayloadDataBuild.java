package api_configsettings.utils;

import api_configsettings.pojoclasses.ConfigurationItem;

public class PayloadDataBuild {

    public static ConfigurationItem payloadAfterAddingBacksideValue(ConfigurationItem backsideSettings, String backsideDocumentValue) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId(backsideSettings.getId());
        item.setKey("BacksideSettings");
        item.setCategoryName("Journey");
        item.setDataType("System.Json");
        item.setDefaultValue("[]");
        item.setValue(backsideDocumentValue);
        return item;
    }

    public static ConfigurationItem payloadAfterAddingDocumentValue(ConfigurationItem documentProofPolicy, String documentValues) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId(documentProofPolicy.getId());
        item.setKey("DocumentProofPolicy");
        item.setValue(documentValues);
        item.setDataType("System.Json");
        item.setDefaultValue("[]");
        item.setCategoryName("Journey");
        return item;
    }

    //here we are putting payload here to make steps clear
    public ConfigurationItem a4CrosscheckConfigurationPayload(String value) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId("434775e6-f732-4533-ad38-73456249e9ea");
        item.setKey("PaperDocumentCrossCheck");
        item.setValue(value);
        item.setDataType("System.Boolean");
        item.setDefaultValue("false");
        item.setCategoryName("Journey");
        return item;

    }

    public ConfigurationItem documentProofPolicyEnabledPayload(String value) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId("dc062ff2-dbd1-4f4f-a186-6ff9ac0a3b66");
        item.setKey("DocumentProofPolicyEnabled");
        item.setValue(value);
        item.setDataType("System.Boolean");
        item.setDefaultValue("false");
        item.setCategoryName("Journey");
        return item;
    }

    public ConfigurationItem ageCheckConfigurationPayload(String value) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId("a9435b7d-6c07-4315-8df9-21bb2d89eda5");
        item.setKey("EnabledUnderAgeCheck");
        item.setValue(value);
        item.setDataType("System.Boolean");
        item.setDefaultValue("false");
        item.setCategoryName("Journey");
        return item;
    }

    public ConfigurationItem minimumAllowedAgePayload(String value) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId("8bae3044-d9c8-451c-b9ff-fd6e83cf999a");
        item.setKey("MinimumAllowedAge");
        item.setValue(value);
        item.setDataType("System.Int32");
        item.setDefaultValue("18");
        item.setMinValue("1");
        item.setMaxValue("100");
        item.setCategoryName("Journey");
        return item;
    }

    public ConfigurationItem backsideTypeCheckConfigPayload(String value) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId("d070258a-5894-49f2-8892-36b8748f02a0");
        item.setKey("BackSideTypeCheck");
        item.setValue(value);
        item.setDataType("System.Boolean");
        item.setDefaultValue("true");
        item.setCategoryName("Journey");
        return item;
    }

    public ConfigurationItem expiryCheckConfigPayload(String value) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId("46d1fe3e-ea57-49ce-a3e0-96da5599eb5d");
        item.setKey("ExpiryCheckEnabled");
        item.setValue(value);
        item.setDataType("System.Boolean");
        item.setDefaultValue("false");
        item.setCategoryName("Journey");
        return item;
    }

    public ConfigurationItem idDocumentDoubleSideCrossCheckPayload(String value) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId("aff80464-457a-4e06-b86e-12bda04528a3");
        item.setKey("IDDocumentDoubleSideCrossCheck");
        item.setValue(value);
        item.setDataType("System.Boolean");
        item.setDefaultValue("false");
        item.setCategoryName("Journey");
        return item;
    }

    public ConfigurationItem tripleScanConfigurationPayload(String value) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId("fc9ad449-a3a2-4fc3-b441-7fda1c8f412a");
        item.setKey("TripleScanEnabled");
        item.setValue(value);
        item.setDataType("System.Boolean");
        item.setDefaultValue("true");
        item.setCategoryName("Journey");
        return item;
    }

    public ConfigurationItem frontSideTypeCheckConfigPayload(String value) {
        ConfigurationItem item = new ConfigurationItem();
        item.setId("68c0c8ba-fd20-45d0-8515-16c88f982367");
        item.setKey("FrontSideTypeCheck");
        item.setValue(value);
        item.setDataType("System.Boolean");
        item.setDefaultValue("true");
        item.setCategoryName("Journey");
        return item;
    }
}
