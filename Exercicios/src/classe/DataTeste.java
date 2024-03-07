package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		
		System.out.println(data1.obterDataFormatada());
		
		Data data2 = new Data(31, 12, 2020);
		
		
		System.out.println(data2.obterDataFormatada() );
	}
}
