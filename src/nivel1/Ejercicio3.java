package nivel1;

public class Ejercicio3 {
	
	// utilizar un atributo static
	
	// 1 inch = 0.0277777778 yards
	public static void inchToYard(int inch) {
		System.out.println(inch * 0.0277777778);
	}

	public static void main(String[] args) {
		inchToYard(1);
		// 0.0277777778
		
		inchToYard(5);
		// 0.138888889 
		
	}
}
