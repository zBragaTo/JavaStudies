package __Aula3_ED;

import java.util.Scanner;

//Classe __Aula3_ED: encarregada de executar algumas funcionalidades
//com objetos do tipo Candidato a um concurso musical armazenados em um vetor.
// Autor Professor: Ivan Carlos Alcântara de Oliveira.
// Data da Criação: 31/08/2024. 15h.
// Autor Aluno: <Leonardo Bragato Bassi / RA - 10416029>
// Data da currentização: <24/09/2024>

public class __Aula3_ED {
	// Objeto de leitura
	private Scanner ler = new Scanner(System.in);
	// constante com o total de Candidato
	public static final int MAX_Candidato = 15;

	// main: ponto de entrada do programa
	public static void main(String[] args) {
		// Cria objeto da Classe com a
		// execução das funcionalidades solicitadas
		new __Aula3_ED();
	}

	// Construtor da classe encarregada de realizar a execução
	// das funcionalidades solicitadas
	public __Aula3_ED() {
		// Vetor de Candidato
		Candidato Candidato[];
		// Cria vetor de objetos do tipo Candidato para
		// uso nos métodos de ordenação e pesquisa
		Candidato = new Candidato[MAX_Candidato];

		// Cria lista de Candidato
		createCandidatoList(Candidato);
		// Mostra todos os Candidato cadastrados na ordem do cadastro
		showAllCandidato(Candidato);

		// Procura um candidato pelo nome em um vetor não ordenado
		System.out.println("Forneça o nome do candidato: ");
		String CandidatoName = ler.nextLine();
		Candidato cand = sequentialSearch(CandidatoName, Candidato);
		if (cand != null) {
			System.out.println("Candidato Data: " + cand.toString());
		} else {
			System.out.println("Candidato Not Found!");
		}

		// Ordena o vetor de Candidato pelo número do candidato
		selectionSort(Candidato);
		// Mostra os Candidato ordenados por número do candidato
		showAllCandidato(Candidato);

		// Procura um candidato no vetor ordenado pelo número do candidato
		System.out.println("Forneça um número de candidato:");
		String CandidatoNumber = ler.nextLine();
		cand = binarySearch(Integer.parseInt(CandidatoNumber), Candidato);
		if (cand != null) {
			System.out.println("Candidato Data: " + cand.toString());
		} else {
			System.out.println("Candidato Not Found!");
		}

		// Ordena o vetor de Candidato pelo nome do candidato
		bubbleSort(Candidato);
		// Mostra os Candidato ordenados por nome
		showAllCandidato(Candidato);

		// Ordena o vetor de Candidato pela idade do candidato
		insertionSort(Candidato);
		// Mostra os Candidato ordenados por idade
		showAllCandidato(Candidato);

	}

	// Método encarregado de criar objetos da classe Candidato
	// e armazenar em um vetor.
	// Este método foi criado para evitar a necessidade de
	// fazer a leitura de dados de Candidato na fase de testes dos outros ´
	// métodos a serem modificados.
	// Você deve inserir mais 5 Candidato na base
	public void createCandidatoList(Candidato[] Candidato) {
		Candidato[0] = new Candidato(1111, "111.111.111-11", "Leonardo", 18, 'M', "rock");
		Candidato[1] = new Candidato(8888, "888.888.888-88", "Luiza", 21, 'F', "romantica");
		Candidato[2] = new Candidato(7777, "777.777.777-77", "Pedro", 22, 'M', "rock");
		Candidato[3] = new Candidato(6666, "666.666.666-66", "Ana Lopes", 54, 'F', "sertanejo");
		Candidato[4] = new Candidato(3333, "333.333.333-33", "Mariana", 25, 'F', "sertanejo");
		Candidato[5] = new Candidato(4444, "444.444.444-44", "Amilton", 35, 'M', "rock");
		Candidato[6] = new Candidato(2222, "222.222.222-22", "Juliano", 19, 'M', "forró");
		Candidato[7] = new Candidato(5555, "555.555.555-55", "Luciano", 52, 'M', "forró");
		Candidato[8] = new Candidato(1010, "101.101.101-10", "Christiane", 35, 'F', "rock");
		Candidato[9] = new Candidato(9999, "999.999.999-99", "Luis Alberto C.", 18, 'M', "rap");
		// Criar a partir daqui mais 5 objetos da classe candidato

		Candidato[10] = new Candidato(1231, "123.111.111-11", "Ronaldo", 30, 'M', "funk");
		Candidato[11] = new Candidato(8788, "321.888.888-88", "Cristina", 24, 'F', "romantica");
		Candidato[12] = new Candidato(7877, "456.777.777-77", "Lucas", 21, 'M', "rock");
		Candidato[13] = new Candidato(6476, "876.666.666-66", "Camila", 34, 'F', "samba");
		Candidato[14] = new Candidato(3563, "987.333.333-33", "Carol", 25, 'F', "pop");

	}

	// Método que apresenta todos os dados dos Candidato cadastrados.
	// Se houver Candidato exibe a mensagem:
	// "Candidato cadastrados:", seguido dos seus dados um por linha.
	// Caso não haja Candidato cadastrados mostra a mensagem: "Não há Candidato
	// cadastrados!"
	public void showAllCandidato(Candidato[] Candidato) {
		String result = "";
		for (int i = 0; i < Candidato.length; i++) {
			result += Candidato[i].toString() + "\n";
		}
		if (Candidato.length >= 1)
			System.out.println("Registered Candidato:\n" + result);
		else
			System.out.println("No Candidato registered!");
	}

	// Método encarregado de pesquisar um candidato
	// armazenado em um vetor (ordenado ou não)
	// tendo como chave o nome do candidato.
	public Candidato sequentialSearch(String CandidatoName, Candidato[] Candidato) {
		for (int i = 0; i < Candidato.length; i++) {
			if (Candidato[i].getNome().equalsIgnoreCase(CandidatoName)) {
				return Candidato[i];
			}
		}
		return null;
	}

	// Método encarregado de pesquisar um candidato
	// armazenado em um vetor ordenado
	// tendo como chave o número do candidato.
	public Candidato binarySearch(int key, Candidato[] Candidato) {
		int start = 0;
		int end = Candidato.length - 1;

		while (start <= end) {
			int middle = (start + end) / 2;

			if (Candidato[middle].getNumero_candidato() == key) {
				return Candidato[middle];
			} else if (Candidato[middle].getNumero_candidato() < key) {
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return null;
	}

	// Método encarregado de ordenar os Candidato
	// armazenados em um vetor pelo número do candidato.
	public void selectionSort(Candidato[] Candidato) {
		for (int i = 0; i < Candidato.length - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < Candidato.length; j++) {
				if (Candidato[j].getNumero_candidato() < Candidato[smallestIndex].getNumero_candidato()) {
					smallestIndex = j;
				}
			}
			Candidato temp = Candidato[i];
			Candidato[i] = Candidato[smallestIndex];
			Candidato[smallestIndex] = temp;
		}
	}

	// Método encarregado de ordenar os Candidato
	// armazenados em um vetor pela idade do candidato.
	public void insertionSort(Candidato[] Candidato) {
		for (int i = 1; i < Candidato.length; i++) {
			Candidato current = Candidato[i];
			int j = i - 1;

			while (j >= 0 && Candidato[j].getIdade() > current.getIdade()) {
				Candidato[j + 1] = Candidato[j];
				j--;
			}
			Candidato[j + 1] = current;
		}
	}

	// Método encarregado de ordenar os Candidato
	// armazenados em um vetor pelo nome do candidato.
	public void bubbleSort(Candidato[] Candidato) {
		boolean swapped;
		for (int i = 0; i < Candidato.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < Candidato.length - 1 - i; j++) {
				if (Candidato[j].getNome().compareTo(Candidato[j + 1].getNome()) > 0) {
					Candidato temp = Candidato[j];
					Candidato[j] = Candidato[j + 1];
					Candidato[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}
}