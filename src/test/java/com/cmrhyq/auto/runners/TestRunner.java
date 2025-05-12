package com.cmrhyq.auto.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features", // Feature 文件路径
        glue = "com.cmrhyq.auto.stepdefinitions",    // Step Definitions 路径
        plugin = {"pretty", "html:target/cucumber-reports"} // 报告格式和输出路径
)
public class TestRunner {
}
