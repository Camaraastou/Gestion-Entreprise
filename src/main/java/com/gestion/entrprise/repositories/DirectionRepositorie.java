package com.gestion.entrprise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.entrprise.entites.DirectionEntite;

@Repository
public interface DirectionRepositorie extends JpaRepository<DirectionEntite, Long> {

}
