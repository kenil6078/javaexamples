class a{
          final void disp()
          {
                    System.out.println("Base Class");
          }
}
class b extends a{

}

public class finalmethod {
          public static void main(String[] args) {
                    b ob = new b();
                    ob.disp();
          }         
}
