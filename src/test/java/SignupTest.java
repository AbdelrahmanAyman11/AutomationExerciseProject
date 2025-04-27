import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SignupTest {
WebDriver driver;
@BeforeTest
    public void setDriver(){
    driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://automationexercise.com/login");
}
}
