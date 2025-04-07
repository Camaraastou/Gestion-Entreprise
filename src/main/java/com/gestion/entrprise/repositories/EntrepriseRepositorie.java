package com.gestion.entrprise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.entrprise.entites.EntrepriseEntite;

@Repository
public interface EntrepriseRepositorie extends JpaRepository<EntrepriseEntite	, Long>{

}
