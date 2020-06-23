package com.soyeb.flutter;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MenuResource {
	@Autowired
	MenuRepository  menuRepository;
	
	@Autowired
	MenuService service;
	
	@GetMapping("/menu")
	public List<Menu> retriveAllMenu(){
		return menuRepository.findAll();
	}
	
	@PostMapping("/createMenu")
	public HashMap<String,String> saveUser(@ModelAttribute("menu") Menu menu) {
		service.save(menu);
		HashMap<String, String> map = new HashMap<>();
	    map.put("Status", "Success");
	    map.put("Code", "1");
	    return map;
	}
	


}
