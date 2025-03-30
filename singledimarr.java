import java.util.Scanner;

public class singledimarr {
          public static void main(String[] args)
           {
                    Scanner obj = new Scanner(System.in);
                    int a[] = new int[5];
                    int i;
                    for( i=0; i<a.length;i++)
                    {
                              System.out.println("Enter Array");
                              a[i]=obj.nextInt();
                    }

                    for(i=0;i<a.length;i++)
                    {
                              System.out.println("Array Is  " + a[i]);
                    }
                    System.out.println();

          }
}
