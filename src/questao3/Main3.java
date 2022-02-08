package questao3;

import java.util.Arrays;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		
		/* Letra que não se repete
		 * 
		 * Conforme as strings de teste, criar programa que encontre a primeira letra que não se repete no restante da string,
		 * caso não seja encontrado deve retornar o valor “_”.
		 * 
		 * 1: aaabccccdeeef
		 * 2: strings
		 * 3: microsoft visual studio 2022
		 * 4: abcedoftz
		*/
		
		List<String> listaStrings = Arrays.asList("aaabccccdeeef", "strings", "microsoft visual studio 2022", "abcedoftz");
		
		for (String string : listaStrings) {
			executarLogicaLetraRepetida(string);
		}
	}
	
	public static void executarLogicaLetraRepetida(String string) {
		
		while (true) {
			
			String primeiraLetra = null;
			
			try {
				primeiraLetra = String.valueOf(string.charAt(0));
			} catch (Exception e) {
				System.out.println("_");
				break;
			}
			
			string = string.substring(1, string.length());
			
			if (string.contains(primeiraLetra)) {
				string = string.replaceAll(primeiraLetra, "");
			} else {
				System.out.println(primeiraLetra);
				break;
			}
		}
	}
}
