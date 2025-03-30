class base
{
          int x,y;
          void getdata(int a, int b)
          {
                    x=a;
                    y=b;

          }
          void putdata()
          {
                    System.out.println(x);
                    System.out.println(y);
          }
}
class derived extends base
{
          void display()
          {
                    getdata(10,20);
                    putdata();
          }

}


public class singleinherit {
          public static void main(String[] args) {
                    derived obj = new derived();
                    obj.display();
          }
}
