package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Word;

public interface WordRepository extends JpaRepository<Word, Long>{
	List<Word> findAllByRelation(String relation);
}
