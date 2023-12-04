import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReader {

    public static void main(String[] args) {
        String filepath = "path/to/example.properties";

        // Create Properties object
        Properties properties = new Properties();

        try (InputStream input = new FileInputStream(filePath)) {
            // Load the properties from the file
            properties.load(input);

            // Iterate through each property and print key-value pairs
            properties.forEach((key, value) -> {
                System.out.println(key + ": " + value);
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
    

