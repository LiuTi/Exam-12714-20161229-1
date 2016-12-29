package com.hand.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.bean.Film;
import com.hand.service.FilmService;


/**
 * 业务处理主类
 * @author violet
 *
 */
public class AddFilm {
	 static Scanner scanner=new Scanner(System.in);
	 static ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});
	 public static void main(String[] args) {
		insertFilms();
		
	}
	    public static void insertFilms(){
	            Film film=new Film();
	            System.out.println("请输入电影名称(title):");
	            film.setTitle(scanner.next());
	   		    System.out.println("请输入电影的描述(description):");
	   		    film.setDescription(scanner.next());
	   		    System.out.println("请输入语言ID(language_id):");
	   		    film.setLanguage_id(scanner.nextInt());
	   		 FilmService filmService=(FilmService)applicationContext.getBean("filmService");

	    }
}
