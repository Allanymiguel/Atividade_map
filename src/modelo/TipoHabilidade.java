package modelo;

public enum TipoHabilidade {
	DRIBLE("Drible"), 
	VELOCIDADE("Velocidade"), 
	PASSE("Passe"), 
	COBRANCA_FALTA("Cobrança de falta"), 
	DEFESA("Defesa");
	
	TipoHabilidade(String nome) {
		this.nome = nome;
	}

	private String nome;

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return getNome();
	}
	
}
