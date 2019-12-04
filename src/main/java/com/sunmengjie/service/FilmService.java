package com.sunmengjie.service;

import java.util.List;


import com.sunmengjie.entity.Film;

public interface FilmService {

	List<Film> list();

	void add(Film f);

	void updSta(int state, int id);

}
