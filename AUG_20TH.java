import java.util.*;
public class AUG_20TH{

    public static void ArmstrongNumber(int N){
        int org=N;
        int check=0;
        while(N!=0){
            int temp=N%10;
            check+=temp*temp*temp;
            N=N/10;
        }
        if(check==org){
            System.out.println(check);
        }
        else{
            System.out.println("Not possible");
        }
    }


    public static void LARGEST() {
         //TO CHECK THE LARGEST AMONG THREE NUMBERS
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int a =sc.nextInt();
        System.out.print("Enter the number");
        int b=sc.nextInt();
        System.out.print("Enter the number");
        int c=sc.nextInt();

        int max=Math.max(c,Math.max(a, b));
        System.out.println(max);
        sc.close();
    }

    static void CASE(){
        //To check the case of the entered character
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String string=sc.next();

        char ch=string.trim().charAt(0);
        if(ch >= 'a' && ch <= 'b'){
            System.out.println("the case is lower");
        }
        sc.close();
    }

    public static void Fibonacci(){
        Scanner sc=new Scanner(System.in);

        //Fibonacci Numbers
        
        System.out.println("How many times do you want to continue");
        int count=sc.nextInt();
        int p=0;
        int q=1;
        for(int i=0;i<=count;i++){
            int temp=q;
            q+=p;
            p=temp;
            System.out.println(q);
        }
        sc.close();
        System.out.println(q);

    }
    
    
    public static void main(String[] args){
       
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

        // //Reverse the number
        // int n=80373;
        // int reversed=0;
        // while(n!=0){
        //     int dem=N%10;
        //     reversed=(reversed*10)+dem;
        //     n/=10;
        // }
        // System.out.println(reversed);

        ArmstrongNumber(153);
    }
}

