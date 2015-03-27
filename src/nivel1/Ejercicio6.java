package nivel1;

public class Ejercicio6 {
	
	public static double promedio(int[] a) {
		double sum = 0;
		for (final int i : a) {
			sum = sum + i;
		}
		return sum / a.length;
	}

	public static void main(String[] args) {
		
		int[] test1 = {1,2,3};
		System.out.println(promedio(test1)); //2
		
		int[] test2 = {3,3,3};
		System.out.println(promedio(test2)); //3
		
		int[] test3 = {20,3,11,55,1};
		System.out.println(promedio(test3)); //18
		
		int[] test4 = {2,2,57,1};
		System.out.println(promedio(test4)); //15,5

	}

}
