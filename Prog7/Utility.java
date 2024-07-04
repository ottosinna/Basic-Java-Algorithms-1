import java.util.Scanner;

class Utility {

	static Scanner scanner = new Scanner(System.in);
	
	static int findGCD(int n, int m) {		
		while ( n!= m) {
      		if (n > m)   { 
			    n = n - m;
			} else { 
			    m = m - n;
			} 
		}
		return n; 
	}
	
	static int inputData(){
		System.out.println("Enter number here:");
		while(!scanner.hasNextInt()){
			System.out.println("That's not a valid number. Please enter an integer:");
			scanner.nextInt();
		}
		return scanner.nextInt();
	}
}