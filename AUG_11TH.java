/*Task: Write a Java method named countVowels(String str) that counts and returns the total number of vowels in a given string.
Vowels to Count: a, e, i, o, u (both lowercase and uppercase versions).

Requirements:
Use a loop.

Use the charAt() method to check each character.

Do not use regular expressions.

Example:

Input: "Programming"

Output: 3 (because it contains 'o', 'a', and 'i') 

import java.util.Arrays;

public class AUG_11TH{
    public static int countVowels(String[] str){
        int count=0;
        for(int i=0;i<str.length;i++){
            String word=str[i].toLowerCase();
            if(word.equals("a")||word.equals("e")||word.equals("i")||word.equals("o")||word.equals("u")){
                count++;
            }
            }

        
        return count;

    }
    public static void main(String[] args){
        String Word="Java PrOgrAMMING";
        String[] word_arr=Word.split("");
        System.out.println(Arrays.toString(word_arr));
        System.out.println(countVowels(word_arr));

    }
}*/
/*Task: Write a Java method named isPalindrome(String str)
 that returns true if the input string reads the same forward and backward, and false otherwise.

Requirements:
Do not use StringBuilder.reverse() to create a reversed string.

Instead, compare characters directly using indices (a two-pointer approach, comparing character at index i from the left with character at index j from the right).

Examples:

"madam" → true
"racecar" → true
"hello" → false
"level" → true 


public class AUG_11TH{
    public static boolean IsPalindrome(String str){
        String word=str.toLowerCase();
        int length=str.length();
        for(int i=0;i< length / 2; i++){ 
            int j=length - i -1;
            
            if(word.charAt(i)!=word.charAt(j)){
                return false;
                        }
            
           }
        return true;

    }
    public static void main(String[] args){
        String Word="malayalam";
        System.out.println("This is "+ IsPalindrome(Word));


    }
}*/

/*Task: Write a Java method named secondLargest(int[] arr) that returns the second-largest distinct element in an array of integers.

Key Requirement: The second-largest element must be distinct (meaning duplicate values of the largest number shouldn't count as the second-largest).

Example:

Input: {10, 5, 20, 8, 15}

Output: 15

Explanation: Largest = 20, Second largest = 15
public class AUG_11TH{
    public static int secondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int x : arr) {

        if (x > largest) {
            secondLargest = largest;
            largest = x;
        }
        else if (x > secondLargest && x != largest) {
            secondLargest = x;
        }
    }

    return secondLargest;
}
    public static void main(String[] args){
        int[] arr={10, 20, 20, 5, 15};
        System.out.println("The second largest integer is " + secondLargest(arr));


    }
}*/