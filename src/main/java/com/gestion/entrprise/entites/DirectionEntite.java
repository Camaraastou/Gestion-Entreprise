package com.gestion.entrprise.entites;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="direction")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DirectionEntite {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDirection;
	
	@Column(nullable = false , unique = true)
	private String nom;
	
	 @ManyToOne
	    @JoinColumn(name = "entreprise_id", nullable = false)
	    private EntrepriseEntite entreprise;

	   
	    
	    @OneToMany(mappedBy = "direction")
	    private List<EmploieEntite> employes;
	    



}
