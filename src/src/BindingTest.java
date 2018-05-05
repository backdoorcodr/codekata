package src;

import java.util.Properties;



public class BindingTest {
	
	public void testBindingBackendVersionValidData() {
		
		final Properties properties = Utilities.loadPropertiesFile("./build/generated-resources/release-info.properties");

        final String version = properties.getProperty("bindingBackendVersion");
        
        System.out.println(version);
        
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BindingTest o = new BindingTest();
		o.testBindingBackendVersionValidData();

		
	}

}
