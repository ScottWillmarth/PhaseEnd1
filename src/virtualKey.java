import java.util.Scanner;

public class virtualKey 
{
	static Scanner sc = new Scanner(System.in);
	static String  option;
	
	public static void secondaryMenu()
	{
		System.out.println("Select an action");
		System.out.println("1. Add a file");
		System.out.println("2. Delete a file");
		System.out.println("3. Search for a file");
		System.out.println("4. Return to main menu");
		option =  sc.next();
		
		if(option.equals("1"))
		{
			//place holder
			System.out.println("Selected option 1");
		}
		else if(option.equals("2"))
		{
			//place holder
			System.out.println("Selected option 2");
		}
		else if(option.equals("3"))
		{
			System.out.println("Selected option 3");
		}
		else if(option.equals("4"))
		{
			mainMenu();
		}
		else
		{
			System.out.println(option + " is an invalid input. Try again. \n");
			secondaryMenu();
		}
		
	}
	
	public static void mainMenu()
	{
		System.out.println("Please select an option");
		System.out.println("1. Display current files");
		System.out.println("2. Edit files");
		System.out.println("3. Close Application");
		option =  sc.next();
		
		if(option.equals("1"))
		{
			//place holder
			System.out.println("Selected option 1");
		}
		else if(option.equals("2"))
		{
			//place holder
			secondaryMenu();
		}
		else if(option.equals("3"))
		{
			System.out.println("Closing Application");
		}
		else
		{
			System.out.println(option + " is an invalid input. Try again. \n");
			mainMenu();
		}
		
	}
	
	public static void welcome()
	{
		//Initial welcome screen to introduce new users to the application
		//This text should only really need to be displayed once
		System.out.println("Welcome to LockedMe.com prototype!");
		System.out.println("Developed by Scott Willmarth");
		System.out.println("In this prototype you have the ability to choose carry out any and all functions listed below including displaying, adding, deleting, and searching for files");
		System.out.println("In order to select an option, simply type the NUMBER associated with the option you desire into the console (ex. 2) \n");
	}
	public static void main(String[] args) 
	{
		welcome();
		mainMenu();
	}

}
