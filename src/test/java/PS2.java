public class PS2 extends  PS3{
    public PS2(int a) {
        super(a);
    }

    public static void main(String[] args) {
        System.out.println("i am from child class");
       //PS3 ps=new PS3(3);
       parent();
        System.out.println(increament());

    }
}
