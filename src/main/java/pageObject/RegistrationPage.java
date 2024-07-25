package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    private WebDriver driver3;

    public RegistrationPage(WebDriver driver2) {
        driver3 = driver2;
        PageFactory.initElements(driver3, this);
    }

    @FindBy(linkText = "Register")
//    WebElement registerlink1 = driver3.findElement(By.linkText("Register"));
    private WebElement registerlink;


//    WebElement registerlink1 = driver3.findElement(By.linkText("Register")); // not going to use just reference

    @FindBy(id = "gender-male")
    private WebElement gendermale;

    @FindBy(id = "gender-female")
    private WebElement genderfemale;

    @FindBy(id = "FirstName")
    private WebElement firstname;

    @FindBy(id = "LastName")
    private WebElement lastname;

    @FindBy(name = "DateOfBirthDay")
    private WebElement day;

    @FindBy(name = "DateOfBirthMonth")
    private WebElement month;

    @FindBy(name = "DateOfBirthYear")
    private WebElement year;

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "Company")
    private WebElement company;

    @FindBy(id = "Newsletter")
    private WebElement newsletter;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(id = "ConfirmPassword")
    private WebElement confirmpassword;

    @FindBy(id = "register-button")
    private WebElement registerbutton;

    //    @FindBy(linkText = "Continue")
    @FindBy(css = "a.button-1.register-continue-button")
    private WebElement continuebutton;

    @FindBy(linkText = "My account")
    private WebElement myaccountlink;


    public boolean verifyonLandingPage() {
        return registerlink.isDisplayed();
    }

    public void navigateToRegistrationpage() {
        registerlink.click();
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            gendermale.click();
        } else if (gender.equalsIgnoreCase("female")) {
            genderfemale.click();
        }
    }

    public void enterFirstName(String firstname) {
        this.firstname.sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        this.lastname.sendKeys(lastname);
    }

    public void selectDay(String day) {
        new Select(this.day).selectByValue(day);
    }

    public void selectMonth(String month) {
        new Select(this.month).selectByVisibleText(month);
    }

    public void selectYear(String year) {
        new Select(this.year).selectByValue(year);
    }

    public void enterEmail(String email) {
        this.email.sendKeys(email);
    }

    public void enterCompany(String company) {
        this.company.sendKeys(company);
    }

    public void clickNewsletter(String newsletter) {
        if (newsletter.equalsIgnoreCase("No") || newsletter.equalsIgnoreCase("uncheck")) {
            this.newsletter.click();
        }
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        this.confirmpassword.sendKeys(confirmpassword);
    }

    public void clickRegisterButton() {
        registerbutton.click();
    }

    public void clickContinueButton() {
        continuebutton.click();
    }

    public boolean verifyonHomePage() {
        return myaccountlink.isDisplayed();
    }


}
