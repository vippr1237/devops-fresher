package com.ifisolution.bussiness_management.stepdefs;

import com.ifisolution.bussiness_management.SpringIntegrationTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiStepdefs extends SpringIntegrationTest {
    private RestTemplate restTemplate = new RestTemplate();
    private String url = "http://localhost:8080/";
    private ResponseEntity<String> response;

    @When("^the client call /$")
    public void when() throws Throwable {
        response = restTemplate.getForEntity(url, String.class);
    }

    @Then("^the client recieves status code of (\\d+)$")
    public void then(int statusCode) throws Throwable {
        assertThat(response.getStatusCodeValue()).isEqualTo(statusCode);
    }

    @And("the response should be {string}")
    public void theResponseShouldBe(String expected) {
        assertThat(response.getBody()).isEqualTo(expected);
    }
}
