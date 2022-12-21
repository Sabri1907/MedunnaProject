package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage_Us021 {

    public MedunnaPage_Us021() { // Public Contructor olusturmamiz gerekir
        PageFactory.initElements(Driver.getDriver(), this);
        /*
        => Baska class'lardan WebElementlere ulasmamiz icin PageFactory class'indan initElements()
        methodunu kullanmamiz gerekir.
        => @FindBy notasyonunda driver olmadigi icin initElements() methodu icine Driver class'inda
        olusturdugumuz driver'i this keyword'u ile tanimladik.
        */
    }
    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisProfil;

    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement signInProfile;

    @FindBy(xpath = "//*[@placeholder='Your username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@placeholder='Your password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signInGiris;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement myPages;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement searchPatient;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement ssnMetinKutusu;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[3]")
    public WebElement showAppointment;

    @FindBy(xpath = "//*[@class='btn btn-warning btn-sm']")
    public WebElement editButton;

    @FindBy(xpath = "//h2")
    public WebElement createOrEditAnAppointmentBasligi;

    @FindBy(xpath = "//*[@id='appointment-status']")
    public WebElement statusBox;

    @FindBy(xpath = "//*[@value='UNAPPROVED']")
    public WebElement unapproved;

    @FindBy(xpath = "//*[@value='PENDING']")
    public WebElement pending;

    @FindBy(xpath = "//*[@value='CANCELLED']")
    public WebElement cancelled;

    @FindBy(xpath = "//*[text()='COMPLETED']")
    public WebElement completed;

    @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement anamnesis;

    @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement treatment;

    @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement diagnosis;

    @FindBy(xpath = "//*[@id='appointment-physician']")
    public WebElement physician;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement appointmentSave;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement savedYazisi;

    @FindBy(xpath = "//*[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElement phone;

    @FindBy(xpath = "(//div//option)[9]")
    public WebElement selectedPhysician;

    @FindBy(xpath = "(//div//option)[9]")
    public WebElement selectedPhysiciann;

    @FindBy(xpath = "(//div//option)[9]")
    public WebElement selectedPhysiciannn;

    @FindBy(xpath = "(//div//option)[9]")
    public WebElement selectedPhysiciannn3;

    @FindBy(xpath = "(//div//option)[9]")
    public WebElement selectedPhysiciann3;

}
