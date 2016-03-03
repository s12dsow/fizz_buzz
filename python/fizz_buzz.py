def fizz_buzz(num):
    return_string = ""
    if num % 3 == 0:
        return_string += "fizz"
    if num % 5 == 0:
        return_string += "buzz"

    return return_string or num
