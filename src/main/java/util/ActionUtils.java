package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbase.WebTestBase;

public class ActionUtils extends WebTestBase {

    public static Actions action;


    public static void moveToTheElement(WebElement element) {
        action = new Actions(driver);
        action.moveToElement(element)
                .perform();
    }

}
