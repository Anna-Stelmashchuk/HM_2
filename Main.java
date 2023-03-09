 import java.util.Arrays;
 import java.util.Collections;


//public class Main {
    //public static void main(String[] args) {

        // Find the answer to the next question: Why arrays in java initialize with fixed size and can’t be dynamic?

        //Масиви Java мають фіксований розмір і не можуть бути змінені,
        // а їх елементи зберігаються в пам'яті безперервно.
        // Можна створити новий масив з іншим розміром і скопіювати його елементи.
        // Рішення про використання масивів або динамічних структур даних,
        // таких як ArrayList, залежить від вимог програми.





        //Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).

        //Integer[] numbers = {2, 3, 1, 7, 11};
        // Arrays.sort(numbers, Collections.reverseOrder());
        //System.out.println(Arrays.toString(numbers));








    //}
//}





 //You get an array of numbers(should contain both positive and negative numbers),
 // and return the sum of all the positive ones. (If there are nothing to sum, sum should be 0)

/*
 public class Main {
     public static void main(String[] args) {
         int[] arr = {2, -5, 10, -3, 8, -1}; // приклад масиву
         int sum = sumOfPositiveNumbers(arr);
         System.out.println("Сума додатніх чисел у масиві: " + sum);
     }

     public static int sumOfPositiveNumbers(int[] arr) {
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > 0) {
                 sum += arr[i];
             }
         }
         return sum;
     }
 }

 */




 //You get an array of numbers, return the average of a list of numbers in this array.
 // (Example -  array{1,2,4,1} -> avg = 2)


/*
 public class Main {
     public static void main(String[] args) {
         int[] arr = {1, 2, 4, 1}; // приклад масиву
         double avg = calculateAverage(arr);
         System.out.println("Середнє значення чисел у масиві: " + avg);
     }

     public static double calculateAverage(int[] arr) {
         double sum = 0;
         for (int i = 0; i < arr.length; i++) {
             sum += arr[i];
         }
         return sum / arr.length;
     }
 }
*/






 /*


//You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0. Result should be  next: {3,2,0,1,4,0,8,0}



 import java.util.Arrays;

 public class Main {
     public static void main(String[] args) {
         int[] arr = {3, 2, 3, 1, 4, 2, 8, 3}; // приклад масиву
         replaceDuplicatesWithZero(arr);
         System.out.println(Arrays.toString(arr));
     }

     public static void replaceDuplicatesWithZero(int[] arr) {
         for (int i = 0; i < arr.length - 1; i++) {
             if (arr[i] != 0) {
                 for (int j = i + 1; j < arr.length; j++) {
                     if (arr[i] == arr[j]) {
                         arr[j] = 0;
                     }
                 }
             }
         }
     }
 }


  */