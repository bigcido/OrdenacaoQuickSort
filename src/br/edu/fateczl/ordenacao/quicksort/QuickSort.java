package br.edu.fateczl.ordenacao.quicksort;

public class QuickSort {

	public QuickSort() {
		super();
	}
	public int[] quickSort(int[] vetor, int inicio, int fim) {;
		if (fim > inicio) {
			int pivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, pivoFixo-1);//subvetor esquerda
			quickSort(vetor, pivoFixo+1, fim); // subvetor direita
			
		} else {
			if(fim == inicio) {
				System.out.println("Fixo: " +fim);
			}
		}
		
		return vetor;
	}
		
	private int dividir(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int ponteiroEsquerda = inicio+1;
		int ponteiroDireita =  fim;
		
		while(ponteiroEsquerda <= ponteiroDireita) {
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while(ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			if (ponteiroEsquerda < ponteiroDireita) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		trocar(vetor, inicio, ponteiroDireita);
		System.out.println("Fixo: " +ponteiroDireita);
		return ponteiroDireita; //não é o ARBITRÁRIO
	}
	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
}
