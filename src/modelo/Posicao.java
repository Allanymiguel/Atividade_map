package modelo;

public enum Posicao {

	GOLEIRO("Goleiro"), ZAGUEIRO("Zagueiro"), LATERAL("Lateral"), MEIO_CAMPO("Meio-campo"), ATACANTE("Atacante");

	private String nome;

	Posicao(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return getNome();
	}

}
