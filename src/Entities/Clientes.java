package Entities;

public class Clientes {

	private String tipoRegistro;
	private String nomeDistribuidor;
	private String numeroSorte;

	public Clientes() {

	}

	public Clientes(String tipoRegistro, String nomeDistribuidor, String numeroSorte) {
		this.tipoRegistro = tipoRegistro;
		this.nomeDistribuidor = nomeDistribuidor;
		this.numeroSorte = numeroSorte;
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNomeDistribuidor() {
		return nomeDistribuidor;
	}

	public void setNomeDistribuidor(String nomeDistribuidor) {
		this.nomeDistribuidor = nomeDistribuidor;
	}

	public String getNumeroSorte() {
		return numeroSorte;
	}

	public void setNumeroSorte(String numeroSorte) {
		this.numeroSorte = numeroSorte;
	}

}
