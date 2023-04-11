package Assignment_4;

public class Calculations implements Father,Son{

    public int add(){
        return a+b;
    }
    public int mul(){
        return x*y;
    }

    public static void main(String[] args) {
        Calculations c = new Calculations();
        System.out.println(c.add());

        System.out.println(c.mul());
    }

}
