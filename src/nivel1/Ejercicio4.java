package nivel1;

public class Ejercicio4 {

	public static boolean sonIguales(String a, String b) {
		// TODO sin usar == porque asi no se comparan Strings
		// a investigar!
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(sonIguales("test", "test")); // true

		System.out.println(sonIguales(new String("test"), "test")); // true
	}

}
