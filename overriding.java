class base{
          int a=0,b=0;
         void disp()
          {
                    System.out.println("Base Class");
          }
          void disp(int x)
          {
                    a=x;
                    System.out.println(a);
          }
          void disp(int x, int y)
          {
                    a=x;
                    b=y;
                    System.out.println(a);
                    System.out.println(b);
          }

}
class derived extends base {

          void disp()
          {
                    System.out.println("Derived Class");
          }          
}


 public class overriding {
          public static void main(String[] args) {
                    derived ob = new derived();
                    ob.disp();
                    ob.disp(10);
                    ob.disp(10, 20);
                    
          }
}
