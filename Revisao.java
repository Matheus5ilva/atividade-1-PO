import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Revisao { // Classe Atividade de Revis�o de Pesquisa Operacional

	public static void questao1() { // Metodo criado para responder a quest�o 1

		System.out.println("Ol� Mundo!"); // Foi usado println para quebra de linha automatica.

	}

	public static void questao2() { // Metodo criado para responder a quest�o 2

		int[] vector = new int[10]; // Cria��o de array simples de inteiro(int) de 10 posi��es come�ando do indece 0 at� 9.

		for (int contador = 0; contador < 10; contador++) { // La�o de repeti��o For para preencher o array declarado em cima automaticamente.
			
			double numero = Math.round((Math.random() * 100)); // Uma atributo ponto flutuante(double) para gerar numeros aleatorios
			
			boolean repetido = false; // Atributo booleano (true ou false) para garantir que n�o vai haver numeros repetidos gerados
			
			for (int i = 0; i < vector.length; i++) { // La�o de repeti��o que percorre o array com os numeros j� criados
				
				if (numero == vector[i]) { // Condicional para verificar se existe algum numero gerado � igual ao algum numero ja existente no array
					
					repetido = true; // altera��o do valor do atributo boolean
					
					break; // Parada do la�o de repeti��o, gerando outra repeti��o para gerar outro numero
				
				}
			}
			if (repetido == false) { // Verificando se o atributo boolean ainda continua falso
				
				vector[contador] = (int) numero; // Se o atributo boolean atender a condicional, � incrementado no array um numero aleatorio.
			
			}

		}
		for (int j = 0; j < 10; j++) { // La�o de repeti��o criado para Imprimir na tela os dados do array
			
			System.out.print(vector[j] + " "); // Foi usado print para n�o haver o pulo de linha automatico.
		
		}

	}

	public static void questao3() { // Metodo criado para responder a quest�o 3

		int[][] matriz = new int[10][10]; // Cria��o de array multidimensional(matriz) de inteiro(int) contendo linhas e colunas.

		for (int i = 0; i < 10; i++) { // La�o de repeti��o For para preencher as linhas da matriz.
			
			for (int j = 0; j < 10; j++) { // La�o de repeti��o For para preencher as colunas da matriz.
			
				double numero = Math.round((Math.random() * 100)); // Uma atributo ponto flutuante(double) para gerar numeros aleatorios
				
				matriz[i][j] = (int) numero; // A matriz vai ser preenchida pelo atributo de numeros aleatorios
			
			}
		
		}

		for (int l = 0; l < 10; l++) { // La�o de repeti��o criado para Imprimir na tela os dados das linhas da matriz
			
			System.out.print("|"); // Foi usado print para n�o haver o pulo de linha automatico.
			
			for (int m = 0; m < 10; m++) {// La�o de repeti��o criado para Imprimir na tela os dados das coluna da matriz
			
				System.out.print(" " + matriz[l][m] + " "); // Foi usado print para n�o haver o pulo de linha automatico. A� os numeros das linhas ficam juntas uma do lado da outra
			
			}
			
			System.out.println(" |"); // Foi usado println para quebra de linha automatica. Separando uma Linha da outra
		
		}
	}

	public static void questao4() { // Metodo criado para responder a quest�o 4
		
		ArrayList<Integer> vetor = new ArrayList<Integer>(); //Cria��o de um array usando uma biblioteca ArrayList<> com o tipo inteiro(Integer)

		for (int i = 0; i < 10; i++) { // La�o de repeti��o For para preencher o array declarado em cima automaticamente.
			
			double numero = Math.round((Math.random() * 100)); // Uma atributo ponto flutuante(double) para gerar numeros aleatorios

			vetor.add((int) numero); // Adicionando o valor gerado randomicamente via metodo ".add()". Esse metodo � da biblioteca ArrayList<>

		}

		System.out.println("O n�meros criados " + vetor + "\n"); // Foi usado println para quebra de linha automatica. E tamb�m para mostrar o array pronto para conferir os seguintes assuntos.

		Collections.sort(vetor); // Uso da Biblioteca Collections para ordernar o array do menor numero para o maior

		System.out.println("O menor valor do vetor � " + vetor.get(0)); // Impress�o da tela o menor valor do array. Usamos o metodo ".get(Indice do array)" para mostrar o valor do array.
		
		System.out.println("O maior valor do vetor � " + vetor.get(9)); // Impress�o da tela o maior valor do array. Usamos o metodo ".get(Indice do array)" para mostrar o valor do array.

		int aux = 0; // Declara��o de uma variavel auxiliar tipo inteiro(int) para  guardar os valores anteriores 
		
		for (int j = 0; j < 10; j++) { // La�o de repeti��o criado para percorrer os dados do array
		
			aux += vetor.get(j); // atribui��o e soma do atributo auxiliar com os valores do indice do array
		
		}
		
		int media = (aux / vetor.size()); // Atributo media foi criada para gerar a media de todos valores do array. A sua atribui��o j� � a conta matematica da media.

		System.out.println("A m�dia dos valores do vetor � " + media); // Impress�o da media do array na tela.
	}

	public static void questao5() { // Metodo criado para responder a quest�o 5

		int[][] matriz = new int[10][10]; // Cria��o de array multidimensional(matriz) de inteiro(int) contendo linhas e colunas. Servir� para armazenar a primeira matriz
		
		int[][] matriz2 = new int[10][10]; // Cria��o de array multidimensional(matriz) de inteiro(int) contendo linhas e colunas. Servir� para armazenar a segunda matriz
		
		int[][] matrizSoma = new int[10][10]; // Cria��o de array multidimensional(matriz) de inteiro(int) contendo linhas e colunas. Servir� para armazenar a soma da primeira matriz com a segunda matriz.
		
		try { //Recurso usado para tratamento de excess�es do Java. Requisito do leitor de arquivo  
			
			Scanner input = new Scanner(new File("C:\\\\Users\\\\mathe\\\\eclipse-workspace\\\\CursoAlura\\\\src\\\\matriz.txt")); // Usado a biblioteca Scanner para ler o arquivo. O File � para localizar e acessar o arquivo.
			
			// matriz 1
			for (int i = 0; i < 10; i++) { // La�o de repeti��o For para ler do arquivo e preencher as linhas da matriz.
				
				for (int j = 0; j < 10; j++) { // La�o de repeti��o For para ler do arquivo e preencher as colunas da matriz.
				
					matriz[i][j] = input.nextInt(); // A primeira matriz vai ser preenchida pelo atributo "retirado" do arquivo .txt .
				 
				}
			
			}
			
			System.out.println("Matriz 1"); // Foi usado println para quebra de linha automatica.
			
			for (int l = 0; l < 10; l++) {// La�o de repeti��o criado para Imprimir na tela os dados das linhas da matriz
			
				for (int m = 0; m < 10; m++) {// La�o de repeti��o criado para Imprimir na tela os dados das coluna da matriz
				
					System.out.print(" " + matriz[l][m] + " "); // Foi usado print para n�o haver o pulo de linha automatico. A� os numeros das linhas ficam juntas uma do lado da outra
				
				}
				
				System.out.println(" "); // Foi usado println para quebra de linha automatica. Separando uma Linha da outra
			
			}
			
			System.out.println(); // Foi usado println para quebra de linha automatica. Separando uma matriz da outra
			
			// matriz 2
			
			for (int a = 0; a < 10; a++) {  // La�o de repeti��o For para ler do arquivo e preencher as linhas da matriz.
				
				for (int b = 0; b < 10; b++) {// La�o de repeti��o For para ler do arquivo e preencher as colunas da matriz.
				
					matriz2[a][b] = input.nextInt(); // A segunda matriz vai ser preenchida pelo atributo "retirado" do arquivo .txt .
				
				}
			
			}
			
			System.out.println("Matriz 2");// Foi usado println para quebra de linha automatica.
			
			for (int o = 0; o < 10; o++) {// La�o de repeti��o criado para Imprimir na tela os dados das linhas da matriz
			
				for (int p = 0; p < 10; p++) {// La�o de repeti��o criado para Imprimir na tela os dados das coluna da matriz
				
					System.out.print(" " + matriz2[o][p] + " ");// Foi usado print para n�o haver o pulo de linha automatico. A� os numeros das linhas ficam juntas uma do lado da outra
				
				}
				
				System.out.println(" ");// Foi usado println para quebra de linha automatica. Separando uma Linha da outra
			
			}

			System.out.println();// Foi usado println para quebra de linha automatica. Separando uma matriz da outra
			
			//Matriz da Soma
			
			System.out.println("Soma das Matrizes");// Foi usado println para quebra de linha automatica.
			
			for (int c = 0; c < 10; c++) {// La�o de repeti��o For para ler das duas matrizes anteriores e preencher as linhas da matriz.
			
				for (int d = 0; d < 10; d++) {// La�o de repeti��o For para ler das duas matrizes anteriores e preencher as colunas da matriz.
				
					matrizSoma[c][d] = matriz[c][d] + matriz2[c][d]; // Essa matriz tera a soma da primeira e segunda matriz. Foi utilizado o [c][d] para mostrar qual o indice da linha e coluna que estamos.
				
				}
			
			}
			
			for (int x = 0; x < 10; x++) {// La�o de repeti��o criado para Imprimir na tela os dados das linhas da matriz
			
				for (int y = 0; y < 10; y++) {// La�o de repeti��o criado para Imprimir na tela os dados das linhas da matriz
				
					System.out.print(" " + matrizSoma[x][y] + " ");// Foi usado print para n�o haver o pulo de linha automatico. A� os numeros das linhas ficam juntas uma do lado da outra
				
				}
				
				System.out.println(" ");// Foi usado println para quebra de linha automatica. Separando uma Linha da outra
			
			}

		} catch (IOException ioe) { //Como temos o tratamento de excess�o try, � da biblioteca usarmos o catch para completar
			
			System.out.println(ioe); // Impress�o na tela da mensagem do erro ocorrido. (Se houver).
		
		}
	
	}

	public static void main(String[] args) { //Metodo principal do programa

		Scanner opcMenu = new Scanner(System.in); // Atributo da biblioteca Scanner para lermos do teclado a op��o do usuario.

		System.out.println("\t***** Trabalho de Pesquisa Operacional *****\n");
		System.out.println("1- Fa�a um programa que escreva �Ol� mundo�.");
		System.out.println("2- Fa�a um programa que leia 10 n�meros e os armazene em um vetor. Imprima o vetor.");
		System.out.println("3- Fa�a um programa que leia e preencha uma matriz de 10x10. No final, imprima a matriz.");
		System.out.println(
				"4- Fa�a um programa que leia 10 n�meros e calcule imprima o maior valor, o menor valor e a m�dia.");
		System.out.println(
				"5- Fa�a um programa que leia 2 matrizes de um arquivo .txt de tamanho 10x10 e calcule a soma das duas matrizes. Imprima a matriz resultante.");
		System.out.println("--------------------------------");
		System.out.println("Escolha o n�mero da quest�o");

		int opc = opcMenu.nextInt(); //Atributo que recebe o valor do teclado e converte para inteiro.

		switch (opc) { // Tipo de condicional usado para criar um menu e mostrar o resultado da escolha do usuario.
		
		case 1: // Caso o usuario clique 1, vai ser redirecionado para a quest�o 1
		
			System.out.println("--------------------------------");
			
			questao1(); // Chamada do metodo para a quest�o 1
			
			break;
		
		case 2:// Caso o usuario clique 2, vai ser redirecionado para a quest�o 2
			
			System.out.println("--------------------------------");
			
			questao2(); // Chamada do metodo para a quest�o 2
			
			break;
		
		case 3:// Caso o usuario clique 3, vai ser redirecionado para a quest�o 3
		
			System.out.println("--------------------------------");
			
			questao3(); // Chamada do metodo para a quest�o 3
			
			break;
		
		case 4:// Caso o usuario clique 4, vai ser redirecionado para a quest�o 4
		
			System.out.println("--------------------------------");
			
			questao4(); // Chamada do metodo para a quest�o 4
			
			break;
		
		case 5:// Caso o usuario clique 5, vai ser redirecionado para a quest�o 5
		
			System.out.println("--------------------------------");
			
			questao5(); // Chamada do metodo para a quest�o 5
			
			break;
		
		default:// Caso o usuario clique num numero que n�o � das op�oes na tela, vai ser redirecionado uma mensagem de erro
		
			System.out.println("--------------------------------");
			
			System.out.println("Op��o inv�lida! Tente novamente."); // Mensagem de erro.
		
		}

	}
}
