public interface Indicator {
    default void indicate() {
        System.out.println("default indicate");
    }

    private void f() {

    }

    static void staticInterfaceMethod () {

    }

    int CONST_1 = 100;
}
