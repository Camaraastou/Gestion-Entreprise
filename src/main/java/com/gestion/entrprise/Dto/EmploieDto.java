package com.gestion.entrprise.Dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmploieDto {

	private int idEmploye;
	private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    private String fonction;
    private LocalDate dateEntree;
    private BigDecimal salaireAnnuel;
	@Override
	public String toString() {
		return "EmploieDto [idEmploye=" + idEmploye + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", telephone=" + telephone + ", email=" + email + ", fonction=" + fonction + ", dateEntree="
				+ dateEntree + ", salaireAnnuel=" + salaireAnnuel + "]";
	}
	public EmploieDto(int idEmploye, String nom, String prenom, String adresse, String telephone, String email,
			String fonction, LocalDate dateEntree, BigDecimal salaireAnnuel) {
		super();
		this.idEmploye = idEmploye;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.fonction = fonction;
		this.dateEntree = dateEntree;
		this.salaireAnnuel = salaireAnnuel;
	}
	public EmploieDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public LocalDate getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(LocalDate dateEntree) {
		this.dateEntree = dateEntree;
	}
	public BigDecimal getSalaireAnnuel() {
		return salaireAnnuel;
	}
	public void setSalaireAnnuel(BigDecimal salaireAnnuel) {
		this.salaireAnnuel = salaireAnnuel;
	}
    
    
    









}
