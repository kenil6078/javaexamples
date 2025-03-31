public class exceptionex2 {

          public static void main(String[] args) {
                    int a=10,b=0,ans;
                    int no[] = {1,2,3};
                    try
                    {
                              ans=a/b;
                              System.out.println("Ans :" + ans);
                              System.out.println("No :" + no[5]);
                    }
                    catch(ArithmeticException e)
                    {
                              System.out.println("Can't Divide By Zero");
                    }
                    catch(ArrayIndexOutOfBoundsException e1)
                    {
                              System.out.println("Array Mistake");
                    }
                    finally
                    {
                              System.out.println("End Program");
                    }
          }
          
}
