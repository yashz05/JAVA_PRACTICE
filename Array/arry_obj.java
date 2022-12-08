// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class testobj {
    int roll;
    String name;
}
class HelloWorld {
    public static void main(String[] args) {
        testobj[] arr = new testobj[2];
        Scanner sc  = new Scanner(System.in);
        for (int i =0; i < arr.length ; i ++){
            testobj y = new testobj();
            System.out.println("Enter Roll No " +i);
            y.roll = sc.nextInt();
            System.out.println("Enter Name");
            y.name = sc.next();
            arr[i] = y ;
        }

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].roll);
                System.out.println(arr[i].name);
            }
        
        
    }
}