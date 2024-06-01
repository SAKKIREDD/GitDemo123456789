import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day5 {
    @Test(groups = {"smoke"})
    @Parameters("URL")
    public void friday( @Optional String URL) {
        System.out.println("hello Friday");
        System.out.println(URL);
    }
    @Test
    public void secondHalf() {
        System.out.println("second half");
    }
    @Test
    public void firstHalf() {
        System.out.println("first half");
    }
}
