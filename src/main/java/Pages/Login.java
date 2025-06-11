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
    By deleteAccButton =By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a");
    By deletedMessage =By.xpath("/html/body/section/div/div/div/h2/b");
    By ContinueButtton =By.xpath("/html/body/section/div/div/div/div/a");
    By IncorrectMessage =By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");





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


    public  void  ClickDelete()
    {
        driver.findElement(deleteAccButton).click();
    }
    public  String  visbilityOFDeletedMessage ()
    {
        return driver.findElement(deletedMessage).getText();
    }
    public  String  visbilityOFIncorrectMessage()
    {
        return driver.findElement(IncorrectMessage).getText();
    }
    public  void  ClickContinueButton()
    {
        driver.findElement(ContinueButtton).click();
    }
}
