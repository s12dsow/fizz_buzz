def fizz_buzz(input)
  return_input = ''
  return_input += 'fizz' if input % 3 == 0
  return_input += 'buzz' if input % 5 == 0

  return_input.empty? ? input : return_input
end

