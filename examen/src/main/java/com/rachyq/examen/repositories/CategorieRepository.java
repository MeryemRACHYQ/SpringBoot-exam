package com.rachyq.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rachyq.examen.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
