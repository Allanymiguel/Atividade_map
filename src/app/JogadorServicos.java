package app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import modelo.Habilidade;
import modelo.Jogador;
import modelo.Posicao;
import modelo.TipoHabilidade;

public class JogadorServicos {
	
	private static final Scanner scan = new Scanner(System.in);

	public static int menu() {
		System.out.println("O que deseja fazer? ");
		System.out.println("Adicionar jogador? - Digite 1");
		System.out.println("Editar jogador? - Digite 2");
		System.out.println("Imprimir jogadores? - Digite 3");
		System.out.println("Excluir jogador? - Digite 4");
		System.out.println("Sair do programa?  - Digite 0");
		int opcao = scan.nextInt();
		scan.nextLine();

		return opcao;
	}

	public static void editarJogador(Map<Integer, Jogador> map) {
		if (map == null || map.isEmpty()) {
			System.out.println("Não há nenhum jogador cadastrado.");
			return;
		}

		imprimirJogadores(map);

		Integer id = null;

		while (id == null) {
			try {
				System.out.println("Digite o número do jogador que deseja atualizar: ");
				int numeroJogador = scan.nextInt();
				scan.nextLine();

				if (!map.containsKey(numeroJogador)) {
					System.out.println("ID não encontrado. Tente novamente.");
				} else {
					id = numeroJogador;
				}
			} catch (InputMismatchException e) {
				System.out.println("Erro. Por favor, tente novamente.");
				scan.nextLine();
			}
		}
		map.put(id, lerDadosJogador());

		System.out.println("Jogador atualaizado!");
	}

	static void imprimirJogadores(Map<Integer, Jogador> map) {
		System.out.println(map);
	}

	static void removerJogador(Map<Integer, Jogador> map) {
		imprimirJogadores(map);
		System.out.println("Informe o ID do jogador que deseja remover.");
		map.remove(scan.nextInt());
		scan.nextLine();
	}

	public static Jogador lerDadosJogador() {
		System.out.println("Informe o nome do jogador: ");
		String nome = scan.nextLine();
		System.out.println("Informe o nome do time atual do jogador: ");
		String time = scan.nextLine();
		System.out.println("Informe a idade do jogador: ");
		int idade = scan.nextInt();
		scan.nextLine();
		System.out.println("Informe a altura do jogador: ");
		float altura = converterAltura(scan.nextLine());

		List<Habilidade> habilidades = lerHabilidades();
		Posicao posicao = lerPosicao();

		return new Jogador(nome, time, idade, altura, habilidades, posicao);
	}

	private static float converterAltura(String s) {
		s.replace(".", ",");

		return Float.parseFloat(s);
	}

	private static List<Habilidade> lerHabilidades() {
		List<Habilidade> habilidades = new ArrayList<>();
		do {
			System.out.println("Informe a habilidade.");
			imprimirHabilidades();
			System.out.println("Digite o númeoro da habilidade que deseja: ");
			int escolhaHabilidade = scan.nextInt();
			scan.nextLine();
			TipoHabilidade habilidade = TipoHabilidade.values()[escolhaHabilidade - 1];
			System.out.println("De 0 - 100, informe o nível de " + habilidade.getNome() + " do jogador: ");
			int nivel = scan.nextInt();
			scan.nextLine();

			habilidades.add(new Habilidade(habilidade, nivel));

		} while (continuarLendoHabilidade());

		return habilidades;

	}

	static boolean continuarLendoHabilidade() {
		System.out.println("Deseja adicionar mais habilidades? ");
		System.out.println("Digite 1 para sim. ");
		System.out.println("Digite 2 para não. ");
		int opcao = scan.nextInt();
		scan.nextLine();
		if (opcao == 1)
			return true;
		else
			return false;
	}

	public static Posicao lerPosicao() {
		System.out.println("Informe a posição em que o jogador atua: ");
		imprimirPosicao();
		System.out.println("Informe o número da posição. ");
		int escolhaPosicao = scan.nextInt();
		scan.nextLine();
		return Posicao.values()[escolhaPosicao - 1];
	}

	private static void imprimirPosicao() {
		int count = 1;
		for (Posicao p : Posicao.values()) {
			System.out.println(count + "." + p);
			count++;
		}
	}

	private static void imprimirHabilidades() {
		int count = 1;
		for (TipoHabilidade tipo : TipoHabilidade.values()) {
			System.out.println(count + "." + tipo);
			count++;
		}
	}
}
