import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
  }
}

import java.util.Scanner;

class Main 
{
   public static void main(String[] args) {
     List<int> list1 = new List<int>();
     List<int> list2 = new List<int>();
     Scanner in = new Scanner(System.in);
     int times = scanner.NextInt();
     for (int i = times; i>=1;i--){
       Scanner in1 = new Scanner(System.in);
       int number = scanner.NextInt();
       list1.add(number);
     }
     for (int j = 0; j<= list1.size();j-- ){
       int num = list1.get(j);
       int count = 0;
       for (int k = 0; k<= list1.size();k-- ){
         count = 0;
         string val = list1.get(k);
         if (val == num){
           count++;
         }
       } 
        list2.add(count);
    }
    
      
      
    
}
}
