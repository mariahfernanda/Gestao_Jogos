package br.senai.sp.jandira.model;

public enum Console {

	PLAYSTATION4("PlayStation 4 , R$3.324,99 - R$4.499,00"), PLAYSTATION5("PlayStation 5 , R$4.989,90 - R%7.900,00"),
	XBOXONE("XBox , R$1.329,90 - R$2.799,00"), XBOX360("XBox 360 , R$1.068,57 - R$2.463,57"),
	NINTENDOSWITCH("Nintendo Switch , R$1.949,00 - R$2.299,99 "), NINTENDOWIIU("Wii U, R$1.198,00 - R$1.700,00");

	private String descricao;

	private Console(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
