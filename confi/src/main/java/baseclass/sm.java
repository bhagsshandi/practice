package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class sm {
	
	@Test
	public void testse() throws Exception {
		File fi=new File("C:\\Users\\admin\\eclipse-workspace\\confi\\src\\test\\resources\\proper\\configuration.properties");
		FileInputStream fie=new FileInputStream(fi);
		Properties pro=new Properties();
		pro.load(fie);
		String path=pro.getProperty("browser");
		System.out.println(path+"=======");
		
	}
public void stdjd(){
	
}
}
