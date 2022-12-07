package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage_Us017 {

    public MedunnaPage_Us017() { // Public Contructor olusturmamiz gerekir
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

    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement itemsTitles;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[5]")
    public WebElement testItem;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewTestItem;

    @FindBy(xpath = "//*[@id='hospitalmsappfrontendApp.cTestItem.home.createOrEditLabel']")
    public WebElement createOrEditTestItem;

    @FindBy(xpath = "//*[@id='c-test-item-name']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='c-test-item-description']")
    public WebElement description;

    @FindBy(xpath = "//*[@id='c-test-item-price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='c-test-item-defaultValMin']")
    public WebElement defaultMinValue;

    @FindBy(xpath = "//*[@id='c-test-item-defaultValMax']")
    public WebElement defaultMaxValue;

    @FindBy(xpath = "//*[@id='c-test-item-createdDate']")
    public WebElement createdDate;






}
