//Question: Write a Java program that creates a class called Book with two attributes: Title and Price. 
// In the main method, create an array of three Book objects, assign values to their attributes.
// and then print out the details of each book.
/* 
class Book{
    String Title;
    int Price;
}

public class JULY_24TH {
    public static void main(String[] args) {
        Book[] book= new Book[3];

    book[0]=new Book();
    book[1]=new Book();
    book[2]=new Book();

    book[0].Title="Harry Potter";
    book[0].Price=500;

    book[1].Title="The Alchemist";
    book[1].Price=300;

    book[2].Title="The Great Gatsby";
    book[2].Price=400;

    for(Book b : book){
        System.out.println("Book Title: " + b.Title);
        System.out.println("Book Price: " + b.Price);

    }
    


    }
}*/
/*The key lesson from this example is that an **enhanced for loop (`for-each`) behaves differently for primitive types and objects**.
When iterating over an array of **primitive data types** (such as `int`, `double`, or `char`), the loop variable receives a **copy of each element's value**,
 not the actual element stored in the array. Therefore, modifying the loop variable (e.g., `x = x + 5`) changes only the local copy, leaving the original array unchanged. 
 In contrast, when iterating over an array of **objects**, the loop variable receives a **copy of the object's reference**. 
 Although the reference itself is copied, both references point to the **same object in the heap**, so modifying the object's fields (e.g., `student.name = "Priya"`) changes the original object
 and the changes are visible through every reference pointing to that object.
  Therefore, an enhanced for loop cannot be used to modify the values of a primitive array by changing the loop variable, but it can be used to modify the internal state of objects stored in an object array.
 */


