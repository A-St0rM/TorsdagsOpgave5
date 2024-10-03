import java.util.*;

class Main{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Please type your name ");
	String name = scanner.nextLine();
	System.out.println("Hello " + name);
	System.out.println("Please type your age ");
	int age = scanner.nextInt();
	System.out.println("You are " + age + " years old");
	int retirementAge = retirementAge(age);
	System.out.println("You have " + retirementAge + " years until retirement");


	}

	public static int retirementAge(int age){

	return 67 - age;

	}




}