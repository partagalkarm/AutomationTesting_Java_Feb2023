package Assignment_3;

public class Student {
    int sid; int sub1; int sub2; int sub3;
    String sname;

    void setStuData (int sid, String sname){
      this.sid = sid;
      this.sname = sname;
    }
    void setStuMarks(int sub1, int sub2, int sub3){
    this.sub1 =sub1;
    this.sub2 = sub2;
    this.sub3 = sub3;
    }
    void totalMarks(){
    int Total = sub1+sub2+sub3;
    String finalStr = sid +" , "+ sname + " , total marks  = " + Total;
            System.out.println(finalStr);
        //1 , manju , total marks = 100

    }
    int TotalMarks2(){
        int sum = sub1+sub2+sub3;
        return sum;
    }
}
