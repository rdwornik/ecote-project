/*
Failing case mising commas with no parameters followed
 */


interface Interface{
    void foo(Object n, Object h, Object p);
}

public class Case6{
    public static void main(String[] args) {

        Interface foo =(l,,,,) -> {
            System.out.println("hello");
        };
    }
}