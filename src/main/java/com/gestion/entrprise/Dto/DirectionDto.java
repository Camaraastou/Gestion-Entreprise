package com.gestion.entrprise.Dto;

public class DirectionDto {
	
	private long idDirection;
	private String nom;
	public DirectionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DirectionDto(long idDirection, String nom) {
		super();
		this.idDirection = idDirection;
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "DirectionDto [idDirection=" + idDirection + ", nom=" + nom + "]";
	}
	public long getIdDirection() {
		return idDirection;
	}
	public void setIdDirection(long idDirection) {
		this.idDirection = idDirection;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	


	

}
