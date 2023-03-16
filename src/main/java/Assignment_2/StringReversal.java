package Assignment_2;

public class StringReversal {
    public static void main(String[] args) {
        String s1 = "plant";
        //converting it to character array
        char[] ch =  s1.toCharArray();
        // shuffling characters inside the character array
        for (int i=0; i<ch.length/2; i++){

            char temp = '0';
            temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        //finally we are printing the character array after converting it to a string
        System.out.println(String.valueOf(ch));
    }
}
