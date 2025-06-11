import Pages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class DeleteAccTest {
    WebDriver driver ;
    Login login;
    @Test
    public void DeleteCustomer(){
        driver = new EdgeDriver();
        driver.get("https://automationexercise.com/login");
        login=new Login(driver);
        // for Login first
        login.enterEmail("noogafy567@gmail.com");
        login.enterPass("123456aa");
        login.ClickLogin();

        //then delete user
        login.ClickDelete();
        Assert.assertEquals(login.visbilityOFDeletedMessage(),"ACCOUNT DELETED!");
        login.ClickContinueButton();


    }


}
