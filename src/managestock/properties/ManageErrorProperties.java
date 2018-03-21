/**
 * Project ManageStock
 *  2018 10:22:42 PM
 * Coppyright teamZ
 */
package managestock.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author HoangDinhThi HoangMaiNghi
 */
public class ManageErrorProperties {
	public static Properties readFileProperties(){
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("resources/manage_error.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties; 
	}
	
}
