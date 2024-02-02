package appium_Project;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {

    WebDriverWait wait;
    AndroidDriver driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void newNoteGoogleKeep(){
        driver.findElement(AppiumBy.id("new_note_button")).click();

        WebElement title= wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("editable_title")));
        title.sendKeys("Appium Test Note");

        WebElement desc= wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("edit_note_text")));
        desc.sendKeys("you are writing via appium");

        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("index_note_title")));
        String getTitle=driver.findElement(AppiumBy.id("index_note_title")).getText();

        Assert.assertEquals("Appium Test Note", getTitle);
    }

    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
