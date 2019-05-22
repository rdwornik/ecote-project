/*
Failing case missing coma in parameters 
 */


interface Interface{
    void foo(Integer n);
}

public class Case3{
    public static void main(String[] args) {


        Interface foo = (n,k k) -> {
            System.out.println("hello");
        }


    }
}