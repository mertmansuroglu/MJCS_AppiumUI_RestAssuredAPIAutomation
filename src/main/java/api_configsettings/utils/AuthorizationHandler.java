package api_configsettings.utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class AuthorizationHandler {
    private static final String URL = "https://elbtesting.idscan.cloud/idscanenterprisesvc";
    private static String[] tokens = new String[2];

    public static RequestSpecification httpRequestWithCSRFToken() {
        tokens = token();
        try {
            RequestSpecification httprequestbuilder = new RequestSpecBuilder().setContentType(ContentType.JSON).
                    setBaseUri(URL).
                    addHeader("authorization", tokens[0]).
                    addHeader("x-csrftoken", tokens[1]).
                    addCookie("token", tokens[0]).
                    build();
            return given().spec(httprequestbuilder);
        } catch (Exception e) {
            Assert.fail("Error occurred when creating base structure for Request Specification with token authorisation: " + e.getMessage());
            return null;
        }
    }
    public static ResponseSpecification httpresponse(){
        try {
            return new ResponseSpecBuilder().
                    expectStatusCode(200).build();
        } catch (Exception e) {
            Assert.fail("Error occurred when creating base structure for Response Specification with token authorisation: " + e.getMessage());
            return null;
        }
    }
    public static RequestSpecification httpRequest() {
        tokens = token();
        try {
            RequestSpecification   httprequestbuilder= new RequestSpecBuilder().setContentType(ContentType.JSON).
                    setBaseUri(URL).
                    addHeader("authorization",tokens[0]).
                    addCookie("token", tokens[0]).build();
            return given().spec(httprequestbuilder);
        } catch (Exception e) {
            Assert.fail("Error occurred when creating base structure for Request Specification with token authorisation: " + e.getMessage());
            return null;
        }
    }

    public static String[] token() {
        if (tokens[0] == null && tokens[1] == null) {
            RestAssured.baseURI = URL;
            Response response = given().contentType(ContentType.URLENC).
                    body("userName=superadministrator&password=Password1!&area=investigation&login-form-type=pwd&grant_type=password").
                    when().post("/token").then().
                    assertThat().statusCode(200).extract().response();
            tokens[0] = response.cookie("token");
            tokens[1] = response.cookie("csrftoken").replace("%2B", "+").replace("%2F", "/").replace("%3D", "=");
        }
        return tokens;
    }


}



