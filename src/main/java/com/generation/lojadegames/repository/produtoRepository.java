package com.generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Produto;

@Repository
public interface produtoRepository extends JpaRepository <Produto,Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
}