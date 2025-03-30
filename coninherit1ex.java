class first
{
          int a,b;
          first(int v1,int v2)
          {
                    a=v1;
                    b=v2;
          }
}
class second extends first
{
          int x,y;
          second(int v1,int v2)
          {
                    super(v1,v2);
                    x=v1;
                    y=v2;
          }
          void disp()
          {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(x);
                    System.out.println(y);
          } 
}

public class coninherit1ex {
          public static void main(String[] args) {
                    second s =new second(10, 20);
                    s.disp();
          }
          
}
