/*
Failing case wrong format of parameters
 */


interface Interface{
    void foo(Object n,Object l);
}

public class Case4{
    public static void main(String[] args) {

        Interface foo = (n, k k k) -> {
            System.out.println("hello");
        };
    }
}
