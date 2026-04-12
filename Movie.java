package com.wipro.movies_spring;


public class Movie {

    private String movieID;
    private String movieName;
    private String leadActor;
    private String leadActress;
    private String movieDirector;
    private double totalCollection;

    public Movie() {
    }

    public Movie(String movieID, String movieName, String leadActor, String leadActress,
                 String movieDirector, double totalCollection) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
        this.movieDirector = movieDirector;
        this.totalCollection = totalCollection;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getLeadActress() {
        return leadActress;
    }

    public void setLeadActress(String leadActress) {
        this.leadActress = leadActress;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public double getTotalCollection() {
        return totalCollection;
    }

    public void setTotalCollection(double totalCollection) {
        this.totalCollection = totalCollection;
    }
}