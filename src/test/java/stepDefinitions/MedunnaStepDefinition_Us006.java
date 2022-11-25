package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaPage_Us006;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class MedunnaStepDefinition_Us006 {
    String firstNameValue1;
    String lastNameValue1;
    String emailValue1;

    String firstNameValue2;
    String lastNameValue2;
    String emailValue2;

    MedunnaPage_Us006 medunna006 = new MedunnaPage_Us006();
    Faker faker=new Faker();

    @Given("Kullanici Medunna url'ine gider")
    public void kullaniciMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @Then("Kullanici Sign In sayfasına gider")
    public void kullaniciSignInSayfasınaGider()  {
        medunna006.girisProfil.click();
        ReusableMethods.waitFor(2);
        medunna006.signInProfile.click();

    }

    @And("Kullanici bilgileriyle sign in olur")
    public void kullaniciBilgileriyleSignInOlur()  {
        medunna006.userName.sendKeys("Yusuf1833");
        ReusableMethods.waitFor(1);
        medunna006.password.sendKeys("Ykg123456");
        ReusableMethods.waitFor(1);
        medunna006.signInGiris.click();
    }

    @Then("Profil menüsünden Settings butonu tıklanır")
    public void profilMenüsündenSettingsButonuTıklanır() {
        ReusableMethods.waitFor(1);
        medunna006.kullaniciProfil.click();
        ReusableMethods.waitFor(1);
        medunna006.settings.click();

    }

    @And("Kullanıcı bilgilerinin firstname, lastname, email giriş yaparken doldurulan kullanıcı bilgileri olduğunu dogrular")
    public void kullanıcıBilgilerininGirişYaparkenDoldurulanKullanıcıBilgileriOlduğunuDogrular() {
        String firstNameValue= medunna006.firstName.getAttribute("value");
        String lastNameValue= medunna006.lastName.getAttribute("value");
        String emailValue= medunna006.email.getAttribute("value");


        Assert.assertEquals("Yusuf",firstNameValue);
        ReusableMethods.waitFor(1);
        Assert.assertEquals("Guven",lastNameValue);
        ReusableMethods.waitFor(1);
        Assert.assertEquals("ykg@gmail.com",emailValue);
        ReusableMethods.waitFor(1);


    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("Firstname, lastname ve email metin kutularinda degisiklik yapar")
    public void firstnameLastnameVeEmailMetinKutularindaDegisiklikYapar() {
        firstNameValue1= medunna006.firstName.getAttribute("value");
        lastNameValue1= medunna006.lastName.getAttribute("value");
        emailValue1= medunna006.email.getAttribute("value");

        ReusableMethods.waitFor(2);
        medunna006.firstName.clear();
        ReusableMethods.waitFor(1);
        medunna006.firstName.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(1);
        medunna006.lastName.clear();
        ReusableMethods.waitFor(1);
        medunna006.lastName.sendKeys(faker.name().lastName());
        ReusableMethods.waitFor(1);
        medunna006.email.clear();
        ReusableMethods.waitFor(1);
        medunna006.email.sendKeys(faker.internet().emailAddress(),Keys.ENTER);
        ReusableMethods.waitFor(5);
        firstNameValue2= medunna006.firstName.getAttribute("value");
        lastNameValue2= medunna006.lastName.getAttribute("value");
        emailValue2= medunna006.email.getAttribute("value");


    }

    @Then("Firstname, lastname ve email metin kutularinda yapilan degisiklikleri dogrular")
    public void firstnameLastnameVeEmailMetinKutularindaYapilanDegisiklikleriDogrular() {
        Assert.assertNotEquals(firstNameValue1,firstNameValue2);
        Assert.assertNotEquals(lastNameValue1,lastNameValue2);
        Assert.assertNotEquals(emailValue1,emailValue2);



    }
}
