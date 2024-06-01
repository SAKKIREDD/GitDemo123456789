public class PS3 {
    public PS3(int a) {
        this.a = a;
    }

    public static void parent() {
        System.out.println("i am from Parent class");
    }

    public static void parent1() {
        System.out.println("i am from Parent1 class");
    }

    static int a;

    public static int increament() {
        a = a + 1;
        return a;
    }

    public int decreament() {
        a = a - 1;
        return a;
    }
}
