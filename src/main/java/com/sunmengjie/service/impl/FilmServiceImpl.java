package com.sunmengjie.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunmengjie.entity.Film;
import com.sunmengjie.mapper.FilmMapper;
import com.sunmengjie.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmMapper mapper;

	@Override
	public List<Film> list() {
		// TODO Auto-generated method stub
		return mapper.list();
	}

	@Override
	public void add(Film f) {
		mapper.add(f);
		
	}

	@Override
	public void updSta(int state, int id) {
		mapper.updSta(state,id);
		
	}
	
}
