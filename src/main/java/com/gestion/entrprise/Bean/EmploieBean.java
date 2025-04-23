package com.gestion.entrprise.Bean;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

import com.gestion.entrprise.Dto.EmploieDto;

@Named
@ViewScoped
public class EmploieBean implements Serializable {
	
	
	    private EmploieDto emploie;

	    @PostConstruct
	    public void init() {
	        emploie = new EmploieDto();
	    }

	    public void save() {
	        // Tu pourras appeler un service ici pour sauvegarder dans la base de données
	        System.out.println("Enregistrement : " + emploie);
	        emploie = new EmploieDto(); // Réinitialise le formulaire après sauvegarde
	    }

	    // Getters et Setters
	    public EmploieDto getEmploie() {
	        return emploie;
	    }

	    public void setEmploie(EmploieDto emploie) {
	        this.emploie = emploie;
	    }
	


}
