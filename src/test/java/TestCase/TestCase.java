package TestCase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class TestCase {
    AppiumDriver driver;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    MobileElement btn5;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    MobileElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/digit_7")
    MobileElement btn7;
    @FindBy(id = "com.google.android.calculator:id/result_preview")
    MobileElement btnPreview;

    public TestCase(AppiumDriver driver) throws IOException,InterruptedException {
        //this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String openApp() {
        btn5.click();
        btnPlus.click();
        btn7.click();
        System.out.println(btnPreview.getText());
        return btnPreview.getText();
    }

}
