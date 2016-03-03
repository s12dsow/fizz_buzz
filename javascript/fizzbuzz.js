
function fizzBuzz(input) {
    var returnValue = "";

    if (input % 3 == 0) {
        returnValue += "fizz";
    }
    if (input % 5 == 0) {
        returnValue += "buzz";
    }
    if (!returnValue) {
        return input;
    }
    return returnValue;
}

module.exports = fizzBuzz
