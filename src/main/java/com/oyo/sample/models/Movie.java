package com.oyo.sample.models;

public class Movie {

    private String id;
    private String name;
    private String rYear;

    public Movie(){

    }

    public Movie(String id,String name,String rYear){
        super();
        this.id=id;
        this.name=name;
        this.rYear=rYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getrYear() {
        return rYear;
    }

    public void setrYear(String rYear) {
        this.rYear = rYear;
    }
}
