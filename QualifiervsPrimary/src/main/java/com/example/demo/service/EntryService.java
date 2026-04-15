package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.Play;

@Service
public class EntryService {
	
	
	
	Play p;
	
//	@Autowired
//	EntryService(@Qualifier("A") Play p){
//		this.p=p;
//	}
	
	
	@Autowired
	public void setP(@Qualifier("B") Play p) {
		this.p = p;
	}
	
	
	
	public void playCricket() {
		p.playCricket();
	}

	

}
