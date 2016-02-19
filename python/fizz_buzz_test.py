import unittest
from fizz_buzz import fizz_buzz


class TestFizzBuzz(unittest.TestCase):
    """Tests for `fizzbuzz.py` ."""

    def test_input_of_1_is(self):
        """input of 1 returns 1"""
        self.assertEqual(fizz_buzz(1), 1)

    def test_input_of_3_is(self):
        """input of 3 returns fizz"""
        self.assertEqual(fizz_buzz(3), 'fizz')

    def test_multiple_of_3_is(self):
        """multiple of 3 returns fizz"""
        self.assertEqual(fizz_buzz(9), 'fizz')

    def test_input_of_5_is(self):
        """input of 5 returns buzz"""
        self.assertEqual(fizz_buzz(5), 'buzz')

    def test_multiple_of_5_is(self):
        """multiple of 5 returns buzz"""
        self.assertEqual(fizz_buzz(10), 'buzz')

    def test_input_of_15_is(self):
        """input of 15 returns fizzbuzz"""
        self.assertEqual(fizz_buzz(15), 'fizzbuzz')

    def multiple_of_15_is(self):
        """multiple of 15 returns fizzbuzz"""
        self.assertEqual(fizz_buzz(30), 'fizzbuzz')


if __name__ == '__main__':
    unittest.main()