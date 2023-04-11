package Assignment_3;

public class StudentDemo {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        st1.setStuData(1,"Manju");
        st2.setStuData(2,"Ohana");

        st1.setStuMarks(100,200,300);
        System.out.println(st1.TotalMarks2());


    }
}
