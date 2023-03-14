package Assignment_1;

public class Palindrome {
    public static void main(String[] args) {
        int lastDigit, sum = 0, a;
        int inputNumber = 171;

        a = inputNumber;
        while (a>0){
            System.out.println("Input number" +a);
            lastDigit = a%10;
            System.out.println("Last Digit" +lastDigit);
            System.out.println("Digit" +lastDigit+ "was added to sum"+ (sum*10));
            sum = (sum*10) + lastDigit;
            a = a/10;
        }
        if(sum == inputNumber){
            System.out.println("Number is Palindrome");
        } else
            System.out.println("Number is not Palindrome");
    }
}
