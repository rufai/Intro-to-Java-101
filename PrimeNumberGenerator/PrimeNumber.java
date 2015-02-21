package check;

/* problem set 1
 * Name: Rufai Mustapha Temitope
 * Collaborators: Nil
 * Time: 1:00hr
 * Matric No: CSC \ 2011 \ 090
 */

public class PrimeNumber {
	
	static int totalNumberOfPrime = 0;	
	static int currentPosition = 1;
	static int prime = 2;
	static int tempPrimeValue = 0;
	static double tempLogPrimeValue = 0;
	
	public PrimeNumber( int n ) {	
		
		totalNumberOfPrime = n;		
		int oddNumber = 3;
	
		while( currentPosition != totalNumberOfPrime ){
			
			if( isPrime( oddNumber ) ){			
				primeNumberPosition(true);
				prime = oddNumber;							
			}
			
			tempPrimeValue += prime;
			tempLogPrimeValue += Math.log(prime);
			
			oddNumber +=2;					
		}	
	}
	
	public static void printPrime( )
	{		
		System.out.println("The " +  currentPosition + "th prime number is : " + prime);
	}
	
	public static void printSumOfPrimeLog( ){		
		
		System.out.println("\nThe sum of the prime numbers is "
							+ tempPrimeValue +"\n\t and the sum of there log is "+ tempLogPrimeValue);
	}
	
	private static int primeNumberPosition( boolean prime ){		
		
		if ( prime == true ){		
			currentPosition++;
		}		
		return currentPosition; 		
	}
	
	
	private static boolean isPrime(int number){
		boolean state = true;
		int i = 2;
		while ( i < number ){
								
			if( number % i == 0 ){
				state = false;
				break;
			}			
			i++;
		}
		return state;
	}
	
	

}
