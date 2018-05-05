package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Utilities
{
    public static Properties loadPropertiesFile(String fileName)
    {
        
    	try (final InputStream inputStream = new FileInputStream(fileName))
    	{
            final Properties properties = new Properties();
            properties.load(inputStream);

            return properties;
        }
        catch (final IOException exception)
        {
            throw new IllegalStateException(fileName + " should be readable anytime. Exception occured is " + exception.getMessage(), exception);
        }
    }
}