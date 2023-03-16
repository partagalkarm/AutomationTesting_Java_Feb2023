package Assignment_2;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s = "Th    is   is  my  auto  mation";
        s= s.replaceAll("\\s", "");
        System.out.println("After replacement: " +s);
    }
}
