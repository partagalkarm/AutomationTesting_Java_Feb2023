package Assignment_1;

public class Greatest_Number {
    public static void main(String[] args) {
        int s1 = 30;
        int s2 = 20;
        int s3 = 10;

        if (s1 >= s2 && s1 >= s3) {
            System.out.println(s1 + " is the largest number");}
        else if (s2 >= s1 && s2 >= s3) {
                System.out.println(s2 + " is the largest number");
            } else
                System.out.println(s3 + " is the largest number");

    }
}
