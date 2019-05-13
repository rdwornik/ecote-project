 interface Interface{
    void foo(int n, int h, int p);
}

 public class Demo{
     public static void main(String[] args) {

         Interface foo = (n,r,g) -> {
             n++;
         };
     }

 }




