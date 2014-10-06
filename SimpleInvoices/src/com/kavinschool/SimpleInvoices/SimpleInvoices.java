package com.kavinschool.SimpleInvoices;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SimpleInvoices {
	public Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox3",
				"http://www.plusresources.org/");
		selenium.start();
		selenium.setSpeed("1000");
		selenium.windowMaximize();
		selenium.windowFocus();
	}

	@Test
	public void testSimpleInvoices_new() throws Exception {
		selenium.open("http://www.plusresources.org/invoices/index.php?module=auth&view=login");
		assertEquals("Simple Invoices", selenium.getText("css=h1"));
		assertEquals("Email:", selenium.getText("css=td"));
		assertEquals(
				"Password:",
				selenium.getText("//form[@id='frmLogin']/dl/table/tbody/tr[2]/td"));
		assertEquals("Simple Invoices - Login", selenium.getTitle());
		selenium.type("name=user", "student1");
		selenium.type("name=pass", "Student1");
		selenium.click("css=input[type=\"submit\"]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[@id='tabmenu']/ul/li[4]/a/span");
		selenium.click("link=Add Product");
		selenium.waitForPageToLoad("30000");
		assertEquals("Description", selenium.getText("css=td.details_screen"));
		assertEquals("Unit Price",
				selenium.getText("//form[@id='frmpost']/table/tbody/tr[2]/td"));
		assertEquals("Default Tax",
				selenium.getText("//form[@id='frmpost']/table/tbody/tr[3]/td"));
		assertEquals("Custom field 1",
				selenium.getText("//form[@id='frmpost']/table/tbody/tr[4]/td"));
		assertEquals("Custom field 2",
				selenium.getText("//form[@id='frmpost']/table/tbody/tr[5]/td"));
		assertEquals("Custom field 3",
				selenium.getText("//form[@id='frmpost']/table/tbody/tr[6]/td"));
		assertEquals("Custom field 4",
				selenium.getText("//form[@id='frmpost']/table/tbody/tr[7]/td"));
		assertEquals("Notes",
				selenium.getText("//form[@id='frmpost']/table/tbody/tr[8]/td"));
		assertEquals("Enabled",
				selenium.getText("//form[@id='frmpost']/table/tbody/tr[9]/td"));
		selenium.type("id=description", "SSBSURL");
		selenium.type("name=unit_price", "249.00");
		selenium.select("name=default_tax_id", "label=No Tax");
		selenium.type("name=custom_field1", "Custom field1");
		selenium.type("name=custom_field2", "Custom field2");
		selenium.type("name=custom_field3", "Custom field3");
		selenium.type("name=custom_field4", "Custom field4");
		selenium.type("id=IFrame", "Advanced Selenium");
		selenium.type("css=.edit", "");
		selenium.click("css=.positive");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		selenium.click("css=.txt_right>a");
		selenium.waitForPageToLoad("30000");
		selenium.selectWindow("null");
		selenium.click("link=Log out");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
