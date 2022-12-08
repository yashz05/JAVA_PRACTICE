package Inheritance;

class p1{
    String name;
    String address;
    public void setname(String name){
        this.name = name;
    }
}

class p2 extends p1 {
    
    int roll_no = 10;
}
public class main {
    public static void main(String[] args) {
        p2 p = new p2();
        p.setname("Yash");
        System.out.println(p.name);//parent class
        System.out.println(p.roll_no); // child class
        
    }
}
