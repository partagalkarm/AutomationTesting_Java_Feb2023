package Assignment_2;

public class GreatestSmallestElementinArray {
    public static void main(String[] args) {

        int[] arr = new int[]
                {12, 16, 27, 32, 35, 48, 76, 89};
        //assign first element of an array to larges and smallest
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];

        }

        System.out.println("Largest number is:" + largest);
        System.out.println("Smallest number is:" + smallest);
    }
}

