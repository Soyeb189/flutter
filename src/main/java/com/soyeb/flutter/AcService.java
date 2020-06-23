package com.soyeb.flutter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class AcService {
	
	@Autowired
	private AcRepository repo;
	
	public void save(AcStatment ac) {
		repo.save(ac);

	}

}
