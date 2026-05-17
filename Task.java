public class Task{
 public static void main(String[] args){
    int[] arr = {1,2,2,2,3};
        int sum = 0;
for(int i = 0; i < arr.length; i++){
    for(int count = 1; count < arr[i]; count++){
 if(arr[count] < arr[i]){

    sum = arr[count];
}

}

}

    System.out.println(arr[sum]);

}

}
