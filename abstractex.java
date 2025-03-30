abstract class base{
          abstract void disp();

}
class derived extends base
{
          void disp()
          {
                    System.out.println("Abstract Method");
          }
}

public class abstractex {
          public static void main(String[] arg)
          {
                    derived obj = new derived();
                    obj.disp();
          }
          
}
