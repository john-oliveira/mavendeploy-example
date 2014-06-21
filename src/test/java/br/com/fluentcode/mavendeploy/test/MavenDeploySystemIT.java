package br.com.fluentcode.mavendeploy.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class MavenDeploySystemIT {
	
	private WebDriver driver;
	
	@Before
	public void begin(){
		this.driver = new HtmlUnitDriver();
		this.driver.get("http://localhost:8080/mavendeploy-example");
	}
	
	@After
	public void end(){
		this.driver.quit();
	}
	
	@Test
	public void shouldLoadIndexJsp(){
		WebElement h2 = this.driver.findElement(By.tagName("h2"));
		assertThat(h2.getText(), equalTo("Hello World!"));
	}

}
