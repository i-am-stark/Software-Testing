import unittest

class List:
    def __init__(self):
        self.items = []

    def find(self, item):
        return item in self.items

    def insert(self, item):
        self.items.append(item)

class TestList(unittest.TestCase):
    def test_find(self):
        my_list = List()
        my_list.insert(1)
        my_list.insert(2)
        my_list.insert(3)

        self.assertTrue(my_list.find(2))
        self.assertFalse(my_list.find(4))

    def test_insert(self):
        my_list = List()
        my_list.insert(1)
        my_list.insert(2)
        my_list.insert(3)

        self.assertTrue(my_list.find(2))
        self.assertTrue(my_list.find(3))
        self.assertTrue(my_list.find(1))

if __name__ == '__main__':
    unittest.main()
