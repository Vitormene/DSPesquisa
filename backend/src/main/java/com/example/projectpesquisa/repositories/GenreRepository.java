package com.example.projectpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectpesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
