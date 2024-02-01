package junit;

class ClassWithConstructor2 {
    private int arg1;
    private int arg2;

    ClassWithConstructor2(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    // Implementing similarity logic
    boolean isSimilar(Object obj) {
        if (obj instanceof ClassWithConstructor2) {
            ClassWithConstructor2 other = (ClassWithConstructor2) obj;
            return this.arg1 == other.arg1 && this.arg2 == other.arg2;
        }
        return false;
    }
}
