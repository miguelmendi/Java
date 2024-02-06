package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações funcionario
		
		//Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 50000;
		long pontosAcumulados = 3_234_845_235L;
		
		// Tipos numéricos reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_998_784_103.01;
		
		// Tipo booleano
		
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ":ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
