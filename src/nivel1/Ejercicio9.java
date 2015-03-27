package nivel1;

public class Ejercicio9 {
	
	// REVISEN los metodos de la clase String!
	
	public static int longString(String s) {
		// TODO
		return 0;
	}
	
	public static String getPalabra(String s, int desde, int hasta) {
		// TODO
		return null;
	}
	
	public static String sacarEspaciosFinales(String s) {
		// TODO
		return null;
	}
	
	public static String concatenarStrings1(String s1, String s2) {
		// TODO
		return null;
	}
	
	public static String concatenarStrings2(String s1, String s2) {
		// TODO
		return null;
	}
	
	public static boolean estaVacio(String s) {
		// TODO
		return false;
	}
		
	public static String[] separarPorComa(String s) {
		// TODO
		return null;
	}
	
	public static String todoMayuscula(String s) {
		// TODO
		return null;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(longString("abcde")); // 5
		
		System.out.println(getPalabra("abcde",0,2)); // ab
		System.out.println(getPalabra("abcde",2,2)); // (vacio)
		
		System.out.println(("abcde   ")); 					  // abcde      // va a tener espacio este
		System.out.println(sacarEspaciosFinales("abcde   ")); // abcde
		
		System.out.println(concatenarStrings1("abc", "123"));
		System.out.println(concatenarStrings2("abc", "123"));
		
		System.out.println(estaVacio("abc"));
		System.out.println(estaVacio(""));
		
		int i = 1;
		String[] resultado = separarPorComa("abc,de,fgh");
		for (String r: resultado) {
			System.out.println(i + " " + r);
			i++;
		}
		// 1 abc
		// 2 de
		// 3 fgh
		
		System.out.println(todoMayuscula("abCDE")); // ABCDE
		System.out.println(todoMayuscula("abcde")); // ABCDE
		
	}

}
