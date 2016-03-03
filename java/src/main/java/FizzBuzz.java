public class FizzBuzz {
    public String fizzBuzz(Integer input) {
        String returnInput = (input % 3 == 0) ? "fizz" : "";
        returnInput += (input % 5 == 0) ? "buzz" : "";

        if (returnInput.isEmpty()) {
            return input.toString();
        }
        return returnInput;
    }
}

