package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		
		data1.dia = 12;
		data1.mes = 8;
		data1.ano = 2015;
		
		System.out.println("Hoje é dia " + data1.dia + " Do mês " + data1.mes + " De " + data1.ano );
		
		Data data2 = new Data();
		
		data2.dia = 15;
		data2.mes = 4;
		data2.ano = 2016;
		
		System.out.println("Hoje é dia " + data2.dia + " Do mês " + data2.mes + " De " + data2.ano );
	}
}
