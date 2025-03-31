public class exceptionex3 {
          public static void find() throws ArithmeticException
          {
                    int ans;
                    ans = 5/0;
                    System.out.println("Ans :" + ans);
          }
          public static void main(String[] args) {
                    try
                    {
                              find();
                    }
                    catch(ArithmeticException e)
                    {
                              System.out.println("Cant Divide Zero");
                    }
          }
}
