public class mythread  extends Thread {
          public void run()
          {
                    for (int i = 1; i <=5; i++) {
                              System.out.println("Class");
                              try{
                                        Thread.sleep(1000);
                              }
                              catch(InterruptedException e)
                              {
                                        
                              }
                    }

          }
}
class threadex1
{
          public static void main(String arg[])
          {
                    mythread t = new mythread();
                    t.start();
                    for(int i=1;i<=5;i++)
                    {
                              System.out.println("Main Class");
                              try{
                                        Thread.sleep(1000);
                              }
                              catch(InterruptedException e)
                              {
                                        
                              }
                    }
          }
}
