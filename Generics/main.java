package Generics;
class obj <T>{ // Generic class
    T roll_no; //Generic Variable
    String name;

    obj(T rolT , String name){
        this.roll_no = rolT;
        this.name = name;
    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
    }
    static <T> void printanything(T n){
        // Generic function
        System.out.println(n.getClass() + " " + n.toString());
    }

    // Genrics can be used to accept any type of data in paramete / class / List.
    //to use generic use <T>

}
public class main {
    public static void main(String[] args) {
        // call above class 
        obj <Integer> n = new obj <Integer> (1,"yash");
        n.print();
        n.printanything("Yash");
    }
}
