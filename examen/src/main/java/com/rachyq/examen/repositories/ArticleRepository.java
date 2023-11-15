package com.rachyq.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rachyq.examen.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
