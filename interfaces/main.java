package interfaces;

// Why And When To Use Abstract Classes and Methods?
// To achieve security - hide certain details and only show the important details of an object.
abstract class animal {
    public void animalsound() {
        System.out.println("COMMON SOUND");
    };

    public abstract void sound();

}

class pig extends animal {
    public void sound() {
        System.out.println("OINK OINK");
        // MANDATORY TO CALL THIS BECUASE ITS ABSTRACT FUNCTION
    }
}

public class main {
    public static void main(String[] args) {
        System.out.print("Test");
        pig small = new pig();
        small.animalsound();
        small.sound();

    }
}
