class rect
{
          int len,wid;
          void getdata(int l,int w)
          {
                    len=l;
                    wid=w;
          }
          void putdata()
          {
                    System.out.println("Length Is :" + len);
                    System.out.println("Width is :" + wid);
          }
}



public class classprg {

          public static void main(String[] args) {
                    rect obj = new rect();
                    obj.getdata(10,10);
                 //   obj.len=40;
                 //  obj.wid=40;
                    obj.putdata();
          }
          
}
