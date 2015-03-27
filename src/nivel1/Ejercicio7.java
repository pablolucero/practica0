package nivel1;

public class Ejercicio7 {

	public static boolean esVocal(char x) {
		switch (x) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(esVocal('a')); //true
		
		System.out.println(esVocal('b')); //false

		System.out.println(esVocal('y')); //false
		
		System.out.println(esVocal('i')); //true
	}

}

