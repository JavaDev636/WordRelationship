package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Word {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String word1;
	private String word2;
	private String relation;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getWord1() {
		return word1;
	}
	public void setWord1(String word1) {
		this.word1 = word1.toLowerCase().trim();
	}
	public String getWord2() {
		return word2;
	}
	public void setWord2(String word2) {
		this.word2 = word2.toLowerCase().trim();
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	

}
