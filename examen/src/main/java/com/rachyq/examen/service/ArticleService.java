package com.rachyq.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rachyq.examen.IDao.IDao;
import com.rachyq.examen.entities.Article;
import com.rachyq.examen.repositories.ArticleRepository;





@Service
public class ArticleService implements IDao<Article> {
	@Autowired
	private ArticleRepository repository;

	@Override
	public Article create(Article o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Article o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Article update(Article o) {
		return repository.save(o);
	}

	@Override
	public Article findById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Article> findAll() {
		return repository.findAll();
	}
	
	
}
