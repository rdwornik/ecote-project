/*
Failing case mising semicolon
 */


interface Interface{
    void foo(Object n, Object h, Object p);
}

public class Case6{
    public static void main(String[] args) {

        Interface foo =(l,h) -> {
            System.out.println("hello");
        }
    }
}