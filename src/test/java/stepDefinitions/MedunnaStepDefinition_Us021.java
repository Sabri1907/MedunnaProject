package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaPage_Us021;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MedunnaStepDefinition_Us021 {
    MedunnaPage_Us021 medunna021=new MedunnaPage_Us021();

    @Given("SG Staff Medunna url'ine gider")
    public void sgStaffMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("SG Staff Sign In sayfasına gider")
    public void sgStaffSignInSayfasınaGider() {
        medunna021.girisProfil.click();
        ReusableMethods.waitFor(2);
        medunna021.signInProfile.click();
    }

    @And("SG Staff Kullanıcı bilgileriyle sign in olunur")
    public void sgStaffKullanıcıBilgileriyleSignInOlunur() {
        ReusableMethods.waitFor(2);
        medunna021.userName.sendKeys("ykg");
        ReusableMethods.waitFor(1);
        medunna021.password.sendKeys("Yk.3814641");
        ReusableMethods.waitFor(1);
        medunna021.signInGiris.click();
        ReusableMethods.waitFor(2);
    }

    @Then("SG Staff My Pages sekmesini tıklar")
    public void sgStaffMyPagesSekmesiniTıklar() {
        medunna021.myPages.click();
        ReusableMethods.waitFor(2);
    }

    @And("SG Staff açılan menüden Search Patient butonunu tıklar")
    public void sgStaffAçılanMenüdenSearchPatientButonunuTıklar() {
        medunna021.searchPatient.click();

    }

    @Then("SG Staff açılan sayfadan Patient SSN metin kutusuna hastanın SSN numarasını girer ve enter'a tıklar")
    public void sgStaffAçılanSayfadanPatientSSNMetinKutusunaHastanınSSNNumarasınıGirerVeEnterATıklar() {
        ReusableMethods.waitFor(2);
        medunna021.ssnMetinKutusu.sendKeys("001-18-1818", Keys.ENTER);

    }

    @And("SG Staff açılan sayfadan Show Appintments butonunu tıklar")
    public void sgStaffAçılanSayfadanShowAppintmentsButonunuTıklar() {
        ReusableMethods.waitFor(4);
        medunna021.showAppointment.click();

    }

    @Then("SG Staff açılan sayfadan Edit butonunu tıklar")
    public void sgStaffAçılanSayfadanEditButonunuTıklar() {
        ReusableMethods.waitFor(4);
        medunna021.editButton.click();
    }

    @And("SG  Staff Create or Edit an Appointment ekranının açıldığını görür")
    public void sgStaffCreateOrEditAnAppointmentEkranınınAçıldığınıGörür() {
        ReusableMethods.waitFor(4);
        Assert.assertTrue(medunna021.createOrEditAnAppointmentBasligi.isDisplayed());
    }
}
