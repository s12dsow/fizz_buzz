
function fizzBuzz(input) {

    if (input % 15 == 0) {
        return "fizzbuzz"
    } else if (input % 3 == 0) {
        return "fizz";
    } else if (input % 5 == 0) {
        return "buzz";
    } else {
        return input;
    }
}

module.exports = fizzBuzz