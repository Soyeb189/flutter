package com.soyeb.flutter.foundTransfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FoundService {
	@Autowired
	private FoundRepository repo;
	
	public List<FoundMenu> findAllFoundMenu(){
		return repo.findAll();
	}
	
	public void saveFoundMenu(FoundMenu menu) {
		repo.save(menu);
	}

}
