package Method_overloading;

// create class

class testobj {
    static void calculate(int a, int b ){

      System.out.println("added two numbers : " + (a+b));

    }
    static void calculate(String a , String b ){
        System.out.println("Concatted two String : " + (a+b));
    }
    public void calculate(double a,double b){
        System.out.println("Added two float : " + (a+b));
    }
}

public class mian {
    
    
   public static void main(String[] args) {
    // In method overloading you can call function via class name here because function is static
    testobj.calculate("yash", "Chowdhari");
    testobj.calculate(1, 2);
    
    testobj o = new testobj();
    o.calculate(1.99999, 8.999999); // function here is public so have to create obj and allocate memory to it
   }
}
