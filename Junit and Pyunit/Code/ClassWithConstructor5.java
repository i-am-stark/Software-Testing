package junit;

class ClassWithConstructor5 {
    private int arg1;
    private int arg2;
    private int arg3;
    private int arg4;
    private int arg5;

    ClassWithConstructor5(int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
        this.arg5 = arg5;
    }

    // Implementing similarity logic
    boolean isSimilar(Object obj) {
        if (obj instanceof ClassWithConstructor5) {
            ClassWithConstructor5 other = (ClassWithConstructor5) obj;
            return this.arg1 == other.arg1 && this.arg2 == other.arg2 &&
                    this.arg3 == other.arg3 && this.arg4 == other.arg4 && this.arg5 == other.arg5;
        }
        return false;
    }
}