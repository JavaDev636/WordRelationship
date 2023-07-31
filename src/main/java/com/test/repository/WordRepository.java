package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Word;

public interface WordRepository extends JpaRepository<Word, Long>{

}
