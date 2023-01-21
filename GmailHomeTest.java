package hu.testExample.testExample;

import hu.testExample.driverfactory.DriverMainTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GmailHomeTest extends DriverMainTest {

    @Test
    public void openGmailHomeScreenTest() {
        driver.get("https://gmail.com");
    }
}
