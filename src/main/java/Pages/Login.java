package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    By Email = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    By Password =By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]");
    By LoginButton = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");

    public void enterEmail(String email)
    {
        driver.findElement(Email).sendKeys(email);

    }
    public void enterPass(String Passw)
    {
        driver.findElement(Password).sendKeys(Passw);

    }
    public void ClickLogin()
    {
        driver.findElement(LoginButton).submit();
    }
}
