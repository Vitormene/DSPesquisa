package com.example.projectpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectpesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
