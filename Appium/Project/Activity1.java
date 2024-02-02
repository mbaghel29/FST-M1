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
public class Activity1 {
    WebDriverWait wait;
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void googleTasksApp() {

        String[] taskAdd= new String[]{"Complete Activity with Google Tasks", "Complete Activity with Google Keep", "Complete the second Activity Google Keep"};
        for (int i=0; i<3; i++){
            driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("add_task_title")));
            WebElement newTaskBox1 = driver.findElement(AppiumBy.id("add_task_title"));
            newTaskBox1.click();
            newTaskBox1.sendKeys(taskAdd[i]);
            driver.findElement(AppiumBy.id("add_task_done")).click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView")));
        String task3= driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(task3,taskAdd[2]);
        String task2= driver.findElement(AppiumBy.xpath("(//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"])[1]/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(task2,taskAdd[1]);
        String task1= driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(task1,taskAdd[0]);
    }

    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();

    }
}
