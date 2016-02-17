def fizz_buzz(input)
  if input % 15 == 0
    'fizzbuzz'
  elsif input % 3 == 0
    'fizz'
  elsif input % 5 == 0
    'buzz'
  else
    input
  end
end
