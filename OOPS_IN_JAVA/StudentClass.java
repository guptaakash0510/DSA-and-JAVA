package OOPS_IN_JAVA;

public class StudentClass {
    // Creating a new data type

    public static class Student {
        String name;
        int rno;
        double percent;
    }
    // creating car class

    public static class Car{
        String name;
        String type;
        int price;
    }

    public static void change(Student s) {
        s.name = "Rohan";
    }

    public static void main(String[] args) {
        // craeting car object

        Car c1 = new Car();
        c1.name = "Alto";
        c1.price = 400000;
        c1.type = "hatchback";
        // LESSSION :- we should always create a class outside the main funcion so that every function can access the class properties.
        Student x = new Student();
        x.name = "Raghav";
        x.rno = 76;
        x.percent = 92.5;
      //  System.out.println(x.name);
        //System.out.println(x.rno);
        //System.out.println(x.rno + 8);
        //System.out.println(x.percent + 8);

        // creating another object

        Student s2 = new Student();
        s2.name = "Akash";
        s2.percent = 98.5;
        s2.rno = 4;

        // LESSION :-

        // LESSION:- when we pass an object to a function the refference of the object is passed to the calling function.

        System.out.println(s2.name);
        change(s2);
        System.out.println(s2.name);

        // DEAFULT VALUE OF DIFFERENT DATA TYPES WITH IN A CLASS

        Student s3 = new Student();
        System.out.println(s3.name);
        System.out.println(s3.rno);
        System.out.println(s3.percent);
    }

}
