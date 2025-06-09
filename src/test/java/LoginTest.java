import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    Login login ;
    @BeforeTest
    public void setDriver(){
        driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");

    }
    @Test
    public void Valid_LOGIN(){
        login=new Login(driver);
        login.enterEmail("noogafy567@gmail.com");
        login.enterPass("123456aa");
        login.ClickLogin();
    }
    @AfterTest
    public void quit()
    {
        driver.quit();
    }

}
