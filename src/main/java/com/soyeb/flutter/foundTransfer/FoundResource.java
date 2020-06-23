package com.soyeb.flutter.foundTransfer;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoundResource {
	
	@Autowired
	FoundRepository foundRepository;
	@Autowired
	FoundService foundService;
	
	@GetMapping("/foundMenu")
	public List<FoundMenu> retriveFoundMenu(){
		return foundRepository.findAll();
	}
	
	@PostMapping("/createFoundMenu")
	public HashMap<String, String> saveFoundMenu(@ModelAttribute("foundMenu") FoundMenu foundMenu){
		foundService.saveFoundMenu(foundMenu);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Status", "Success");
		map.put("Code", "1");
		return map;
	}
	
}
