import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreatePropertiesFile {
    public static void main(String[] args) {
        // Create Properties object
        Properties properties = new Properties();

        // Set properties
        properties.setProperty("db.url", "localhost");
        properties.setProperty("db.port", "5353");
        properties.setProperty("db.user", "cbfacademy");
        properties.setProperty("db.password", "password");

        // Specify the path to the properties file
        String filePath = "homework/input-output/properties.java";

        try (OutputStream output = new FileOutputStream(filePath)) {
            // Save the properties to the file
            properties.store(output, "Database Configuration");

            System.out.println("Configuration properties saved to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
