package junit;

class ClassWithConstructor4 {
    private int arg1;
    private int arg2;
    private int arg3;
    private int arg4;

    ClassWithConstructor4(int arg1, int arg2, int arg3, int arg4) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
    }

    // Implementing similarity logic
    boolean isSimilar(Object obj) {
        if (obj instanceof ClassWithConstructor4) {
            ClassWithConstructor4 other = (ClassWithConstructor4) obj;
            return this.arg1 == other.arg1 && this.arg2 == other.arg2 &&
                    this.arg3 == other.arg3 && this.arg4 == other.arg4;
        }
        return false;
    }
}
