class first
{
          int a,b;
          void getf(int v1,int v2)
          {
                    a=v1;
                    b=v2;

          }
}
class second extends first{
          int x,y;
          void gets(int v1,int v2){
                    getf(v1, v2);
                    x=v1;
                    y=v2;
          }
          void disp()
          {
                    System.out.println("A :" + a);
                    System.out.println("B :" + b);
                    System.out.println("C :" + x);
                    System.out.println("D :" + y);
          }
}


public class coninheritance {
          public static void main(String[] args) {
                    second s = new second();
                    s.gets(100,200);
                    s.disp();
          }
          
}
