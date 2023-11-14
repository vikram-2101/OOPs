import java.util.*;
public class WrapperExample {
     public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num = 45;
        
        swap(a, b);
        System.out.println(a +  " " + b);
        // There will be no swapping even if you change int to Integer
        
     final A vikram = new A("vikram kumar");
       vikram.name = "other name"; // this is allowed 

        // when a non primitive is final then you can't reassign it 
       // vikram = new A("vikram kumar");   This is not possible

          //Garbage Collection
       A obj;
       for (int i = 0; i < 100000000; i++) { 
        obj = new A("vikram kumar");
       }
     }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
}

   static class A {
    final int num = 10;
    // final means you can't change the value 
    // you also have to initialize the final value 

    String name;

    public A(String name) {
     this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
        System.out.println("Object is destroyed");
    }
}
}
