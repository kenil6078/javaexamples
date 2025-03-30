class abc
{
          int a=10,b=20;
          void disp()
          {
                    System.out.println(a);
                    System.out.println(b);
          }
          void disp(int a, int b)
          {
                    System.out.println(a);
                    System.out.println(b);
          }
}

public class polymorphismex {

          public static void main(String[] args) {
                    abc obj = new abc();
                    obj.disp();
                    obj.disp(10,20);
          }
          
}
