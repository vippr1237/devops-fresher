package com.ifisolution.bussiness_management;

import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.log4j.Log4j2;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Log4j2
@CucumberContextConfiguration
@SpringBootTest(classes = {BussinessManagementApplication.class, CucumberIntegrationTest.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
//cần tìm hiểu thêm
//class này để config stepdefs
public class SpringIntegrationTest {
}
