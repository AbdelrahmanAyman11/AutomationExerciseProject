import Pages.Login;
import Pages.Signup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupTest {
WebDriver driver;
Signup signupObj;

@BeforeTest
    public void setDriver(){
    driver =new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://automationexercise.com/login");

}
    @Test
    public void valid_Signup() throws InterruptedException {
    signupObj=new Signup(driver);
    boolean x= signupObj.HeaderVisibilty();

        if (x==true) {
            System.out.println("Header is Displayed !!");
        }
    signupObj.entername("Abdo");
    signupObj.enteremail("noogafy567+1@gmail.com");
    signupObj.clicksignupbutton();
//    signupObj.gender();
        signupObj.enterPassword("123456aa");
        signupObj.SelectDateOfBirth();
        signupObj.enterFN("abdo");
        signupObj.enterLN("zedan");
        signupObj.enterAddress("chicago");
        signupObj.enterCountry();
        signupObj.enterstate("chicago");
        signupObj.entercity("chicago");
        signupObj.enterzipcode("11111");
        signupObj.entermobile("01062415054");
        signupObj.cliclCreateAccount();
        Thread.sleep(10000);

    }

@AfterTest
    public void quit()
    {
        driver.quit();
    }

}
