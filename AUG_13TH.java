import java.util.*;
public class AUG_13TH {
    public static void Rectangle(int n , int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow_Rectangle(){

    }
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows");
        int n=sc.nextInt();

        System.out.print("Enter number of columns");
        int m=sc.nextInt();
        Rectangle(n,m);


        sc.close();
    }
    
}
