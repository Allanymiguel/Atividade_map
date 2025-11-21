package app;

import java.util.HashMap;
import java.util.Map;

import modelo.Jogador;

public class Principal {
	
	private static int idAtual = 1;

	public static void main(String[] args) {

		Map<Integer, Jogador> map = new HashMap<Integer, Jogador>();

		boolean ligado = true;
		while (ligado) {

			switch (JogadorServicos.menu()) {
			case 1:
				map.put(idAtual++, JogadorServicos.lerDadosJogador());
				break;
			case 2:
				JogadorServicos.editarJogador(map);
				break;
			case 3:
				JogadorServicos.imprimirJogadores(map);
				break;
			case 4:
				if (JogadorServicos.removerJogador(map)) {
					System.out.println("Jogador removido com sucesso.");
				} else {
					System.out.println("Não foi possível remover jogador.");
				}
				;
				break;
			case 0:
				ligado = false;
				System.out.println("Finalizando programa...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}

	}

}
