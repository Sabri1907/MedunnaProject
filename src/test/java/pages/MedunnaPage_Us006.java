package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage_Us006 {

    public MedunnaPage_Us006() { // Public Contructor olusturmamiz gerekir
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

    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[3]")
    public WebElement kullaniciProfil;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[11]")
    public WebElement settings;

    @FindBy(xpath = "//*[@placeholder='Your first name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@placeholder='Your last name']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@placeholder='Your email']")
    public WebElement email;



}
