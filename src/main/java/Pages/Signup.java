package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {
    private WebDriver driver;
By Name = By.name("name");
By Email= By.name("email");
By SignUpButton=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

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



}
