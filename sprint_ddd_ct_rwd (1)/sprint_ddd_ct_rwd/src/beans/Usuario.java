package br.com.codeyo.beans;


public class Usuario {
	private String nomeCompleto;
	private String dataNascimento;
	private String genero;
	private String cpf;
	private String nomeMae;
	private String email;
	private String numeroCelular;
	private String dataHoraCadastro;
	private boolean possuiNecessidadeVisual;
	private Endereco endereco;
	private Documento documento;

	public Usuario() {
	}

	public Usuario(String nomeCompleto, String dataNascimento, String genero, String cpf, String nomeMae, String email,
			String numeroCelular, Endereco endereco, Documento documento, String dataHoraCadastro,
			boolean possuiNecessidadeVisual) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.cpf = cpf;
		this.nomeMae = nomeMae;
		this.email = email;
		this.numeroCelular = numeroCelular;
		this.endereco = endereco;
		this.documento = documento;
		this.dataHoraCadastro = dataHoraCadastro;
		this.possuiNecessidadeVisual = possuiNecessidadeVisual;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getDataHoraCadastro() {
		return dataHoraCadastro;
	}

	public void setDataHoraCadastro(String dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}

	public boolean getPossuiNecessidadeVisual() {
		return possuiNecessidadeVisual;
	}

	public void setPossuiNecessidadeVisual(boolean possuiNecessidadeVisual) {
		this.possuiNecessidadeVisual = possuiNecessidadeVisual;
	}
}
