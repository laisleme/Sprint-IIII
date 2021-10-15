package br.com.codeyo.beans;

public class Documento {
	private int id;
	private String caminhoSelfie;
	private String caminhoComprovanteEndereco;
	private String caminhoDocumentoIdentFrente;
	private String caminhoDocumentoIdentVerso;

	public Documento() {
	}

	public Documento(int id, String caminhoSelfie, String caminhoComprovanteEndereco,
			String caminhoDocumentoIdentificacaoFrente, String caminhoDocumentoIdentificacaoVerso) {
		super();

		this.id = id;
		this.caminhoSelfie = caminhoSelfie;
		this.caminhoComprovanteEndereco = caminhoComprovanteEndereco;
		this.caminhoDocumentoIdentFrente = caminhoDocumentoIdentificacaoFrente;
		this.caminhoDocumentoIdentVerso = caminhoDocumentoIdentificacaoVerso;
	}

	public int getId() {
		return id;
	}

	public String getCaminhoSelfie() {
		return caminhoSelfie;
	}

	public String getCaminhoComprovanteEndereco() {
		return caminhoComprovanteEndereco;
	}

	public String getCaminhoDocumentoIdentFrente() {
		return caminhoDocumentoIdentFrente;
	}

	public String getCaminhoDocumentoIdentVerso() {
		return caminhoDocumentoIdentVerso;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCaminhoSelfie(String caminhoSelfie) {
		this.caminhoSelfie = caminhoSelfie;
	}

	public void setCaminhoComprovanteEndereco(String caminhoComprovanteEndereco) {
		this.caminhoComprovanteEndereco = caminhoComprovanteEndereco;
	}

	public void setCaminhoDocumentoIdentFrente(String caminhoDocumentoIdentFrente) {
		this.caminhoDocumentoIdentFrente = caminhoDocumentoIdentFrente;
	}

	public void setCaminhoDocumentoIdentVerso(String caminhoDocumentoIdentVerso) {
		this.caminhoDocumentoIdentVerso = caminhoDocumentoIdentVerso;
	}

	
}
