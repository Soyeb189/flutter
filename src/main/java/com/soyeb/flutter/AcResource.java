package com.soyeb.flutter;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AcResource {
	@Autowired
	private AcRepository acRepo;
	@Autowired
	private AcService acService;
	
	@PostMapping("/createStatment")
	public HashMap<String, String> saveStatment(@ModelAttribute("acstat") AcStatment ac){
		acService.save(ac);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Status", "Success");
		map.put("Code", "1");
		return map;
		
	}
	
	@GetMapping("/ac_statments")
	public List<AcStatment> retriveAllStat(){
		return acRepo.findAll();
	}
}
