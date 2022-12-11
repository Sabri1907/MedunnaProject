package stepDefinitions.api_steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US017_Tc05_Pojo;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class MedunnaStepDefinition_US017API {

    US017_Tc05_Pojo expectedData;
    US017_Tc05_Pojo actualData;
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
}
