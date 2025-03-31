class thread1 implements Runnable{
          public void run(){
                    for(int i=1;i<=5;i++){
                              System.out.println("Base Class");
                              try{
                                        Thread.sleep(1000);
                              }
                              catch(InterruptedException e)
                              {

                              }
                    }
          }
}
class mythreadex{
          public static void main(String[] args) {
                    thread1 obj = new thread1();
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
                    obj.run();
          }
}