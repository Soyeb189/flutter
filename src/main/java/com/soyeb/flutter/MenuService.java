package com.soyeb.flutter;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MenuService {
	@Autowired
	private MenuRepository repo;
	
	public List<Menu> findAllMenu(){
		return repo.findAll();
	}
	
	public void save(Menu menu) {
		repo.save(menu);
	}

}
