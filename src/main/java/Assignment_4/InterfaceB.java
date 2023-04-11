package Assignment_4;

public class InterfaceB implements InterfaceA{
   public int sum(){
       return a+b;
   };
    public static void main(String[] args) {
        InterfaceB b = new InterfaceB();
        System.out.println(b.sum());
    }
}
