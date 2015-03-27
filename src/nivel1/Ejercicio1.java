package nivel1;

public class Ejercicio1 {
	
	public static boolean esMayorQue(int a, int b) {
		// TODO
		return false;
	}

	public static void main(String[] args) {
		System.out.println(esMayorQue(1,2)); // false
		
		System.out.println(esMayorQue(-1,2)); // false
		
		System.out.println(esMayorQue(2,2)); // false
		
		System.out.println(esMayorQue(3,2)); // true
		
		System.out.println(esMayorQue(3,-2)); // true

	}

}
