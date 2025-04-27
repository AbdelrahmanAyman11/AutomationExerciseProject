package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
By daydrop =By.id("days");
By monthdrop =By.id("months");
By yeardrop =By.id("years");

By FN=By.id("first_name");
By LN=By.id("last_name");
By address=By.id("address1");
By CountryField = By.id("country");
By State=By.id("state");
By city=By.id("city");
By ZipCode=By.id("zipcode");
By Mobile=By.id("mobile_number");
By CreateAccount = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
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
        driver.findElement(pass).sendKeys(Password);
    }
    public void SelectDateOfBirth()
    {
        new Select(driver.findElement(daydrop)).selectByVisibleText("20");
        new Select(driver.findElement(monthdrop)).selectByVisibleText("December");
        new Select(driver.findElement(yeardrop)).selectByVisibleText("2001");

    }
    public void enterFN(String FirstName)
    {
        driver.findElement(FN).sendKeys(FirstName);
    }
    public void enterLN(String LastName)
    {
        driver.findElement(LN).sendKeys(LastName);
    }
    public void enterAddress(String Address)
    {
        driver.findElement(address).sendKeys(Address);
    }
    public void enterCountry()
    {
        new Select(driver.findElement(CountryField)).selectByVisibleText("United States");
    }
    public void enterstate(String state)
    {
        driver.findElement(State).sendKeys(state);
    }
    public void entercity(String ciity)
    {
        driver.findElement(city).sendKeys(ciity);
    }
    public void enterzipcode(String zip)
    {
        driver.findElement(ZipCode).sendKeys(zip);
    }
    public void entermobile(String mob)
    {
        driver.findElement(Mobile).sendKeys(mob);
    }

    public void cliclCreateAccount()
    {
        driver.findElement(CreateAccount).submit();

    }

}
