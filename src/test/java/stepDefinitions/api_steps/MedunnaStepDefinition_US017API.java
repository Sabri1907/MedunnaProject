package stepDefinitions.api_steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Assert;

import pojos.US017_Tc05_Pojo;
import pojos.US017_Tc06_Pojo;
import utilities.ObjectMapperUtils;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class MedunnaStepDefinition_US017API {

    US017_Tc05_Pojo expectedData;
    US017_Tc05_Pojo actualData;

    US017_Tc06_Pojo expectedData2;
    US017_Tc06_Pojo actualData2;
    Response response;
    @Given("SG Given user generates token with admin account")
    public void sgGivenUserGeneratesTokenWithAdminAccount() {
        response=given().headers("Authorization", "Bearer " + generateToken()).contentType(ContentType.JSON).when().get("https://medunna.com/api/c-test-items/395186");

    }

    @When("SG And admin sets the expected data to verify")
    public void sgAndAdminSetsTheExpectedDataToVerify() {
        expectedData=new US017_Tc05_Pojo("team06",395186,"Yusuf","fgfdg",200.00,"500","2000");
        System.out.println("expectedData = " + expectedData);
    }

    @Then("SG When  admin sends get request for test items and get the response")
    public void sgWhenAdminSendsGetRequestForTestItemsAndGetTheResponse() {
        actualData= ObjectMapperUtils.convertJsonToJava(response.asString(),US017_Tc05_Pojo.class);
        System.out.println("actualData = " + actualData);

    }


    @And("SG And admin verifies the response with the expected data")
    public void sgAndAdminVerifiesTheResponseWithTheExpectedData() {

        Assert.assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        Assert.assertEquals(expectedData.getId(),actualData.getId());
        Assert.assertEquals(expectedData.getName(),actualData.getName());
        Assert.assertEquals(expectedData.getDescription(),actualData.getDescription());
        Assert.assertEquals(expectedData.getPrice(),actualData.getPrice());
        Assert.assertEquals(expectedData.getDefaultValMin(),actualData.getDefaultValMin());
        Assert.assertEquals(expectedData.getDefaultValMax(),actualData.getDefaultValMax());

    }

    @Given("SG Admin goes to Medunna for post request the Test Item")
    public void sgAdminGoesToMedunnaForPostRequestTheTestItem() {
        Faker faker=new Faker();

        String name= faker.name().firstName();
        expectedData2=new US017_Tc06_Pojo( name,"deger",300.00,18,100);
        response=given().headers("Authorization", "Bearer " + generateToken()).contentType(ContentType.JSON).body(expectedData).when().post("https://www.medunna.com/api/c-test-items");
        System.out.println("expectedData2 = " + expectedData2);
        response.prettyPrint();
    }

    @When("SG Admin sends Post request")
    public void sgAdminSendsPostRequest() {
        response.prettyPrint();
    }

    @Then("SG Admin verifies Status code is {int}")
    public void sgAdminVerifiesStatusCodeIs(int arg0) {

    }

    @And("SG Admin verifies Expected data equals to Actual data")
    public void sgAdminVerifiesExpectedDataEqualsToActualData() {
       actualData2=ObjectMapperUtils.convertJsonToJava(response.asString(),US017_Tc06_Pojo.class);
        System.out.println("actualData2 = " + actualData2);
        Assert.assertEquals(expectedData2.getName(),actualData2.getName());
        Assert.assertEquals(expectedData2.getDescription(),actualData2.getDescription());
        Assert.assertEquals(expectedData2.getPrice(),actualData2.getPrice());
        Assert.assertEquals(expectedData2.getDefaultValMax(),actualData2.getDefaultValMax());
        Assert.assertEquals(expectedData2.getDefaultValMin(),actualData2.getDefaultValMin());
    }
}
