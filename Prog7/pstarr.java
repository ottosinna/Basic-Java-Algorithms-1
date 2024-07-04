

public class pstarr {
	
// tutoring notes: we want 2  12 / 25
    public static void main(String[] args) {
	
	//pay attention to spaace. Most important
	
	String s = " 2 12 / 25 ";
		
		s = s.trim(); 
		
		String[] sA = s.split(" ");
		
	
		System.out.println(sA[0].trim()) ; //string needs to parse
	    System.out.println(sA[1].trim()) ; //string needs to parse

		int first = Integer.parseInt(sA[0].trim());
		System.out.println(first);
		int second = Integer.parseInt(sA[1].trim());
		System.out.println(second); 
	
		// space between int and sbj
		int [] iA = new int[sA.length-1];
		// running the loop from when i is 0, until i is less than 4. So it will run from i=0 to i=3.
		
		int i = 0; 
		
		//tutoring notes: .equals evaluates to the comparison of values in the objects
		// basically == not same as .equals()
		for(int x = 0; x < sA.length; x++) {
			if (!sA[x].equals("/")) {
				iA[i] = Integer.parseInt(sA[x].trim());
				i++;
				// i++; to add on 
			}
		}
		//do not have for loop inside another for loop in this case
		for(int m = 0; m < iA.length ; m++) {
			System.out.println(iA[m]);
		}
	}
}