package modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Jogador {

	private String nome;
	private String timeAtual;
	private int idade;
	private float altura;
	private List<Habilidade> habilidades = new ArrayList<>();
	private Posicao posicao;

	public Jogador(String nome, String timeAtual, int idade, float altura, List<Habilidade> habilidades,
			Posicao posicao) {
		super();
		this.nome = nome;
		this.timeAtual = timeAtual;
		this.idade = idade;
		this.altura = altura;
		this.habilidades = (habilidades != null) ? new ArrayList<>(habilidades) : new ArrayList<>();
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTimeAtual() {
		return timeAtual;
	}

	public void setTimeAtual(String timeAtual) {
		this.timeAtual = timeAtual;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public List<Habilidade> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, idade, nome, posicao, timeAtual);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Float.floatToIntBits(altura) == Float.floatToIntBits(other.altura) && idade == other.idade
				&& Objects.equals(nome, other.nome) && posicao == other.posicao
				&& Objects.equals(timeAtual, other.timeAtual);
	}

	@Override
	public String toString() {
		return "Nome do jogador: " + getNome() + "\nTime tual: " + getTimeAtual() + "\nIdade: " + getIdade()
				+ "\nAltura: " + getAltura() + "\n" + "Habilidades: " + habilidades + "\nPosição" + posicao;
	}

}
