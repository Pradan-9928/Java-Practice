public class AUG_19TH{
    public static void main(String[] args){
        //GET OPERATION
        /*int n=5;
        int pos=3;
        int bitMask= 1<<pos;

        if((bitMask & n) == 0){
            System.out.println("bit was one");
        }
        else{
            System.out.println("bit was zero");
        }*/

        //SET OPERATION
        /*int n=5;
        int pos=1;
        int bitMask= 1<<pos;
        int NewNumber=bitMask | n;
        System.out.println(NewNumber);*/


        //Clear Operation
        // int n=5;
        // int pos=2;
        // int bitMask=1<<pos;
        // int notBitMask=~(bitMask);
        // int NewNumber=(notBitMask & n);
        // System.out.println(NewNumber);

        // Strivers BIT MANIPULATION PLAYLIST -2
        //Swapping 2 numbers
        // int a=5;
        // int b=6;
        // a=a^b;
        // b=a^b;
        // a=a^b;
        // System.out.println(a);
        // System.out.println(b);
        
        //Check if the ith bit is set or not
        // int N=13;
        // int pos=1;
        // int bitmask=1<<pos;
        // if((bitmask & N)!=0){
        //     System.out.println("The Set Bit is 1");
        // }
        // else{
        //     System.out.println("The Set Bit is 0");
        // }

        //Set the ith bit
        int N=13;
        int pos=1;
        int bitmask=1<<pos;
        N=N&bitmask;
        System.out.println(N);
        






        




        



    }
}