import org.testng.annotations.*;

public class Day9 {
    @Test
    public void night() {
        System.out.println("night time");
    }
    @AfterClass
    public void midnight() {
        System.out.println("midnight");
    }

    @Test
    public void moonnigh() {
        System.out.println("moonnight");
    }
}
