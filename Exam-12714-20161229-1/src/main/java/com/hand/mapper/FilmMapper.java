package com.hand.mapper;

import org.springframework.stereotype.Component;

import com.hand.bean.Film;

/**
 * 
 * @author violet
 *
 */
@Component
public interface FilmMapper {
	public int addFilm(Film film);
}
