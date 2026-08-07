public class AUG_7TH{
    public static void main(String[] args){
         
    StringBuffer name= new StringBuffer("Hello");
    name.append(" Reddy");
    System.out.println(name.capacity());
    System.out.println(name.length());
    System.out.println(name.charAt(6));
    System.out.println(name.indexOf("Reddy"));
    System.out.println(name.replace(0, 5, "Hi"));
    System.out.println(name.reverse());
    System.out.println(name.delete(0, 3));
    }
}