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
    static void linearSearchArrRange(int[] N,int target,int start,int end){
        for(int i=start;i<=end;i++){
            if (N[i]==target){
                System.out.println(i);
            }
        }
    }
    static void MinNum(int[] N){
        int min=N[0];
        for(int i=1;i<=N.length-1;i++){
            if(min>N[i]){
                min=N[i];
            }
        }
        System.out.println(min);
    }


    static void Search2D(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println("Target found at "+ (i+1) + " row and " + (j+1) + " column");
                }
            }
        }

    }
    public static int findNumbers(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            int digit=0;
            while(nums[i]!=0){
                
                nums[i]=nums[i]/10;
                digit++;
            }
            if(digit%2==0){
                    count++;
                }
            
        }
        return count;
        
    }

    public static int maximumWealth(int[][] accounts) {
       int ans=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            int length=accounts[i].length;
            for(int j=0;j<length;j++){
                sum+=accounts[i][j];
                
            }
            if(sum>ans){
                    ans=sum;
                } 
        }
        return ans;
    }

    public static void main(String[] args) {
        //LINEAR SEARCH
        int[] arr={2,34,56,789};
        int[][] Arr2d={
            {23,45,65,76},
            {23,45,6,43},
            {324,7,8,9,0}
        };
        // linearSearchArr(arr, 34);
        // linearSearchString("hello i am pradan",'a');
        // linearSearchArrRange(arr, 14, 1, 3);
        // MinNum(arr);
        // Search2D(Arr2d, 0);
        // System.out.println(findNumbers(arr));
        System.out.println(maximumWealth(Arr2d)); 

    }
}
