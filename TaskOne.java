import java.util.Scanner;
import java.util.Scanner;
public class TaskOne{
 public static int[] arrayStore(int numbers){

Scanner inputCollector = new Scanner(System.in);
int[] arr = new int[10];
for (int count = 0; count < arr.length; count++){
System.out.print("Enter number: ");
  arr[count] = inputCollector.nextInt();
}
for(int count = 0; count < arr.length; count++){
    if(arr[count]%2 == 0){
  int sum = arr[count];
}
//  int number = inputCollector.nextInt();    
    return sum;

}

  public static void main(String[] args){
//Scanner inputCollector = new Scanner(System.in);
 // int number = inputCollector.nextInt();
//System.out.println(Arrays.toString(arrayStore));
System.out.println(Arrays.toString(arrayStore(10)));
}

}
