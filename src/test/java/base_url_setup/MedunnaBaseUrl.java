package base_url_setup;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
public class MedunnaBaseUrl {
    public static RequestSpecBuilder spec;
    public static void medunnaSetup(){
        spec = (RequestSpecBuilder) new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    }
}

