package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String s = new String ("Texto");
		s.toUpperCase();
		
		// Wrappers são a versão objetos dps primitivos!
		
		int a = 123;
		System.out.println(a);
		
	}
}
