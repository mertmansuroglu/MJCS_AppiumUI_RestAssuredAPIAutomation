package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static java.util.Objects.requireNonNull;

public class PropertiesHandler {

    private String propertyFile = "global.properties";
    private Properties properties;

    public PropertiesHandler() {
        fileProcessor();
    }

    public PropertiesHandler(String serviceName) {
        if (serviceName.endsWith(".properties"))
            propertyFile = serviceName.toLowerCase();
        else
            propertyFile = "global.properties";
        fileProcessor();
    }

    private void fileProcessor() {
        properties = new Properties();
        try (InputStream inputStream = PropertiesHandler.class.getClassLoader().getResourceAsStream(propertyFile)) {
            properties.load(requireNonNull(inputStream));
            loadSystemProperties();
            System.setProperties(properties);
        } catch (FileNotFoundException e) {
            System.out.println("Property File could not be found: " + propertyFile);
        } catch (IOException ex) {
            System.out.println(String.format("Issues reading properties of :%s. %s", propertyFile, ex.getMessage()));
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }


    public String setProperty(String key, String value) {
        return (String) properties.setProperty(key, value);
    }

    /**
     * adds System Properties to the properties object
     */
    public void loadSystemProperties() {
        properties.putAll(System.getProperties());
    }
}
