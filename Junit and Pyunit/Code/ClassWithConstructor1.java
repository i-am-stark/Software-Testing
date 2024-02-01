package junit;

class ClassWithConstructor1 {
    private int arg1;

    ClassWithConstructor1(int arg1) {
        this.arg1 = arg1;
    }

    // Implementing similarity logic
    boolean isSimilar(Object obj) {
        if (obj instanceof ClassWithConstructor1) {
            ClassWithConstructor1 other = (ClassWithConstructor1) obj;
            return this.arg1 == other.arg1;
        }
        return false;
    }
}
