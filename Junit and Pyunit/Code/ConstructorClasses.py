import unittest

class ClassWithConstructor1:
    def __init__(self, arg1):
        self.arg1 = arg1

    def is_similar(self, other):
        return isinstance(other, ClassWithConstructor1) and self.arg1 == other.arg1

class ClassWithConstructor2:
    def __init__(self, arg1, arg2):
        self.arg1 = arg1
        self.arg2 = arg2

    def is_similar(self, other):
        return isinstance(other, ClassWithConstructor2) and self.arg1 == other.arg1 and self.arg2 == other.arg2

class ClassWithConstructor3:
    def __init__(self, arg1, arg2, arg3):
        self.arg1 = arg1
        self.arg2 = arg2
        self.arg3 = arg3

    def is_similar(self, other):
        return isinstance(other, ClassWithConstructor3) and \
               self.arg1 == other.arg1 and self.arg2 == other.arg2 and self.arg3 == other.arg3

class ClassWithConstructor4:
    def __init__(self, arg1, arg2, arg3, arg4):
        self.arg1 = arg1
        self.arg2 = arg2
        self.arg3 = arg3
        self.arg4 = arg4

    def is_similar(self, other):
        return isinstance(other, ClassWithConstructor4) and \
               self.arg1 == other.arg1 and self.arg2 == other.arg2 and \
               self.arg3 == other.arg3 and self.arg4 == other.arg4

class ClassWithConstructor5:
    def __init__(self, arg1, arg2, arg3, arg4, arg5):
        self.arg1 = arg1
        self.arg2 = arg2
        self.arg3 = arg3
        self.arg4 = arg4
        self.arg5 = arg5

    def is_similar(self, other):
        return isinstance(other, ClassWithConstructor5) and \
               self.arg1 == other.arg1 and self.arg2 == other.arg2 and \
               self.arg3 == other.arg3 and self.arg4 == other.arg4 and self.arg5 == other.arg5

class TestClassWithConstructors(unittest.TestCase):
    def test_similarity(self):
        obj1 = ClassWithConstructor1(1)
        obj2 = ClassWithConstructor2(1, 2)
        obj3 = ClassWithConstructor3(1, 2, 3)
        obj4 = ClassWithConstructor4(1, 2, 3, 4)
        obj5 = ClassWithConstructor5(1, 2, 3, 4, 5)

        self.assertFalse(obj1.is_similar(obj2))
        self.assertFalse(obj1.is_similar(obj3))
        self.assertFalse(obj1.is_similar(obj4))
        self.assertFalse(obj1.is_similar(obj5))

if __name__ == '__main__':
    unittest.main()
