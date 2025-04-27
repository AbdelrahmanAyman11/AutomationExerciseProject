package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {
    private WebDriver driver;
    Select objSelect;
    public Signup(WebDriver driver) {
        this.driver = driver;
    }

    By Name = By.name("name");
By Email= By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
By SignUpButton=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

By BoxVisbility = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
By Gender=By.id("id_gender1");
By pass=By.id("password");

By day=By.id("days");
By month=By.id("months");
By year=By.id("years");
By FN=By.id("first_name");
By LN=By.id("last_name");
By address=By.id("address1");
By Country=By.id("country");
By State=By.id("state");
By city=By.id("city");
By ZipCode=By.id("zipcode");
By Mobile=By.id("mobile_number");
public void entername(String name)
{
    driver.findElement(Name).sendKeys(name);

}
    public void enteremail(String email)
    {
        driver.findElement(Email).sendKeys(email);

    }
    public void clicksignupbutton()
    {
        driver.findElement(SignUpButton).submit();

    }
     public boolean HeaderVisibilty()
    {
        boolean x= driver.findElement(BoxVisbility).isDisplayed();
        return x;
    }
    public void gender()
    {
        driver.findElement(Gender).click();
    }
    public void enterPassword(String Password)
    {
        driver.findElement(pass).sendKeys("123456aa");

    }



}
