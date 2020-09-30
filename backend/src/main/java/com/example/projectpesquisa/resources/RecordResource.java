package com.example.projectpesquisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectpesquisa.dto.RecordDTO;
import com.example.projectpesquisa.dto.RecordInsertDTO;
import com.example.projectpesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/games")
public class RecordResource {
	
	@Autowired
	private RecordService service;
		
	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
		RecordDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
		
	}	

}