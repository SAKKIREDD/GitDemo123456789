import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider1 {
    @DataProvider(name = "getData")
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "userName1";
        data[0][1] = "password1";
        data[1][0] = "userName2";
        data[1][1] = "password2";
        data[2][0] = "userName3";
        data[2][1] = "password3";
        return data;
    }

    @Test(dataProvider = "getData")
    public void signIn(String username, String password) {
        System.out.println("username " + username);
        System.out.println("password " + password);
    }
}
