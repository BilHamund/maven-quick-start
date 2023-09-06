package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    // The sealed class Animal
public sealed class Animal permits Dog {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// A permitted subclass of Animal
public final class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello, ");

        for (String greeting : greetings) {
            System.out.println("Greetings" + greeting);
        }
    }

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
      app.greet();
    }
}
