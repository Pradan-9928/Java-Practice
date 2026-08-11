/*Write a Java method named sumOfNumbers(int n) that calculates and returns the
 sum of all integers from 1 to n.Key RequirementsLogic: 
 Use a for loop and an accumulator variable to add up the numbers.
 Constraint: Do not use any mathematical formulas (such as \(n(n+1)/2\)).
 Execution: Call the completed method from inside main() and print the returned result to the console.*/
/*
public class AUG_10TH{
    public static int sumofNumbers(int n){
        int sum=0;
        for(int i=1; i<= n;i++){
            sum += i;

        }
        return sum;
    }
    public static void main(String[] args){
        int n=11;
        int result=sumofNumbers(n);
        System.out.print("Sum of Numbers from 1 to "+ n + "is:" + result);

        

    }
}*/


/*Task: Write a Java method named countDigits(int n) that counts and returns the total number of digits in an integer n.
Constraint: You must use a while loop in your implementation.
Examples:58392 ----> 5    72 ----> 2  9 ----> 1 

public class AUG_10TH{
    public static int countdigits(int n){
        int i=n;
        int digits=0;
        while(i!=0){
            i/=10;
            digits++;

        }
        return digits;
    }
    public static void main(String[] args){
        int n=2000872;
        System.out.print("The Number of digits in " + n + " is " + countdigits(n));
        
    }

}*/

/*Task: Write a Java method named findMaximum(int[] arr) that returns the largest element in an integer array. 
Requirements:Use a loop to iterate through the array.
Do not use Arrays.sort().
Do not use any built-in maximum functions (like Math.max()).
The solution must account for arrays containing negative numbers.
Example:Input: {4, 17, 2, 91, 35} ----> Output: 91 */
/* 
public class AUG_10TH{
    public static int findMaximum(int[] arr){
        int length=arr.length;
        int com=arr[0];
        for(int i = 1;i<length;i++){
            if(com<=arr[i]){
                com=arr[i];
            }
            else{
                continue;
            }    
        }
        return com;
        }
    public static void main(String[] args){
        int[] arr={4,-2,314, -17, -2, 91, 35};
        System.out.println("The greatest value in the array is " + findMaximum(arr));


    }
}*/

/*Problem Summary
Task: Write a Java method named reverseArray(int[] arr) that reverses the elements of an integer array in-place.

Requirements:
Use a for loop.

Modify the original array directly rather than creating and returning a new array.

Example:
Before: {10, 20, 30, 40, 50}

After: {50, 40, 30, 20, 10} */

/*public class AUG_10TH{
    public static void reverseArray(int[] arr){
        for(int i=0;i<arr.length / 2;i++){
            int oppositeIndex=arr.length - 1 - i ;
            int temp = arr[i];
            arr[i] = arr[oppositeIndex];
            arr[oppositeIndex] = temp;
            }
        }
    
    public static void main(String[] args){
        int[] numbers={10, 20, 30, 40, 50};
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        reverseArray(numbers);

         for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
         

    }}*/




    





