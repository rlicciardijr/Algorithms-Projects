// Homework 6 powers 
public class powerRecursive {
	public static void main(String[] args) {
		
	
	int result;
	
	 
	result = powerN(3,1);
	System.out.println("The result for 3 to the power of 1 should be 3 ->      " +result);
	result = powerN(3,2); 
	System.out.println("The result for 3 to the power of 2 shoud be 9 ->       " + result);
	result = powerN(3,3);
	System.out.println("The result for 3 to the power of 3 should be 27 ->     " + result);
	result = powerN(2,1);
	System.out.println("The result for 2 to the power of 1 should be 2 ->      " + result);
	result = powerN(2,2); 
	System.out.println("The result for 2 to the power of 2 should be 4 ->      " + result);
	result = powerN(2,3);
	System.out.println("The result for 2 to the power of 3 should be 8 ->      " + result);
	result = powerN(2,4);
	System.out.println("The result for 2 to the power of 4 should be 16 ->     " +result);
	result = powerN(2,5);
	System.out.println("The result for 2 to the power of 5 should be 32 ->     " +result);
	result = powerN(10,1);
	System.out.println("The result for 10 to the power of 1 should be 10 ->    " +result);
	result = powerN(10,2);
	System.out.println("The result for 10 to the power of 2 should be 100 ->   " + result);
	result = powerN(10,3);
	System.out.println("The result for 10 to the power of 3 should be 1000 ->  " +result);
	
	}
//Ron Licciardi recursive powers 
public static int powerN(int base, int n) {
	 if (n == 0) return 1;

	  return base * powerN(base, n-1);
	}
}
