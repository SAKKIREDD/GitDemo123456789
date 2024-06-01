import org.testng.annotations.Test;

public class AnnotationHelpers {
    @Test(priority = 2)
    public void priority2() {
        System.out.println("execute second");
    }
    @Test(enabled = false)
    public void help2() {
        System.out.println("2.call to friends");
    }
    @Test(priority = 2)
    public void normal() {
        System.out.println("normal testNG method");
    }
    @Test(dependsOnMethods = {"help4"})
    public void help1() {
        System.out.println("4.call to police");
    }
    @Test(timeOut = 1)
    public void help4() {
        System.out.println("1.call to parents");
    }



    @Test(enabled = false)
    public void help3() {
        System.out.println("3.call to neighbours");
    }



    @Test(priority = 1)
    public void priority1() {
        System.out.println("execute first");
    }


}
