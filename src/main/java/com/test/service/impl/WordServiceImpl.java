package com.test.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.WordDto;
import com.test.entity.Word;
import com.test.repository.WordRepository;
import com.test.service.WordService;

@Service
public class WordServiceImpl implements WordService{

	@Autowired
	private WordRepository wordRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public WordDto saveWord(WordDto wordDto) {
		Word word = modelMapper.map(wordDto, Word.class);
		Word savedWord = wordRepository.save(word);
		WordDto savedWordDto = modelMapper.map(savedWord, WordDto.class);
		return savedWordDto;
	}

	@Override
	public List<WordDto> getWords() {
		List<Word> words = wordRepository.findAll();
	        List<WordDto> wordDtos = words.stream().map(word -> modelMapper.map(word, WordDto.class)).collect(Collectors.toList());
	        return wordDtos;
	}

	@Override
	public List<WordDto> getWords(String relation) {
		List<Word> words = wordRepository.findAllByRelation(relation);
        List<WordDto> wordDtos = words.stream().map(word -> modelMapper.map(word, WordDto.class)).collect(Collectors.toList());
        return wordDtos;
	}
	
	
}
