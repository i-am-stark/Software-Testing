package junit;

class ClassWithConstructor3 {
    private int arg1;
    private int arg2;
    private int arg3;

    ClassWithConstructor3(int arg1, int arg2, int arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    // Implementing similarity logic
    boolean isSimilar(Object obj) {
        if (obj instanceof ClassWithConstructor3) {
            ClassWithConstructor3 other = (ClassWithConstructor3) obj;
            return this.arg1 == other.arg1 && this.arg2 == other.arg2 && this.arg3 == other.arg3;
        }
        return false;
    }
}
