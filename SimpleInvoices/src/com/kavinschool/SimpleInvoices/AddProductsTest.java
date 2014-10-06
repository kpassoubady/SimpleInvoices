package com.kavinschool.SimpleInvoices;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddProductsTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.plusresources.org/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAddProducts() throws Exception {
    // open | http://www.plusresources.org/invoices/index.php?module=auth&view=login | 
    driver.get("http://www.plusresources.org/invoices/index.php?module=auth&view=login");
    // verifyText | css=h1 | Simple Invoices
    try {
      assertEquals("Simple Invoices", driver.findElement(By.cssSelector("h1")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | css=td | exact:Email:
    try {
      assertEquals("Email:", driver.findElement(By.cssSelector("td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | //form[@id='frmLogin']/dl/table/tbody/tr[2]/td | exact:Password:
    try {
      assertEquals("Password:", driver.findElement(By.xpath("//form[@id='frmLogin']/dl/table/tbody/tr[2]/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // assertTitle | Simple Invoices - Login | 
    assertEquals("Simple Invoices - Login", driver.getTitle());
    // type | name=user | student1
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys("student1");
    // type | name=pass | Student1
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys("Student1");
    // click | css=input[type="submit"] | 
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    // click | //div[@id='tabmenu']/ul/li[4]/a/span | 
    driver.findElement(By.xpath("//div[@id='tabmenu']/ul/li[4]/a/span")).click();
    // click | link=Add Product | 
    driver.findElement(By.linkText("Add Product")).click();
    // verifyText | css=td.details_screen | Description
    try {
      assertEquals("Description", driver.findElement(By.cssSelector("td.details_screen")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | //form[@id='frmpost']/table/tbody/tr[2]/td | Unit Price
    try {
      assertEquals("Unit Price", driver.findElement(By.xpath("//form[@id='frmpost']/table/tbody/tr[2]/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | //form[@id='frmpost']/table/tbody/tr[3]/td | Default Tax
    try {
      assertEquals("Default Tax", driver.findElement(By.xpath("//form[@id='frmpost']/table/tbody/tr[3]/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | //form[@id='frmpost']/table/tbody/tr[4]/td | Custom field 1
    try {
      assertEquals("Custom field 1", driver.findElement(By.xpath("//form[@id='frmpost']/table/tbody/tr[4]/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | //form[@id='frmpost']/table/tbody/tr[5]/td | Custom field 2
    try {
      assertEquals("Custom field 2", driver.findElement(By.xpath("//form[@id='frmpost']/table/tbody/tr[5]/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | //form[@id='frmpost']/table/tbody/tr[6]/td | Custom field 3
    try {
      assertEquals("Custom field 3", driver.findElement(By.xpath("//form[@id='frmpost']/table/tbody/tr[6]/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | //form[@id='frmpost']/table/tbody/tr[7]/td | Custom field 4
    try {
      assertEquals("Custom field 4", driver.findElement(By.xpath("//form[@id='frmpost']/table/tbody/tr[7]/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | //form[@id='frmpost']/table/tbody/tr[8]/td | Notes
    try {
      assertEquals("Notes", driver.findElement(By.xpath("//form[@id='frmpost']/table/tbody/tr[8]/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // verifyText | //form[@id='frmpost']/table/tbody/tr[9]/td | Enabled
    try {
      assertEquals("Enabled", driver.findElement(By.xpath("//form[@id='frmpost']/table/tbody/tr[9]/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // type | id=description | SSBSURL
    driver.findElement(By.id("description")).clear();
    driver.findElement(By.id("description")).sendKeys("SSBSURL");
    // type | name=unit_price | 249.00
    driver.findElement(By.name("unit_price")).clear();
    driver.findElement(By.name("unit_price")).sendKeys("249.00");
    // select | name=default_tax_id | label=No Tax
    new Select(driver.findElement(By.name("default_tax_id"))).selectByVisibleText("No Tax");
    // type | name=custom_field1 | Custom field1
    driver.findElement(By.name("custom_field1")).clear();
    driver.findElement(By.name("custom_field1")).sendKeys("Custom field1");
    // type | name=custom_field2 | Custom field2
    driver.findElement(By.name("custom_field2")).clear();
    driver.findElement(By.name("custom_field2")).sendKeys("Custom field2");
    // type | name=custom_field3 | Custom field3
    driver.findElement(By.name("custom_field3")).clear();
    driver.findElement(By.name("custom_field3")).sendKeys("Custom field3");
    // type | name=custom_field4 | Custom field4
    driver.findElement(By.name("custom_field4")).clear();
    driver.findElement(By.name("custom_field4")).sendKeys("Custom field4");
    // type | id=IFrame | Advanced Selenium
    driver.findElement(By.id("IFrame")).clear();
    driver.findElement(By.id("IFrame")).sendKeys("Advanced Selenium");
    // type | css=.edit | 
    driver.findElement(By.cssSelector(".edit")).clear();
    driver.findElement(By.cssSelector(".edit")).sendKeys("");
    // click | css=.positive | 
    driver.findElement(By.cssSelector(".positive")).click();
    // click | css=.txt_right>a | 
    driver.findElement(By.cssSelector(".txt_right>a")).click();
    // selectWindow | null | 
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    // click | link=Log out | 
    driver.findElement(By.linkText("Log out")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
