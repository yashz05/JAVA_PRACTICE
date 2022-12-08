package pck_school;
// A java package is a group of similar types of classes, interfaces and sub-packages.

// Package in java can be categorized in two form, built-in package and user-defined package.

// There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

// Here, we will have the detailed learning of creating and using user-defined packages.
public class school {
    int roll_no;
    String name;
    public void take_input(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
     public school() {
        System.out.println("TEST CONSTRUCTOR");
    }
   public void showstudent() {
        System.out.println(this.roll_no);
        System.out.println(this.name);
    }
}
