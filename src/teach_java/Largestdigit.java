package teach_java;

public class Largestdigit {

	public static void main(String[] args) {
		System.out.println(equationSolutions(1,30));

		
		
	}
	
	public static int maxDigit(int n){
	    if(n==0)                               // Base case: if n==0, return 0
	        return 0;
	    System.out.println(n%10);
	    System.out.println(n/10);
	    return Math.max(n%10, maxDigit(n/10)); // Return max of current digit and 
	                                           // maxDigit of the rest 
	}
	
	static int sameElementsNaive(int[] a, int[] b) {

		  int result = 0;

		  for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < b.length; j++) {
		      if (a[i] == b[i]) {
		        result++;
		      }
		    }
		  }
		  return result;
		}
	boolean isDigit(String input) {

		  char symbol = input.charAt(0);
		  if ('0' <= symbol && symbol <='9') {
		    return true;
		  }
		  return false;
		}
	
	static int equationSolutions(int L, int R) {

		  int result = 0;
		  for (int a = L; a <= R; a++) {
		    for (int b = a + 1; b <= R; b++) {
		      if (a * a * a == b * b) {
		        result++;
		      }
		    }
		  }
		  return result;
		}





}


