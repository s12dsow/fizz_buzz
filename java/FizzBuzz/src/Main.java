public class Main {

    public String fizzBuzz(Integer input) {
        String string = (input % 3 == 0) ? "fizz" : "";
        string += (input % 5 == 0) ? "buzz" : "";

        return string;
    }
}
