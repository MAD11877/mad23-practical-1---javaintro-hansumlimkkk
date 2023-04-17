import java.util.Scanner;

public class Question5
{  
  public static void main(String args[]) { 
    double highest = Math.pow(-999999,999999);
    int mode = 0;
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    
    Scanner in = new Scanner(System.in);
    int times = in.nextInt();

    for (int i = times; i >= 1; i--){
      Scanner in1 = new Scanner(System.in);
      int number = in1.nextInt();
      list1.add(number);
    }
    
    //System.out.println(list1.size());
    
    for (int j = 0 ; j< list1.size(); j++){
      int num = list1.get(j);
      int count = 0;
      for (int k = 0; k< list1.size(); k++){
        //count = 0;
        int val = list1.get(k);
        if (val==num){
          count++;
        }
      }
      list2.add(count);
    }
    for (int l = 0 ; l < list2.size(); l++){
      if (list2.get(l) > highest){
        highest = list2.get(l);
      }
    }
    int newhighest = (int)highest;
    for (int m = 0 ; m < list2.size(); m++){
      if (newhighest == list2.get(m)){
        mode = list1.get(m);
      }
    }  
  System.out.println(mode);
  } 
}
    
