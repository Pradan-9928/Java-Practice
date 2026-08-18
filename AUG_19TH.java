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
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int notBitMask=~(bitMask);
        int NewNumber=(notBitMask & n);
        System.out.println(NewNumber);

        



    }
}