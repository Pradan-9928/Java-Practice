import java.util.*;
class AUG_18TH{
    public static void Problem_1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int n1= sc.nextInt();
        System.out.println("Enter the second Number");
        int n2=sc.nextInt();
        System.out.println("Enter the thord Number");
        int n3=sc.nextInt();
        int avg=(n1+n2+n3);
        System.out.println("The average of the following is " + avg );
        sc.close();

    }

    public static void printSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }

  
    public static int getGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }


    public static boolean isEligibleToVote(int age) {
        return age > 18;
    }

    public static void Do_While(){
        
        int i=1;
        do{
            System.out.println("HI");
            i--;
        }while (i<5);
    }
    public static void Reversal(StringBuilder s){
        int length=s.length();
        for(int i=0;i<(length/2);i++){
            int start=i;
            int end=length-i-1;

            char frontchar = s.charAt(start);
            char endchar=s.charAt(end);

            s.setCharAt(start, endchar);
            s.setCharAt(end, frontchar);
        

        }
    }
  

    public static void main(String[] args) {
        // Testing the functions:
        // printSumOfOddNumbers(10); // Output: 25

        // System.out.println("Greater number: " + getGreater(15, 25)); // Output: 25

        // System.out.println("Circumference: " + getCircumference(7)); // Output: ~43.98

        int age = 20;
        if (isEligibleToVote(age)) {
            System.out.println("Age " + age + ": Eligible to vote.");
        } else {
            System.out.println("Age " + age + ": Not eligible to vote.");
        }
        
        // StringBuilder s= new StringBuilder("Hello I am Pradan");
        // Reversal(s);
        // System.out.println(s);
    }
        


    
}