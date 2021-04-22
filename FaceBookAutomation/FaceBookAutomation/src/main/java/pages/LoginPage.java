package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver)  {
        super(driver);
    }

    @FindBy(id="email")
    WebElement emailTxtBox ;

    @FindBy(id="pass")
    WebElement passwordTxtBox ;

    @FindBy(name = "login")
    WebElement loginBtn ;



    public void UserLogin(String email , String password)
    {
        setTextElementText(emailTxtBox, email);
        setTextElementText(passwordTxtBox, password);
        clickButton(loginBtn);

    }

}
