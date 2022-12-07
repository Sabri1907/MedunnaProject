package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaPage_Us017;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class MedunnaStepDefinition_Us017 {
    MedunnaPage_Us017 medunna017=new MedunnaPage_Us017();
    Faker faker =new Faker();


    @Given("SG Admin Medunna url'ine gider")
    public void sgAdminMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("SG Admin Sign In sayfasına gider")
    public void sgAdminSignInSayfasınaGider() {
        medunna017.girisProfil.click();
        ReusableMethods.waitFor(2);
        medunna017.signInProfile.click();
    }

    @And("SG Admin Kullanıcı bilgileriyle sign in olunur")
    public void sgAdminKullanıcıBilgileriyleSignInOlunur() {
        medunna017.userName.sendKeys("Team06");
        ReusableMethods.waitFor(1);
        medunna017.password.sendKeys("Team06.");
        ReusableMethods.waitFor(1);
        medunna017.signInGiris.click();
        ReusableMethods.waitFor(2);
    }

    @Then("SG Admin Items&Titles sekmesini tıklar")
    public void sgAdminItemsTitlesSekmesiniTıklar() {
        medunna017.itemsTitles.click();
        ReusableMethods.waitFor(1);

    }

    @And("SG Admin açılan menüden Test Item butonunu tıklar")
    public void sgAdminAçılanMenüdenTestItemButonunuTıklar() {
        medunna017.testItem.click();
        ReusableMethods.waitFor(1);


    }

    @Then("SG Admin açılan sayfadan Create a new Test Item butonunu tıklar")
    public void sgAdminAçılanSayfadanCreateaNewTestItemButonunuTıklar() {
        medunna017.createNewTestItem.click();
        ReusableMethods.waitFor(2);

    }

    @And("SG Admin Create or edit a Test Item ekranının açıldığını görür")
    public void sgAdminCreateorEditaTestItemEkranınınAçıldığınıGörür() {
        Assert.assertTrue(medunna017.createOrEditTestItem.isDisplayed());
    }

    @And("SG Sayfayi kapatir")
    public void sgSayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("SG Admin Create or edit a Test Item ekranınında Name, Description, price Default min value, Default max value and created date as Gun Ay Yil öğelerinin olduğunu görür.")
    public void sgAdminCreateOrEditATestItemEkranınındaNameDescriptionPriceDefaultMinValueDefaultMaxValueAndCreatedDateAsMMDAYYEARÖğelerininOlduğunuGörür() {
        Assert.assertTrue(medunna017.name.isEnabled());
        Assert.assertTrue(medunna017.description.isEnabled());
        Assert.assertTrue(medunna017.price.isEnabled());
        Assert.assertTrue(medunna017.defaultMinValue.isEnabled());
        Assert.assertTrue(medunna017.defaultMaxValue.isEnabled());
        //Assert.assertTrue(medunna017.createdDate.isEnabled());
    }
}
