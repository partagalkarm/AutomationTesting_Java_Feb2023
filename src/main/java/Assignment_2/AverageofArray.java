package Assignment_2;

public class AverageofArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 8, 9, 14};
        //calculate sum of all array elements
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        //calculate average value
        float average = sum/arr.length;

        System.out.println("Average value of an array:"+ average);
    }
}
