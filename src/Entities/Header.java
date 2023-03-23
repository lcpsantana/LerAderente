package Entities;

public class Header {

	private String tipoRegistro;
	private String tipoOperacao;
	private String dia;
	private String mes;
	private String ano;

	public Header() {

	}

	public Header(String tipoRegistro, String tipoOperacao, String dia, String mes, String ano) {
		this.tipoRegistro = tipoRegistro;
		this.tipoOperacao = tipoOperacao;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

}
