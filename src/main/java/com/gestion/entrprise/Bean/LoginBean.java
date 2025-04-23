package com.gestion.entrprise.Bean;

import jakarta.faces.context.FacesContext;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.IOException;
import java.io.Serializable;

@Named
@ViewScoped
public class LoginBean implements Serializable{
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String username;
	    private String password;

	    public void login() throws IOException {
	        if ("admin".equals(username) && "admin".equals(password)) {
	            FacesContext.getCurrentInstance().getExternalContext()
	                    .redirect("pages/index.xhtml");
	        } else {
	            FacesContext.getCurrentInstance().addMessage(null,
	                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
	                            "Échec de la connexion", "Nom d'utilisateur ou mot de passe incorrect."));
	        }
	    }

	    // Getters & setters
	    public String getUsername() { return username; }
	    public void setUsername(String username) { this.username = username; }
	    public String getPassword() { return password; }
	    public void setPassword(String password) { this.password = password; }
	


}
