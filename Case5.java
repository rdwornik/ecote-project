/*
Failing case mising closing parenthesis
 */


interface Interface{
    void foo(Object n, Object h, Object p);
}

public class Case5{
    public static void main(String[] args) {

        Interface foo = (l,n -> {
            System.out.println("hello");
        };
    }
}