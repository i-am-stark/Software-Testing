import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class IRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium selenium = new DefaultSelenium("localhost",4444,"firefox","https://www.irctc.co.in/nget/train-search");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
	}
}