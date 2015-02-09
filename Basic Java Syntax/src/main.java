//Project to show how to collect input, 

//this project is highly commented so read through it carefully.


// I imported a class Scanner from the java.util package.
import java.util.Scanner;

//this is the begining of class

//classes are made up objects
public class main {
	
	
    public static void main ( String[] controller){
    	
    	//this is how to declare variables in Java
    	  String name = "tunde Adewumi"; 	 //declaration of String
		  int numberTen = 10;  	//declaration of Integers
		  Boolean AreYouGoingToSchool = true; 	//declaration of boolean values.
		  
		  
		  System.out.println("My name is " + name);		//this is a command to print the name we declared on line 14.
		  
		  System.out.print(parent());		//here we are calling the parent method that we declared below.
      
    	
    	//here I am creating an instance of the class Scanner and I class it input
    	
    	// it's like "fried-rice" being an instance of class food.
        //in that case it will be 
    	// Food friedRice = new Food();
    	//understand?
    	
		  Scanner input = new Scanner(System.in) ;
		    
		//collect input of type string from the keyboard 
		  System.out.print("\n\nWhat's your father's name: ");
		  String myFather = input.nextLine();
		  System.out.print("\nWhat's your mother's name: ");
		  String myMother = input.nextLine();  
		  
		  //look at this method
		  //we called the parents() method declared below
		  //but with 2 parameters
		  //then we gave it the parameters that we collected from the keyboard.
		  System.out.print("My family's name is" + parents(myFather,myMother)); 
    }
           
    //this how to create a method
    //private means the method can not accessed by another class
    //static means we 
    private static String parent() {
	    String father= "jousha";
	    String mother= "rebecca";
	    String MothersFullName= father +" "+ mother; //we're joining 2 strings called "concatenation"
	    System.out.println();
	    return MothersFullName; 
    }

    
    private static String  parents( String father, String mother){
	    String fathersname = father;
	    String mothersname = mother;
	    String familyname = fathersname + mothersname;
	    System.out.println();
	    return familyname;
    }
    
    //thank you.
    
 }

