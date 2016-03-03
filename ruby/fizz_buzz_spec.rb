require_relative 'fizz_buzz'

describe '#fizz_buzz' do

  it 'prints 1 when input is 1' do
    expect(fizz_buzz(1)).to eq(1)
  end
  it 'prints fizz when input is 3' do
    expect(fizz_buzz(3)).to eq('fizz')
  end

  it 'prints fizz when input is divisible by 3' do
    expect(fizz_buzz(9)).to eq('fizz')
  end

  it 'prints buzz when input is 5' do
    expect(fizz_buzz(5)).to eq('buzz')
  end

  it 'prints buzz when input is divisible by 5' do
    expect(fizz_buzz(10)).to eq('buzz')
  end

  it 'prints fizzbuzz when input is 15' do
    expect(fizz_buzz(15)).to eq('fizzbuzz')
  end

  it 'prints fizzbuzz when input is divisible by 15' do
    expect(fizz_buzz(30)).to eq('fizzbuzz')
  end

  it 'prints 1 when input is 1' do
    expect(fizz_buzz(1)).to eq(1)
  end
end
