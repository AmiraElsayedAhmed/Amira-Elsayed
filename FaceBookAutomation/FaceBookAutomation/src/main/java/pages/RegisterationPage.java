package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage extends  BasePage{

    public RegisterationPage(WebDriver driver)  {
        super(driver);
    }
    @FindBy(xpath="//*[text()='Create New Account']")
    WebElement CreateNewAccountBtn ;

    @FindBy(name="firstname")
    WebElement FirstName ;

    @FindBy(name="lastname")
    WebElement SurName ;
    @FindBy(name="reg_email__")
    WebElement emailTxtBox ;
    @FindBy(name="reg_email_confirmation__")
    WebElement mailConfirmationTxtBox;
    @FindBy(name="reg_passwd__")
    WebElement passwordTxtBox ;
    @FindBy(name="birthday_day")
    WebElement dateElement;
    @FindBy(name="birthday_month")
    WebElement MonthElement;
    @FindBy(name="birthday_year")
    WebElement YearElement;
    @FindBy(xpath="//label[text()='Female']")
    WebElement GenderBtn;
    @FindBy(xpath="//button[text()='Sign Up']")
    WebElement SignUpBtn;
//pam _13
    //You have successfully confirmed your account with the email

    public void UserRegisteration(String firstname, String surname, String email, String password) {
        clickButton(CreateNewAccountBtn);
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        setTextElementText(FirstName, firstname);
        setTextElementText(SurName, surname);
        setTextElementText(emailTxtBox, email);
        setTextElementText(mailConfirmationTxtBox, email);
        setTextElementText(passwordTxtBox, password);
        Select dateDropdown =new Select(dateElement);
        dateDropdown.selectByVisibleText("8");
        Select MonthDropdown =new Select(MonthElement);
        MonthDropdown.selectByVisibleText("Apr");
        Select YearDropdown =new Select(YearElement);
        YearDropdown.selectByVisibleText("1995");
        clickButton(GenderBtn);
        clickButton(SignUpBtn);


    }

}
