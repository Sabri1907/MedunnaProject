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
    String appointmentFirstNameValue;
    String appointmentLastNameValue;
    String appointmentEmailValue;

    String firstNameValue;
    String lastNameValue;
    String emailValue;

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
        ReusableMethods.waitFor(2);


    }

    @And("Kullanıcı bilgilerinin firstname, lastname, email giriş yaparken doldurulan kullanıcı bilgileri olduğunu dogrular")
    public void kullanıcıBilgilerininGirişYaparkenDoldurulanKullanıcıBilgileriOlduğunuDogrular() {

        firstNameValue= medunna006.firstName.getAttribute("value");
        lastNameValue= medunna006.lastName.getAttribute("value");
        emailValue= medunna006.email.getAttribute("value");


        medunna006.myPagesPatient.click();
        ReusableMethods.waitFor(1);
        medunna006.makeAnAppointments.click();
        ReusableMethods.waitFor(1);


        appointmentFirstNameValue= medunna006.appointmentFirstName.getAttribute("value");
        appointmentLastNameValue= medunna006.appointmentLastName.getAttribute("value");
        appointmentEmailValue= medunna006.appointmentEmail.getAttribute("value");




        Assert.assertEquals(appointmentFirstNameValue,firstNameValue);
        ReusableMethods.waitFor(1);
        Assert.assertEquals(appointmentLastNameValue,lastNameValue);
        ReusableMethods.waitFor(1);
        Assert.assertEquals(appointmentEmailValue,emailValue);
        ReusableMethods.waitFor(1);


    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("Firstname, lastname ve email metin kutularinda degisiklik yapar")
    public void firstnameLastnameVeEmailMetinKutularindaDegisiklikYapar() {

        firstNameValue= medunna006.firstName.getAttribute("value");
        lastNameValue= medunna006.lastName.getAttribute("value");
        emailValue= medunna006.email.getAttribute("value");

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
        Assert.assertNotEquals(firstNameValue,firstNameValue2);
        Assert.assertNotEquals(lastNameValue,lastNameValue2);
        Assert.assertNotEquals(emailValue,emailValue2);



    }
}
