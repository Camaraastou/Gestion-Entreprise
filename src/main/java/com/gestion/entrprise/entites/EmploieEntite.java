package com.gestion.entrprise.entites;


import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmploieEntite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmploye;
	
	@Column(nullable = false)
	private String nom;
	
	@Column(nullable = false)
    private String prenom;
	
	@Column(nullable = false)
    private String adresse;
	
	@Column(nullable = false, unique = true)
    private String telephone;
	
	@Column(nullable = false, unique = true)
    private String email;
	
	@Column(nullable = false, unique = true)
    private String fonction;
	
	@Column(nullable = false)
    private LocalDate dateEntree;
	
	@Column(nullable = false)
    private BigDecimal salaireAnnuel;
	
	
	@ManyToOne
    @JoinColumn(name = "idDirection", nullable = false)
    private DirectionEntite directionEntite;
	
	
	


}
