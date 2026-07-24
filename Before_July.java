//Question 1: Write a program to calculate the total marks, percentage and grade of a student based on the marks obtained in 5 subjects. 
// The program should take input from the user for the marks obtained in each subject and then calculate the total marks, percentage and grade based on the following criteria:


/*import java.util.Scanner;
public class Practice{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int total=0;
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter your Marks One by One");
			int mark=scanner.nextint();
			total+=mark;
		}
		
		double percent=total/5;
		
		System.out.println("The total is"+total);
		

		if (percent>=90){
			System.out.println("Your Grade is A");
		}
		else if (percent>=80){
			System.out.println("Your Grade is B");
		}
		else if (percent>=70){
			System.out.println("Your Grade is C");
		}
		else if (percent>=60){
			System.out.println("Your Grade is D");
		}
		else{
			System.out.println("You HavE Failed");
		}
		scanner.close();


		}
}

Question 2: Write a program to check whether a given number is positive, negative or zero.
import java.util.Scanner;
public class Practice{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt()
		String PN=(num>0) ? "Positive" : "Negative";
		System.out.println("The Number is "+PN);
		if (num%2==0){
			System.out.println("This is an Even Number");
		}
		else{
			System.out.println("This is an Odd Number");
		}
		if (num%15==0){
			System.out.println("This is Divisible by both 3 and 5");
		}
		else{
			System.out.println("This is not Divisible by both 3 and 5");
		}

	}
}

Question 3: Write a program to create a class called Employee with attributes Name and Salary.
public class Employee{
	String Name;
	int Salary;

	void increaseSalary(double percent){
		Salary+=(Salary*percent)/100;
	}

	void display(){
		System.out.println("Employee Name "+ Name);
		System.out.println("Employee Salary "+ Salary);

	}

	public static void main (String[] args){
		Employee emp=new Employee;
		

		Name="Alice";
		Salary=400000;
		display();
		increaseSalary(10);
		display();
	}
}
Question 4: Write a program to create a class called Student with attributes Name and Marks (an array of 5 integers).

public class Student{

	int sum=0

	int TotalMarks(){
		for(i=0;i<5;i++){
			sum+=Marks[i];
		}

	}
	double AverageMarks(){
		sum=TotalMarks();
		double avg=sum/5

	}
	void displayReport(){
		System.out.println("Student Name"+Name);
		System.out.println("Student Total"+ TotalMarks());
		System.out.println("Student Average"+ AverageMarks());

	}

	public static void main(String[] args){
		String Name=Rahul;
		int[] Marks={78,82,91,89,80};
		Student stu=new Student();
		TotalMarks();
		AverageMarks();
		displayReport();


	}

}*/ 