package Custom_exception;

class Agevalidation extends Exception {
    public Agevalidation(String str){
        super(str);
        //send data to Exception constructor
    }
}

public class main {
    public static void agecheck(int age) throws Agevalidation {
        if(age < 18)
            throw new Agevalidation("Your should have minimum age 18");
    }
    public static void main(String[] args) {

        int age = 17;
        try {
            agecheck(age);
        }
          
        catch (Agevalidation e) {
           System.out.println(e.getMessage());
        }
        
        
    }
    
}
