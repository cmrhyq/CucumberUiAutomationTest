package com.cmrhyq.auto.stepdefinitions;

import com.cmrhyq.auto.core.factory.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class SearchSteps {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = WebDriverFactory.getDriver();
    }

    @After
    public void tearDown() {
        WebDriverFactory.quitDriver();
    }

    @Given("用户打开登录页面")
    public void userOpenLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/"); // 替换为你的登录页面 URL
    }

    @When("用户输入有效的用户名 {string} 和密码 {string}")
    public void userInputCorrectUsernamePassword(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("用户输入无效的用户名 {string} 和密码 {string}")
    public void userInputWrongUsernamePassword(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("用户点击登录按钮")
    public void userClickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("用户应该被重定向到首页")
    public void user_redirect_index() {
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @Then("页面上应该显示 {string} 文本")
    public void page_show_text(String expectedText) {
        WebElement productsHeader = driver.findElement(By.xpath("//span[text()='" + expectedText + "']"));
        Assert.assertTrue(productsHeader.isDisplayed());
        driver.quit();
    }

    @Then("页面上应该显示错误消息 {string}")
    public void page_show_wrong_msg(String errorMessage) {
        WebElement errorElement = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessage, errorElement.getText());
        driver.quit();
    }
}
