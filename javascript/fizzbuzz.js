
function fizzBuzz(input) {
    var string = "";

    if (input % 3 == 0) {
        string += "fizz";
    }

    if (input % 5 == 0) {
        string += "buzz";
    }

    return string;
}

module.exports = fizzBuzz