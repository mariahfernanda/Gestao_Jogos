package br.senai.sp.jandira.model;

public enum Fabricante {

 
	SEGA ("SEGA"), 
	CAPCOM("CAPCOM"), 
	BANDAINANCO("BANDAI NANCO"), 
	UBISOFT("UBISOFT"), 
	ROCKSTAR("ROCKSTAR");
	
	private String fabricantess;

	private Fabricante(String fabricantes) {
		this.fabricantess = fabricantes;
	}

	public String getDescricao() {
		return fabricantess;
	}
}
