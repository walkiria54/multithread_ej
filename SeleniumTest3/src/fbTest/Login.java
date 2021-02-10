package fbTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main (String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\ROCIO\\CURSOS AULA STREAMING\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    String url_lanzar="https://facebook.com";
	    driver.get(url_lanzar);
	    //maximizar la ventana
	    driver.manage().window
	}

}
