package digistarts;

/*@Autor claudemir faganello (faganello.claudemir@gmail.com)
*/

public class Teste {

	public static void main(String[] args) {
		OrdenaNumeros o = new OrdenaNumeros();
		int numeros[] = { 1, 2, 0, 8, 3, 1, 2, 1, 2, 1, 2, 6, 9, 4, 13, 5, 5, 5, 5, 5, 5 };
		int[] novoArray = o.ordena(numeros);
		for (int i = 0; i <= novoArray.length - 1; i++) {
			System.out.println(novoArray[i]);
		}

	}

}
