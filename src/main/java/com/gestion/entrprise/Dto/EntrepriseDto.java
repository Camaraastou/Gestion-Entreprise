package com.gestion.entrprise.Dto;

import java.util.List;

public class EntrepriseDto {
	
	private long idEntreprise;
	private String nom;
    private String adresse;
    private String siteWeb;
    private List<String> secteurs;
    
	@Override
	public String toString() {
		return "EntrepriseDto [idEntreprise=" + idEntreprise + ", nom=" + nom + ", adresse=" + adresse + ", siteWeb="
				+ siteWeb + ", secteurs=" + secteurs + "]";
	}

	public EntrepriseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntrepriseDto(long idEntreprise, String nom, String adresse, String siteWeb, List<String> secteurs) {
		super();
		this.idEntreprise = idEntreprise;
		this.nom = nom;
		this.adresse = adresse;
		this.siteWeb = siteWeb;
		this.secteurs = secteurs;
	}

	public long getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(long idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public List<String> getSecteurs() {
		return secteurs;
	}

	public void setSecteurs(List<String> secteurs) {
		this.secteurs = secteurs;
	}
	
	
    
    





	

}
