package com.example.webfluxdemo.model;

public class Object {

    public Slideshow slideshow;

    public Object(){

    }

    public Object(Slideshow slideshow) {
        this.slideshow = slideshow;
    }

    public Slideshow getSlideshow() {
        return slideshow;
    }

    public void setSlideshow(Slideshow slideshow) {
        this.slideshow = slideshow;
    }

    @Override
    public String toString() {
        return "Object{" +
                "slideshow=" + slideshow +
                '}';
    }
}



