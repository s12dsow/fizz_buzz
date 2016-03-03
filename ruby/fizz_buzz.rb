def fizz_buzz(input)
  str = ''
  str += 'fizz' if input % 3 == 0
  str += 'buzz' if input % 5 == 0

  str.empty? ? input : str
end

