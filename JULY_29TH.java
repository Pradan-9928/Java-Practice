public class JULY_29TH {
    public static void main(String[] args) {
        String name= new String("Hello World");
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(7));
        System.out.println(name.length());
        System.out.println(name.substring(6));
        System.out.println(name.indexOf("World"));
        System.out.println(name.replace("World", "Java"));
        System.out.println(name.trim());
        System.out.println(name.startsWith("Hello"));
        System.out.println(name.endsWith("World"));
        System.out.println(name.equals("Hello World"));
        System.out.println(name.equalsIgnoreCase("hello world")); 
        System.out.println(name.contains("Hello"));
    }
}
