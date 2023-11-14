import java.util.*;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Vikram");

        // Class = logical constructor reality me nahi hai
        // Object = physical constructor actual me hai == Occupying space and memory
        // usage

        // data of 5 students : { rollnumber , name , mark}
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] mark = new float[5];

        Student[] students = new Student[5];

        // just declaring
        // Student vikram;
        // vikram = new Student();
        // System.out.println(Arrays.toString(students));

        Student vikram = new Student(7, "vikram" , 95.8f);
        Student rahul = new Student();
        // Student() is constructor

        // vikram.rollno = 67;
        // vikram.name = "vikram";
        // vikram.mark = 95f;

        // Constructor is a special function that runs when you create a object and it
        // allocate some variables and

        System.out.println(vikram.rollno);
        System.out.println(vikram.name);
        System.out.println(vikram.mark);

        //  vikram.changeName("vikram kumar");

        // vikram.greeting();

       
    }
}

// create a class
// for every student
class Student {
    // int[] rollno = new int[5];
    // String[] name = new String[5];
    // float[] mark = new float[5];
    int rollno;
    String name;
    float mark;

    // we need a way to add the values of the above
    // properties object by object
    // we need one word to access every object
    void changeName(String newName) {
        name = newName;
    }

    void greeting() {
        System.out.println("Hello! My name is " + name);
    }

    Student() {
        this.rollno = 67;
        this.name = "vikram";
        this.mark = 95f;

    }
 
    // Student(int rollno, String name , float mark) {
    //    this.rollno = rollno;
    //     this.name = name;
    //     this.mark = mark;
     
    //     // here you can also change the parameters from name to naam ,rollno to roll , mark to marks then 
    //     // you don't need to use this. just use rollno=rol, name=naam , mark = marks.
       // as shown in example below both will give same output

    //     }

        Student(int roll , String naam , float marks) {
            rollno = roll;
            name = naam;
            mark = marks;
        }
}
