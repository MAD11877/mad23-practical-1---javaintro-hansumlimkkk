import java.util.Scanner;

public class Question4
{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the base of the triangle: ");
      int base = scanner.nextInt();

      for (int i = base; i >= 1; i--) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
