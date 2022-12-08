package Interface;

interface animal {
    public void sound1();
    public void sound2();
}
interface animal_2 {
    public void sound3();
}
class pig implements animal ,animal_2{
    // In interface all initiated classes shud be called 
    // MULTIPLE INTERFACES CAN BE CALLED IN ONE CLASS
    // For using interface use implements
    public void sound1(){
        System.out.println("OINK");
    }
    public void sound2(){
        System.out.println("OINK OINK");
    }
    public void sound3(){
        System.out.println("OINK OINK OINK");
    }
}

public class main {
    public static void main(String[] args) {
        pig p = new pig();
        p.sound1();
        p.sound2();
    }
}
