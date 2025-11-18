package modelo;

import java.util.Objects;

public class Habilidade {
	private TipoHabilidade habilidade;
	private int nivel;

	/*
	 * @param habilidade O tipo de habilidade (ex: Drible, passe, chute). Não pode
	 * ser nulo.
	 * 
	 * @param nivel O nivel da habilidade, entre 0 e 100.
	 */
	public Habilidade(TipoHabilidade habilidade, int nivel) {
		this.habilidade = habilidade;
		this.nivel = nivel;
	}

	public TipoHabilidade getHabilidade() {
		return habilidade;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(habilidade, nivel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habilidade other = (Habilidade) obj;
		return habilidade == other.habilidade && nivel == other.nivel;
	}

	@Override
	public String toString() {
		return habilidade + ", nível: " + getNivel() + " | ";
	}

}
