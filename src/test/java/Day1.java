import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
    @Test(groups = {"smoke1"})
    @Parameters({"URL","Key"})
    public void monday(@Optional String URL,@Optional String key) {
        System.out.println("hello monday");
        System.out.println("url: "+URL);
        System.out.println("key: "+key);
           }
}
