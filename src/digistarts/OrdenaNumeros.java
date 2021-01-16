package digistarts;

import java.util.Arrays;

/*@Autor claudemir faganello (faganello.claudemir@gmail.com)
*/

public class OrdenaNumeros {

	public int[] ordena(int numeros[]) {
		int[] numerosUnicos = this.removeRepetidos(numeros);

		for (int atual = 0; atual < numerosUnicos.length; atual++) {
			int menor = getMenor(numerosUnicos, atual, numerosUnicos.length - 1);
			int numeroAtual = numerosUnicos[atual];
			int numeroMenor = numerosUnicos[menor];
			numerosUnicos[atual] = numeroMenor;
			numerosUnicos[menor] = numeroAtual;
		}

		for (int i = 0; i <= numerosUnicos.length - 1; i++) {
			System.out.println(numerosUnicos[i]);
		}
		return numerosUnicos;
	}

	public int getMenor(int[] numeros, int inicio, int termino) {
		int menor = inicio;
		for (int atual = inicio; atual <= termino; atual++) {
			if (numeros[atual] < numeros[menor]) {
				menor = atual;
			}
		}
		return numeros[menor];
	}

	public int[] removeRepetidos(int[] numeros) {

		int[] unicos = new int[numeros.length];
		int qtd = 0;
		for (int i = 0; i < numeros.length; i++) {
			boolean existe = false;
			for (int j = 0; j < qtd; j++) {
				if (unicos[j] == numeros[i]) {
					existe = true;
					break;
				}
			}
			if (!existe) {
				unicos[qtd++] = numeros[i];
			}
		}

		unicos = Arrays.copyOf(unicos, qtd);

		
		return unicos;
	}

}
