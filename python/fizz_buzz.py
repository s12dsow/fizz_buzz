def fizz_buzz(num):
    string = ""
    if num % 3 == 0:
        string += "fizz"
    if num % 5 == 0:
        string += "buzz"

    return string or num
