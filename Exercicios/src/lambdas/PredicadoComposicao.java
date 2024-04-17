package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> ispar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = 
				num ->  num >= 100 && num <= 999;
				
				System.out.println(ispar.and(isTresDigitos).negate().test(123));
				System.out.println(ispar.or(isTresDigitos).test(123));
				
	}
}
