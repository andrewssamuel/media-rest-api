package com.mediaarts.rest.models;


import javax.persistence.*;

/**
 * Created by andrewssamuel on 5/5/16.
 */

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieID;
    private String movieName;

    public Movie() {
    }

    public Movie(String movieName) {
        this.movieName = movieName;
    }


    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
