package wag;

import org.junit.Test;

public class FirstWalkFreeTest extends BaseTest {

    private HomePage homepage;

    @Test
    public void testFirstWalkFree() {
        homepage = new HomePage(driver);
        homepage.clickFirstWalkFreeButton();
    }
}
