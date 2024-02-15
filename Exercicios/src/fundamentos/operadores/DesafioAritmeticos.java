package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int ab = 3 * 4 - 10 ;
		int bb= (int) Math.pow(ab, 3);
		
		System.out.println(bb);
		
		double a = 6 *(3 +2);
		double aPotentiation = Math.pow(a, 2);
		System.out.println(aPotentiation);
		
		double b = 3 * 2;
		double c = aPotentiation / b;
		
		double d = (1 - 5) * (2 - 7);
		double e = d /2;
		double ePotentiation = Math.pow(e, 2);
		double f = c - ePotentiation;
		
		double fPotentiation = Math.pow(f, 3);
		System.out.println(fPotentiation);
		double g = 10;
		double gPotentiation = Math.pow(g, 3);
		
		double result = fPotentiation / gPotentiation;
		System.out.println(result);
		
	}
}
