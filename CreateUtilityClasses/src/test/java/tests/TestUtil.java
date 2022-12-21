package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestUtil {

	public static void click(WebElement ele) {
		ele.click();
	}
	
	public static boolean isEnabled(WebElement ele) {
		return ele.isEnabled();
	}
	public static boolean isSelected(WebElement ele) {
		return ele.isSelected();
	}
	public static boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}

	public static void selectByIndex(WebElement ele, int index) {
		Select s = new Select(ele);
		if (index == 0)
			s.selectByIndex(0);
		else if (index == 1)
			s.selectByIndex(1);
		else if (index == 2)
			s.selectByIndex(2);
		else if (index == 3)
			s.selectByIndex(3);
	}

	public static void selectByValue(WebElement ele, String text) {
		Select s = new Select(ele);
		String[] str = { "eclipse", "maven", "testng", "junit", "java", "c#", "python", "sql", "html", "css",
				"javascript", "jquery","apple","pear","grape","orange"};
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(text)) {
				s.selectByValue(text);
			}
		}
	}

	public static void selectByVisibleText(WebElement ele, String text) {
		Select s = new Select(ele);
		String[] str = { "JAVA", "C#", "Python", "SQL", "Eclipse", "Maven", "TestNG", "JUnit", "HTML", "CSS",
				"JavaScript", "JQuery","Apple","Pear","Grape","Orange" };
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(text)) {
				s.selectByVisibleText(text);
			}
		}

	}
	
	public static List<WebElement> getAllOptions(WebElement ele) {
		Select s = new Select(ele);
		List<WebElement> l = s.getOptions();
		return l;
	}

}
