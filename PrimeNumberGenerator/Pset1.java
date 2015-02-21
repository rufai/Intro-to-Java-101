package check;



//there are 2 ways  to implement this code.

// first implementation uses an instance of class PrimeNumber to generate the result
//the second uses methods declared directly in class Pset1 

//To use one of the implementations, you will have to comment out the other.

public class Pset1 {
	
	static int[] primeArray;
	
	
	public static void main(String[] a){	
		
		//first implementation begins
			/*
			 * PrimeNumber pm = new PrimeNumber(1000); 						 // you need to pass a value to this constructor
			 * pm.printPrime(); 				// this method call prints the 1000th prime number
			 * pm.printSumOfPrimeLog();    				//method call to print sum  of natural log of first 1000 prime numbers 
			 */
		//first implementation ends
		
		
		//second implementation begins
			int n = 100; primeArray = new int[n];     // n is the value prime numbers we want to find its sum of natural logs
			printPrime(2000);			// here we call printPrime() to print the 2000th prime number
			sum_of_logarithms_of_primes(n);   // value of n has been declared above
		//second implementation ends
	}
	
	public static void printPrime(int n){
		
		int currentPosition = 1;		
		int prime =2;		
		int oddnumber =3;		
		boolean isPrime = true;
		
		while( currentPosition != n){
			isPrime = true;		
			
			for( int i = 2; i < oddnumber; i++){
				int remainder = oddnumber % i;
				
				if( remainder == 0 ){
					isPrime = false;
					break;
				}
			}		
		
			if( isPrime )	{									
					prime = oddnumber;	
					if( currentPosition <= primeArray.length){
					primeArray[currentPosition -1] = prime;}
					currentPosition++;
			}	
			
			//System.out.println("current position " + currentPosition + " odd number " + oddnumber+ " prime number " + prime);			
			oddnumber +=2;
		}			
		System.out.println("The " +  currentPosition + "th prime number is : " + prime);
	}
	
	public static void sum_of_logarithms_of_primes(int n){
		
			
		
		int counter = 0;
		double sum = 0;
		
		while ( counter < n){
			 sum   += Math.log(primeArray[counter]);	
			counter++;
		}			
		System.out.println("Sum of lagarithms of the first "+ n+" primes = " + sum);
	}	
}	
	
