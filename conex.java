class rect
{
          int a,b;
          rect()
          {
                    a=0;
                    b=0;
          }
          rect( int x, int y)
          {
                    a=x;
                    b=y;
          }
          void disp()
          {
                    System.out.println(a);
                    System.out.println(b);
          }
}

public class conex {
          public static void main(String[] args) {
                    rect r1 = new rect();
                    rect r2 = new rect(10,20);

                    r1.disp();
                    r2.disp();
          }
          
}
