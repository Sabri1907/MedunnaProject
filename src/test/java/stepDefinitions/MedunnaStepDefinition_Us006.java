package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaPage_Us006;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MedunnaStepDefinition_Us006 {
    MedunnaPage_Us006 medunna006 = new MedunnaPage_Us006();
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
        medunna006.userName.sendKeys("Team06");
        ReusableMethods.waitFor(1);
        medunna006.password.sendKeys("Team06.");
        ReusableMethods.waitFor(1);
        medunna006.signInGiris.click();
    }

    @Then("Profil menüsünden Settings butonu tıklanır")
    public void profilMenüsündenSettingsButonuTıklanır() {
        medunna006.kullaniciProfil.click();
        ReusableMethods.waitFor(1);
        medunna006.settings.click();

    }

    @And("Kullanıcı bilgilerinin firstname, lastname, email giriş yaparken doldurulan kullanıcı bilgileri olduğunu dogrular")
    public void kullanıcıBilgilerininGirişYaparkenDoldurulanKullanıcıBilgileriOlduğunuDogrular(String arg0) {
        Assert.assertEquals("Team06",medunna006.firstName.getText());
        Assert.assertEquals("Team06",medunna006.lastName.getText());
        Assert.assertEquals("team06@gmail.com",medunna006.email.getText());
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
