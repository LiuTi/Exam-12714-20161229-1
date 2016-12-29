package com.hand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.hand.aop.MyEvent;
import com.hand.bean.Film;
import com.hand.mapper.FilmMapper;
/**
 * 
 * @author violet
 *
 */
@Service
public class FilmService {
	@Autowired
	private FilmMapper filmMapper;
	
	 public int addFilm(Film film){
	        int result=filmMapper.addFilm(film);
	        return result;
	    }
}
