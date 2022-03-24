package com.example.webfluxdemo.model;

import java.util.ArrayList;

public class Slideshow {

    public String author;
    public String date;
    public ArrayList<Slide> slides;
    public String title;

    public Slideshow(){

    }

    public Slideshow(String author, String date, ArrayList<Slide> slides, String title) {
        this.author = author;
        this.date = date;
        this.slides = slides;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Slide> getSlides() {
        return slides;
    }

    public void setSlides(ArrayList<Slide> slides) {
        this.slides = slides;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Slideshow{" +
                "author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", slides=" + slides +
                ", title='" + title + '\'' +
                '}';
    }
}
