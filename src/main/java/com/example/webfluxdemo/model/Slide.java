package com.example.webfluxdemo.model;

import java.util.ArrayList;

public class Slide {

        public String title;
        public String type;
        public ArrayList<String> items;

    public Slide(){

    }
    public Slide(String title, String type, ArrayList<String> items) {
        this.title = title;
        this.type = type;
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Slide{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", items=" + items +
                '}';
    }
}
