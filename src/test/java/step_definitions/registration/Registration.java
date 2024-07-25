package step_definitions.registration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.RegistrationPage;
import step_definitions.Hooks;

public class Registration {

    private WebDriver driver2 = Hooks.driver1;
    private RegistrationPage registrationPage = new RegistrationPage(driver2);


    @Given("I am on the landing page")
    public void verifyLandingPage() {
        Assert.assertTrue(registrationPage.verifyonLandingPage());
    }

    @When("I click on the registration button")
    public void navigateToRegistrationpage() {
        registrationPage.navigateToRegistrationpage();
    }

    @When("User fills the registration form with valid data {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void registrationInputs(String gender, String firstname, String lastname, String DOBDay, String DOBMonth, String DOBYear, String email, String companyname, String newsletter, String password, String confirmpassword) {
        registrationPage.selectGender(gender);
        registrationPage.enterFirstName(firstname);
        registrationPage.enterLastName(lastname);
        registrationPage.selectDay(DOBDay);
        registrationPage.selectMonth(DOBMonth);
        registrationPage.selectYear(DOBYear);
        registrationPage.enterEmail(email);
        registrationPage.enterCompany(companyname);
        registrationPage.clickNewsletter(newsletter);
        registrationPage.enterPassword(password);
        registrationPage.enterConfirmPassword(confirmpassword);
    }

    @When("I click on the Register button and Continue button")
    public void clickRegister() throws InterruptedException {
        registrationPage.clickRegisterButton();
        Thread.sleep(5000); // Consider using WebDriverWait instead of Thread.sleep for better practice
        registrationPage.clickContinueButton();
    }

    @Then("I should be on the home page")
    public void verifyHomePage() {
        Assert.assertTrue(registrationPage.verifyonHomePage());
    }

}



