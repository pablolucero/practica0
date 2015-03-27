package nivel1;

public class Ejercicio8 {
	
	public static boolean esCapicua(int x) {
		// TODO
		return false;
	}
	
	public static void main(String[] args) {
	
		System.out.println(esCapicua(1234)); // false
		
		System.out.println(esCapicua(121)); // true
		
		System.out.println(esCapicua(124421)); // true
		
		System.out.println(esCapicua(11211)); // true
		
		System.out.println(esCapicua(11221)); // false
		
		System.out.println(esCapicua(1220)); // false
		
	}

}
