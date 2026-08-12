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
"level" → true */


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
}