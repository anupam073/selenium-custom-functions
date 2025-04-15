package BaseTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Framework.Functions.Functions;

public class test extends Base {

    @Test
    public void testActions() {
   Functions functions = new Functions(driver);
functions.browseurl("https://apmosys.com/");

    }
}
