package com.gestion.entrprise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.entrprise.entites.EmploieEntite;

@Repository
public interface EmployeRepositorie extends JpaRepository<EmploieEntite, Integer>{

}
