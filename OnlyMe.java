//import java.util.Scanner
public class OnlyMe{
// 	public static void main (String[] args){
// 		int[] numbers = {10,3,7,12,4,9};
// 		int smax = 0;
// 		for (int i = 0; i < numbers.length; i++){
// 			if (numbers[i] > max) {
// 				max = numbers[i];
				
// 			}
// 		}

// 		System.out.println(max)
// 	}

// 		}















// public class ModeExample {
//     public static void main(String[] args) {
//         int[] arr = {4, 2, 4, 3, 2, 4, 5};

//         int mostFrequent = arr[0];
//         int maxCount = 0;

//         for (int i = 0; i < arr.length; i++) {
//             int count = 0;

//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }

//             if (count > maxCount) {
//                 maxCount = count;
//                 mostFrequent = arr[i];
//             }
//         }

//         System.out.println("Most frequent number: " + mostFrequent);
//     }
// }












// import java.util.Scanner;

// public class ScoresArray {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int[] scores = new int[10]; // array for 10 scores

//         // collect scores
//         for (int i = 0; i < scores.length; i++) {
//             System.out.print("Enter score " + (i + 1) + ": ");
//             scores[i] = input.nextInt();
//         }

//         // print the scores
//         System.out.println("\nScores entered:");
//         for (int i = 0; i < scores.length; i++) {
//             System.out.println(scores[i]);
//         }
//     }
// }









// public static void printEvennumbers(int[] numbers){

// 	for (int number : numbers){
// 		if (number%2 != 0){
// 			System.out.println(number);
// 		}
// 	}
// }
// 	public static void main(String[] args){
// 		int[] arr = {1,2,3,4,5,6,7,8,9,10};
// 		printEvennumbers(arr);
// 	}
	
// }




// public static void main(String[] args){
// 	int[] arr = {1,2,3,4,5,6,7,8,9,10};
// 	for (int count = 0; count < arr.length; count++) {
// 		if (arr[count]%2 == 0) {
// 			System.out.println(arr[count]);
			
// 		}
		
// 	}
// }
















// public static void main(String[] args) {
// 	int num = 0;
// 	int tracker = 0;
// int[] arr = {2,2,3,4,2,7};
	
// 	for (int i = 0; i <= arr.length; i++) {
// 		int count = 0;
// 		for (int j = 0; j <= arr.length; j++) {
// 			if (i == j) {
// 				count++;
				
// 			}
			
// 			if (num < tracker) {
// 				tracker++;
				
// 			}
// 		}
// 	}System.out.println(tracker);
// }








// public static int[] occurence(int[] arr){
// 	for (int i = 0; i < arr.length; i++) {
// 		boolean alreadyOccured = false;
// 		for (int j = 0; j < arr.length; j++) {
// 			if (arr[i] == arr[j]) {
// 				alreadyOccured = true;
// 				break;
				
// 			}
			
// 		}
// 		if (alreadyOccured) {
// 			continue;
			
// 		}
// 	  	  int count = 0;


// 		for (int s = 0; s < arr.length; s++) {
// 			if (arr[i] == arr[s]) {
// 				count++;


				
// 			}
			
// 		}

// 			System.out.println(arr[i] + " -> " + count + " times ");
// 	}

// 		return count;

// }

// 	public static void main(String[] args) {
// 		int[] arr = {1,2,2,3,4,1,5,2,7,8,3,6};
// 		occurence(arr);
// 	}












//public class Main {

    public static int[] frequency(int[] arr){

        // Count unique elements
        int uniqueCount = 0;

        for(int i = 0; i < arr.length; i++){

            boolean alreadyExists = false;

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    alreadyExists = true;
                    break;
                }
            }

            if(!alreadyExists){
                uniqueCount++;
            }
        }

        // Create result array
        int[] result = new int[uniqueCount * 2];

        int index = 0;

        // Count frequencies
        for(int i = 0; i < arr.length; i++){

            boolean alreadyCounted = false;

            for(int k = 0; k < i; k++){
                if(arr[i] == arr[k]){
                    alreadyCounted = true;
                    break;
                }
            }

            if(alreadyCounted){
                continue;
            }

            int count = 0;

            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            result[index] = arr[i];
            result[index + 1] = count;

            index += 2;
        }

        return result;
    }

    public static void main(String[] args){

        int[] arr = {4,5,4,2,5,5};

        int[] answer = frequency(arr);

        for(int num : answer){
            System.out.print(num + " ");
        }
    }







}