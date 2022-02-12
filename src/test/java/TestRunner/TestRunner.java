package TestRunner;

import AppLaunch.AppLaunch;
import TestCase.TestCase;
import org.junit.Assert;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner extends AppLaunch {
    //public TestCase testCase;

    @Test
    public void runTest() throws IOException,InterruptedException {

        TestCase testCase = new TestCase(driver);
        String result = testCase.openApp();
        Assert.assertEquals(result, "12");
    }
}
