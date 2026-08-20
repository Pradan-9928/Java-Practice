import java.util.*;
public class AUG_20TH{
    public static void main(String[] args ){
        //TO CHECK THE LARGEST AMONG THREE NUMBERS
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the number");
        // int a =sc.nextInt();
        // System.out.print("Enter the number");
        // int b=sc.nextInt();
        // System.out.print("Enter the number");
        // int c=sc.nextInt();

        // int max=Math.max(c,Math.max(a, b));
        // System.out.println(max);

        // //To check the case of the entered character
        // System.out.println("Enter the word");
        // String string=sc.next();

        // char ch=string.trim().charAt(0);
        // if(ch >= 'a' && ch <= 'b'){
        //     System.out.println("the case is lower");
        // }

        //Fibonacci Numbers
        
        // System.out.println("How many times do you want to continue");
        // int count=sc.nextInt();
        // int p=0;
        // int q=1;
        // for(int i=0;i<=count;i++){
        //     int temp=q;
        //     q+=p;
        //     p=temp;
        //     System.out.println(q);
            
        // }
        sc.close();
        // System.out.println(q);

        //Count the number of occurences
        // int N=1924082;
        // int occurences=0;
        // while(N>0){
        //     int rem=N%10;
        //     if(rem==2){
        //         occurences++;
        //     }
        //     N=N/10;
        // }
        // System.out.println(occurences);

        //Reverse the number
        int N=80373;
        int reversed=0;
        while(N!=0){
            int temp=N%10;
            reversed=(reversed*10)+temp;
            N=N/10;
        }
        System.out.println(reversed);







    }
}