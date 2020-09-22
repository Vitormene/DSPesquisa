package com.example.projectpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.projectpesquisa.entities.Game;
@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
