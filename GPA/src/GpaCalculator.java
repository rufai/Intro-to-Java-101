import java.util.Scanner;


public class GpaCalculator {
	
	
		static String[] courseCode ;
		static int[] courseUnit;
		static int[] courseScore;
		static int numberOfCourses;	
		static char[] grade;
		static int gradePoint;
		static int[] gradePointArray; 
		
		static Scanner input = new Scanner(System.in);
		
		
		public static void main(String[] n){		
			
			System.out.println("Enter the number of courses :\n");
			
			numberOfCourses = input.nextInt();
			
			System.out.println("The number of courses you registered is " + numberOfCourses + "!");
			
			getCourseInfo(numberOfCourses);	
			setCourseInfo();
			System.out.println("\nYour GPA is : " + calcGPA());
			
		}
		
		
		
		
		public static void getCourseInfo(int n){	
			
			courseCode = new String[n];
			courseUnit = new int[n];
			courseScore = new int[n];	
			gradePointArray = new int[n];
			grade = new char[n];
			
			
			int counter = 0;
			int number =1;
			
			while( (n - counter) > 0){	
				System.out.println("\n\t\tEnter information for course " + (number));
				
				System.out.print( " Course Code : ");				
				courseCode[counter] = input.next(); 
				
				System.out.print(" Course Unit : ");						
				courseUnit[counter] = input.nextInt();	
						
				System.out.print( " Course Score : ");					
				courseScore[counter] = input.nextInt();	
				
				changeScoreToGrade(	courseScore[counter], counter);
				counter++;
				number++;
				
			}
		
		}
		
		
		public static void setCourseInfo(){
				
			
				System.out.print("\n\nCourse Code\t\t Course Unit\t\t Course Score   \t\tCourse Grade\n");
			
				for(int i = 0; i < numberOfCourses; i++){
					int score = courseScore[i];
					System.out.printf("%s\t\t\t\t%d\t\t\t%d\t\t\t%d %c\n", courseCode[i],  courseUnit[i], courseScore[i], gradePointArray[i] ,grade[i] );
				
				}
				
			}
			
			
		public static void changeScoreToGrade( int score, int counter){
			
			int remainder = score % 10;
		
			switch(score/10){
				
				case 7:
				case 8:
				case 9:
				case 10: 
					grade[counter] = 'A';		
					gradePointArray[counter] = 5;							
					break;
					
				case 6:					
					grade[counter] = 'B';			
					gradePointArray[counter] = 4;					
					break;
				
				case 5:					
					grade[counter] = 'C';				
					gradePointArray[counter] = 3;				
					break;				
				
				case 4:					
					if( remainder >= 5) 
						{grade[counter] = 'D';				
						gradePointArray[counter] = 2;					
						break;}
					else 
						grade[counter] = 'E';					
						gradePointArray[counter] = 1;					
						break;
					
				default:
					grade[counter] = 'F';
					gradePointArray[counter] = 0;
					break;		
			}
			
		}
			
		
		public static double calcGPA(){
				
			int cummulativeGradePoint = 0;
			
			int cummulativeGradeUnit = 0;
			double gpa = 0;
				
			for( int a = 0; a < courseScore.length; a++){
				
				cummulativeGradeUnit += courseUnit[a];
				
				cummulativeGradePoint += gradePointArray[a] * courseUnit[a];
				
			}
			
			gpa = (double) cummulativeGradePoint /  ( double ) cummulativeGradeUnit;
			//gpa = Math.round( gpa *100 )/100;
			return gpa;		
				
		}
		

}
