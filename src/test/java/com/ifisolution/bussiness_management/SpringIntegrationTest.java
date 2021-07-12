package com.ifisolution.bussiness_management;

import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@CucumberContextConfiguration
@SpringBootTest(classes = {BussinessManagementApplication.class, CucumberIntegrationTest.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//cần tìm hiểu thêm
//class này để config stepdefs
public class SpringIntegrationTest {
}
