import java.util.Scanner;

public class virtualKey 
{
	public static void mainMenu()
	{
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Please select an option");
		System.out.println("1. Display current files");
		System.out.println("2. Edit files");
		System.out.println("3. Close Application");
		String  option =  sc.next();
		if(option == "1")
		{
			System.out.println("Selected option 1");
		}
		else if(option == "2")
		{
			
		}
		else if(option == "3")
		{
			
		}
		else
		{
			
		}
		
	}
	
	public static void welcome()
	{
		//Initial welcome screen to introduce new users to the application
		//This text should only really need to be displayed once
		System.out.println("Welcome to LockedMe.com prototype!");
		System.out.println("Developed by Scott Willmarth");
		System.out.println("In this prototype you have the ability to choose carry out any and all functions listed below including displaying, adding, deleting, and searching for files");
		System.out.println("In order to select an option, simply type the NUMBER associated with the option you desire into the console (ex. 2)");
	}
	public static void main(String[] args) 
	{
		welcome();
		mainMenu();
		
	}

}
