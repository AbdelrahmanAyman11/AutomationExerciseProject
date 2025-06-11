import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
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
    @Test
    public void INValid_LOGIN() {
        login = new Login(driver);
        login.enterEmail("noogafy567@gmail.com");
        login.enterPass("12344456aa");
        login.ClickLogin();
        Assert.assertEquals(login.visbilityOFIncorrectMessage(),"Your email or password is incorrect!");

    }


    @AfterTest
    public void quit()
    {
        driver.quit();
    }

}
