package Assignment_1;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey user type a no.");
        int input = sc.nextInt();
        if (input > 0){
            System.out.println("Number is positive");
        } else if (input < 0) {
            System.out.println("Number is Negative"); }
        else {
                System.out.println("Number is zero");
            }

        }
    }


