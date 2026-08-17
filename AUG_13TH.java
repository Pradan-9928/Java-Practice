import java.util.*;
public class AUG_13TH {
    public static void Rectangle(int n , int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow_Rectangle(int m, int n){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==m||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Half_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Inverted_Half_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Inverted_Half_Pyramid_Mirror(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.println(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void Half_Pyramid_Numbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Floyds_Triangle(int n){
        int number =1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    public static void binary_Triangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            int sum = i + j;
            if (sum % 2 == 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println(); // Moved outside the inner loop
    }}
    
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows ");
        int m=sc.nextInt();

        System.out.print("Enter number of columns ");
        int n=sc.nextInt();
        Rectangle(n,m);
        Hollow_Rectangle(m,n);
        Half_Pyramid(n);
        Inverted_Half_Pyramid(n);
        Inverted_Half_Pyramid_Mirror(n);
        Half_Pyramid_Numbers(n);
        Floyds_Triangle(n); 
        binary_Triangle(n);



        sc.close();
    }
}
