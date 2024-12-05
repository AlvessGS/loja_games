package com.games.lojagames.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.games.lojagames.model.Jogos;

public interface JogosRepository extends JpaRepository<Jogos, Long>{

	public List <Jogos> findAllByNomeContainingIgnoreCase(@Param("nome") String titulo);
	
}
