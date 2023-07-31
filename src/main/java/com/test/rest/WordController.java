package com.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dto.WordDto;
import com.test.service.WordService;
							
@RestController
@RequestMapping("/word")
public class WordController {

	@Autowired
	private WordService wordService;
	
	@PostMapping()
	public WordDto saveWord(@RequestBody WordDto wordDto) {
		return wordService.saveWord(wordDto);
	}
}
