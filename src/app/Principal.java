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
				JogadorServicos.removerJogador(map);
				break;
			case 0:
				ligado = false;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}

	}

}
