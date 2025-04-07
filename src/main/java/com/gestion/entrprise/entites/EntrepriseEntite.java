package com.gestion.entrprise.entites;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="entreprise")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EntrepriseEntite {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long idEntreprise;
		
		@Column(nullable = false , unique = true)
		private String nom;
		
		@Column(nullable = false , unique = true)
	    private String adresse;
	    
		@Column(nullable = false , unique = true)
	    private String siteWeb;

	    @ElementCollection
	    private List<String> secteurs;

	    @OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL)
	    private List<DirectionEntite> directions;

	


}
