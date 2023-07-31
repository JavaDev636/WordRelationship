package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entity.Word;

public interface WordRepository extends JpaRepository<Word, Long>{
	List<Word> findAllByRelation(String relation);
	Word findByWord1AndWord2(String word1, String word2);
}
