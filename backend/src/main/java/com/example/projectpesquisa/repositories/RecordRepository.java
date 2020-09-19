package com.example.projectpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectpesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
