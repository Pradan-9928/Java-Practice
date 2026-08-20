public class AUG_21ST {
    static void linearSearchArr(int[] N,int target){
        for(int i=0;i<N.length;i++){
            if(N[i]==target){
                System.out.println(i);
            }
        }
    }
    static void linearSearchString(String str,char target){
        if(str.length()==0){
            System.out.println("Empty string");
        }
        else{
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==target){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        //LINEAR SEARCH
        int[] arr={2,34,56,789};
        linearSearchArr(arr, 34);
        linearSearchString("hello i am pradan",'a');

    }
}
