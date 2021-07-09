package com.ifisolution.bussiness_management.stepdefs;

import com.ifisolution.bussiness_management.SpringIntegrationTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProductStepdefs extends SpringIntegrationTest {
    private String addURI;
    private RestTemplate restTemplate;
    private ResponseEntity<String> response;
    private HttpHeaders headers;

    @Given("User set POST product service api endpoint")
    public void userSetPOSTProductServiceApiEndpoint() {
        addURI = "http://localhost:8080/api/product";
        System.out.println("Add URL :" + addURI);
    }

    @When("User Set request HEADER")
    public void userSetRequestHEADER() {
        headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
    }

    @And("User send a POST HTTP request")
    public void userSendAPOSTHTTPRequest() {
        String jsonBody = "{\"name\":\"product-01\",\"stock\":\"50\",\"price\":\"20.0\"}";
        System.out.println("\n\n" + jsonBody);
        HttpEntity<String> entity = new HttpEntity<String>(jsonBody, headers);
        //POST Method to Add New Employee
        restTemplate = new RestTemplate();
        response = restTemplate.postForEntity(addURI, entity, String.class);
    }

    @Then("User recieves status code of {int}")
    public void userRecievesStatusCodeOf(int statusCode) {
        assertThat(response.getStatusCodeValue()).isEqualTo(statusCode);
    }
}
