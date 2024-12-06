import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        Login login = new Login(driver);
        login.setTxtUser("admin");
        login.setTxtPass("admin");
        login.clickLogin();

        Assert.assertEquals(driver.getTitle(), "Dashboard");
    }

}
