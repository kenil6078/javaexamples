import java.util.*;
public class switchcase {

          public static void main(String[] args) {
          Scanner obj = new Scanner(System.in);
                   int no;
                   System.out.println("Enter No");
                   no= obj.nextInt();

                   switch (no) {
                    case 0:
                    System.out.println("Zero");
                              
                              break;
                              case 1:
                              System.out.println("One");
                              break;
                              case 2:
                              System.out.println("Three");
                              break;
                   
                    default:
                    System.out.println("Invalid");
                              break;
                   }

          }
          
}
