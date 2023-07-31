package com.test.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.dto.WordDto;
import com.test.response.ResponseHandler;
import com.test.service.WordService;
							
@RestController
@RequestMapping("/word")
public class WordController {

	@Autowired
	private WordService wordService;
	
	@PostMapping()
	public ResponseEntity<Object> saveWord(@RequestBody WordDto wordDto) {
		return ResponseHandler.generateResponse("Success", HttpStatus.CREATED, wordService.saveWord(wordDto)) ;
	}
	
	@GetMapping()
	public ResponseEntity<Object>  getWords(@RequestParam(required = false) String relation){
		if(relation != null)
			return ResponseHandler.generateResponse("Success", HttpStatus.OK, wordService.getWords(relation));
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, wordService.getWords());
		
	}
	
	
}
