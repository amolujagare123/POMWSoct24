import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

   /* WebDriver driver;
    WebElement element = driver.findElement(By.id(""));*/

    @FindBy (id="login-username")
    WebElement txtUser;

    @FindBy (id="login-password")
    WebElement txtPass;

    @FindBy (name="submit")
    WebElement btnLogin;

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setTxtUser(String username)
    {
        txtUser.sendKeys(username);
    }

    public void setTxtPass(String password)
    {
        txtPass.sendKeys(password);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }
}
