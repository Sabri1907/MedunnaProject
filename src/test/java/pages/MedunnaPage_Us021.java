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

    @FindBy(xpath = "//*[@id='c-test-item-price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='c-test-item-defaultValMin']")
    public WebElement defaultMinValue;

    @FindBy(xpath = "//*[@id='c-test-item-defaultValMax']")
    public WebElement defaultMaxValue;

    @FindBy(xpath = "//*[@id='c-test-item-createdDate']")
    public WebElement createdDate;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement saveButton;

    @FindBy(xpath = "(//*[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//h2")
    public WebElement testItemBasligi;

    @FindBy(xpath = "(//*[@class='hand'])[1]")
    public WebElement idButton;

    @FindBy(xpath = "(//*[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id='jhi-confirm-delete-cTestItem']")
    public WebElement deleteUyariButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement testItemDeletedYazisi;

}
