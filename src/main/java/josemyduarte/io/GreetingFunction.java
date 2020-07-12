package josemyduarte.io;

import io.quarkus.funqy.Funq;

public class GreetingFunction {

    @Funq
    public String funqyHello() {
        return "hello funqy";
    }

    @Funq
    public String funqyBye() {
        return "bye funqy";
    }

}
