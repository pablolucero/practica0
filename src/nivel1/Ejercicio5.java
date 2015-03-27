package nivel1;

import java.util.Arrays;

public class Ejercicio5 {
	
	public static int getMenor(int[] a) {
		Arrays.sort(a);
		return a[0];
	}
	
	public static void main(String[] args) {
		
		int[] test1 = {1,2,3};
		System.out.println(getMenor(test1)); //1
		
		int[] test2 = {2,1,3};
		System.out.println(getMenor(test2)); //1
		
		int[] test3 = {2,3,1};
		System.out.println(getMenor(test3)); //1
		
		int[] test4 = {2,-3,1};
		System.out.println(getMenor(test4)); //-3
	}

}


