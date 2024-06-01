import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
    @DataProvider(name = "getData")
    @Test
    public Object[][] getDat() {
        Object[][] data=new Object[4][2];
        data[0][0]="username1";
        data[0][1]="password1";
        data[1][0]="username2";
        data[1][1]="password2";
        data[2][0]="username3";
        data[2][1]="password3";
        data[3][0]="username4";
        data[3][1]="password4";
        return data;
    }
    @Test(dataProvider = "getData")
    public void signIn1(String username,String password) {
        System.out.println(username);
        System.out.println(password);

    }
}
