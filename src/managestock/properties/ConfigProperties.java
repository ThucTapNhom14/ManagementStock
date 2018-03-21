/**
 * Project ManageStock
 *  2018 10:22:10 PM
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
public class ConfigProperties {
	public static Properties readFileProperties(){
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("resources/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties; 
	}
}

