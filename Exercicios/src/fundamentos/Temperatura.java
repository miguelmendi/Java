package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) * 5/9 = C;
		
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double f = 231;
		double celcius = (f - AJUSTE) * FATOR;
		System.out.println(celcius);
	}
}
