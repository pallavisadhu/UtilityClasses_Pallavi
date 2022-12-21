package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void selectRadioButton() {
		WebElement e = driver.findElement(By.xpath("//input[@value='blue']"));
		TestUtil.click(e);
		Assert.assertTrue(TestUtil.isEnabled(e));
	}
	@Test
	public void selectCheckBox() {
		WebElement e = driver.findElement(By.xpath("//input[@value='option-1']"));
		TestUtil.click(e);
		Assert.assertTrue(TestUtil.isSelected(e));
		}
	
	@Test
	public void selectFromDropdown1() {
		WebElement e = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		TestUtil.selectByIndex(e,3);
		List<WebElement> l = TestUtil.getAllOptions(e);
		for( WebElement list: l) {
			System.out.println(list.getText());
		}
	}
	@Test
	public void selectFromDropdown2() {
		WebElement e = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		TestUtil.selectByValue(e,"testng");
	}
	
	@Test
	public void selectFromDropdown3() {
		WebElement e = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		TestUtil.selectByVisibleText(e,"JavaScript");
	}
	
	@Test
	public void selectFromDropdown4() {
		WebElement e = driver.findElement(By.xpath("//select[@id='fruit-selects']"));
		TestUtil.selectByIndex(e,0);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
