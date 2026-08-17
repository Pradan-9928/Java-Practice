public class AUG_17TH{
    public static void Butterfly_Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.println();
            }
            for(int m=1;m<=n;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        Butterfly_Pattern(rows);

    }