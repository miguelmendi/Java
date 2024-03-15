package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("lia"));
		lista.add(new Usuario("bia"));
		lista.add(new Usuario("manu"));
		
		System.out.println(lista.get(3).nome); // acessar pelo índice
		
		System.out.println(">>>>>>" + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("Tem? " + lista.contains(new Usuario("lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.toString());
		}
	}
}
