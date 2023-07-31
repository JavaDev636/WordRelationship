package com.test.service;

import java.util.List;

import com.test.dto.WordDto;

public interface WordService {

	WordDto saveWord(WordDto wordDto);
	
	List<WordDto> getWords();
}
