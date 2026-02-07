package OOPS_IN_JAVA;

public class Student {
   // public String name;
    String name; //for
   // private int rno; // USE OF PRIVATE KEYWORD
    int rno;
    double percent;
    final String schoolName = "ASDM"; // USE OF FINAL KEYWORD
    // static int numberOfStudents;// USE OF static keyword
      private static int numberOfStudents;

      public static void num(){
          numberOfStudents = 80;
      }
    public int getRno() {
        return rno;
    }

    public void setRno(int roll) {
        rno = roll;
    }

    // **) use of static function
    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    // 2) Application of this keyword
//
//    public void setRno(int rno) {
//        this.rno = rno;
//    }

    // 3) Application of constructor

    public Student() {

    }

//    public Student(String naam, int roll, double per) {
//        name = naam;
//        rno = roll;
//        percent = per;
//    }

    public Student(String naam, int roll) {
        name = naam;
        rno = roll;
    }

    public Student(String name, int rno, double percent) {
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numberOfStudents++;
    }
}
