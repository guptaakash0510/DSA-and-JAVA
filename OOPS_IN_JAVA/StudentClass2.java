package OOPS_IN_JAVA;

public class StudentClass2 {
    public static void main(String[] args) {
////        Student s1 = new Student();
////        s1.name = "Akash";
////        s1.percent = 92.4;
////      //  s1.rno = 58;
////     //   System.out.println(s1.getRno());
////        s1.setRno(2);
////        System.out.println(s1.getRno());
//
//        // 3) Application of constructor
//       Student sc = new Student("Akash",12,94.2);
//        System.out.println(sc.name);
//        System.out.println(sc.rno);
//        System.out.println(sc.percent);
//        // sc.schoolName = "ksjd"; //we can't do this operation.
//        System.out.println(sc.schoolName);
//
//        Student sc2 = new Student("Rohit",67,95);
//
//        // LESSION:- WHEN WE CREATE OUR OWN CONSTRUCTOR THEN WE NEED TO CREATE A NON PARAMETERISED CONSTRUCTOR TO INITIALISE A OBJECT WITHOUT A NY PARAMETERS;
//
//        Student sc3 = new Student();
//        sc3.name = "Aman";
//        sc3.rno = 21;
//        sc3.percent = 91.6;
//
//        //LESSION :- We can also create a constructor without all of it's parameters.
//
//        Student sc4 = new Student("Ajay",24);

        // 4) USE of static keyword
//        Student s1 = new Student("Akash", 20,96.5);
//      //  System.out.println(s1.numberOfStudents);
//        Student s2 = new Student("Aman", 27,88.2);
//     //   System.out.println(s2.numberOfStudents);
//        Student s3 = new Student("Akshit", 36,84.6);
//        System.out.println(s1.numberOfStudents);
//        System.out.println(s2.numberOfStudents);
//        System.out.println(s3.numberOfStudents);

        // 5) Use of static function

       // System.out.println(Student.numberOfStudents); // We can only access static variable useing (clasname.) operator.
       // Student.numberOfStudents = 100; // We can only access static variable useing (clasname.) operator.
        System.out.println(Student.getNumberOfStudents()); // It's a wrong statement if getNumberOfStudents() function is not static.
        Student.num();
        System.out.println(Student.getNumberOfStudents());
        Student s1 = new Student("Akash", 20,96.5);
        Student s2 = new Student("Aman", 27,88.2);
        Student s3 = new Student("Akshit", 36,84.6);
        System.out.println(s1.getNumberOfStudents());
        System.out.println(s2.getNumberOfStudents());
        System.out.println(s3.getNumberOfStudents());
    }
}
