import java.util.*; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class virtualKey 
{
	static Scanner sc = new Scanner(System.in);
	static String  option;
	
	public static void addFile()
	{
		System.out.println("Give the file a name");
		option =  sc.next();
		
		try 
		{
		    File newFile = new File(option);  
		    if (newFile.createNewFile()) 
		    {  
		      System.out.println("File created: " + newFile.getName());  
		    } 
		    else 
		    {  
		      System.out.println("File already exists, please try again \n");
		      addFile();
		    }  
		} 
		catch (IOException e) 
		{
		    System.out.println("An error occurred.");
		    e.printStackTrace();  
		}
		secondaryMenu();
	}
	
	public static void deleteFile()
	{
		System.out.println("What's the name of the file to be deleted?");
		option =  sc.next();
		
		File removeFile = new File(option);  
		if (removeFile.delete()) 
		{ 
		    System.out.println("Deleted the file: " + removeFile.getName());
		} 
		else 
		{
		    System.out.println("File not found \n");
		} 
		secondaryMenu();
	}
	
	public static void printFiles(String[] files)
	{
		for (String file : files) 
	    {
	        System.out.println(file);
	    }
		System.out.println(" ");
		mainMenu();
	}
	
	static void merge(String[] files, int left, int middle, int right)
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;
 
        String L[] = new String[n1];
        String R[] = new String[n2];

        for (int i = 0; i < n1; ++i)
        {
        	L[i] = files[left + i];
        }
            
        for (int j = 0; j < n2; ++j)
        {
        	R[j] = files[middle + 1 + j];
        }
            
        int i = 0;
        int j = 0;
        int k = left;
        
        while(i < n1 && j < n2) 
        {
            if(L[i].compareTo(R[j]) < 0) 
            {
                files[k] = L[i];
                i++;
            }
            else 
            {
                files[k] = R[j];
                j++;
            }
            k++;
        }
 
      //Replacing elements of L[] into the files
        while (i < n1) 
        {
        	files[k] = L[i];
            i++;
            k++;
        }
 
        //Replacing elements of R[] into the files
        while (j < n2) 
        {
        	files[k] = R[j];
            j++;
            k++;
        }
    }
	
	static void sort(String[] files, int left, int right)
    {
        if(left < right) 
        {
            int middle = left + (right - left) / 2;
 
            //Divide array list
            sort(files, left, middle);
            sort(files, middle + 1, right);

            merge(files, left, middle, right);
        }
        printFiles(files);
    }
	
	//Uses Merge sort
	public static void sortFiles(String[] files)
	{
		int arrlength =  files.length;
        //Starts a merge sort
        sort(files, 0, arrlength - 1);
	}
	
	public static void showDirect()
	{
        String[] files;

        File directory = new File(System.getProperty("user.dir"));

        files = directory.list();
        
        sortFiles(files);
    }
	
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
			addFile();
		}
		else if(option.equals("2"))
		{
			deleteFile();
		}
		else if(option.equals("3"))
		{
			System.out.println("Selected option 3");
		}
		else if(option.equals("4"))
		{
			System.out.println("\n");
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
			System.out.println(" ");
			System.out.println("Selected option 1");
			showDirect();
		}
		else if(option.equals("2"))
		{
			System.out.println(" ");
			secondaryMenu();
		}
		else if(option.equals("3"))
		{
			System.out.println("Closing Application");
			System.exit(0);
		}
		else
		{
			System.out.println(" ");
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
