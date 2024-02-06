package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		System.out.println(s);
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase();
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
	}
}
