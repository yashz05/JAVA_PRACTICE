package string_buffer;

import java.util.*;
import pck_school.school;
public class stringbuffer {

    // Java StringBuffer class is used to create mutable (modifiable)
    //  String objects. The StringBuffer class in Java is the same as String
    //   class except it is mutable i.e. it can be changed.
    public static void main(String[] args) {
        System.out.println("Enter String ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
        System.out.println(sb.insert(0,'y')); //adds at position
        System.out.println(sb.append('o'));  // adds in the end
        System.out.println(sb.substring(1)); 
        System.out.println(sb.charAt(5)); 
        // school n = new school();
        

    }
}
