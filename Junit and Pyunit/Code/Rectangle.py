import unittest

class Rectangle:
    def __init__(self, length, width):
        self.length = length
        self.width = width

    def area(self):
        return self.length * self.width

    def perimeter(self):
        return 2 * (self.length + self.width)

class TestRectangle(unittest.TestCase):
    def test_area(self):
        rectangle = Rectangle(3, 4)
        self.assertEqual(rectangle.area(), 12)

    def test_perimeter(self):
        rectangle = Rectangle(3, 4)
        self.assertEqual(rectangle.perimeter(), 14)

if __name__ == '__main__':
    unittest.main()
