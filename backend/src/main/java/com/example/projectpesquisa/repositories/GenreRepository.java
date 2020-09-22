package com.example.projectpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectpesquisa.entities.Genre;
@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
