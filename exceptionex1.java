public class exceptionex1 {
          public static void main(String[] args) {
                    int ans;
                    try
                    {
                              ans = 10/0;
                              System.out.println("Ans :" + ans);
                    }
                    catch(ArithmeticException e)
                    {
                              System.out.println("Can't Divide Zero");
                    }
          }
          
}
