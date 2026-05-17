import java.util.Arrays;
import java.util.Scanner;
public class arrays{
 public static int[] arrayStore(int numbers){

Scanner inputCollector = new Scanner(System.in);
int[] arr = new int[10];
for (int count = 0; count < arr.length; count++){
System.out.print("Enter number: ");
  arr[count] = inputCollector.nextInt();
}
//for(int count = 0; count < arr.length; count++){
//}
//  int number = inputCollector.nextInt();    
    return arr;

}

  public static void main(String[] args){
//Scanner inputCollector = new Scanner(System.in);
 // int number = inputCollector.nextInt();
//System.out.println(Arrays.toString(arrayStore));
System.out.println(Arrays.toString(arrayStore(10)));
}

}
