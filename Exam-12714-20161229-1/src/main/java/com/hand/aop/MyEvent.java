package com.hand.aop;

import org.springframework.context.ApplicationEvent;

import com.hand.bean.Film;


public class MyEvent extends ApplicationEvent {
    private Film film;
    public MyEvent(Film film) {
        super(film);
        this.film=film;
    }
}
