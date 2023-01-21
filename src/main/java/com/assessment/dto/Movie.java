package com.assessment.dto;

public class Movie {

    private String movieName;
    private long movieId;
    private String duration;
    private String description;
    private long upvotes;
    private String imageName;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(long upvotes) {
        this.upvotes = upvotes;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Movie(String movieName, long movieId, String duration, String description, long upvotes, String imageName) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.duration = duration;
        this.description = description;
        this.upvotes = upvotes;
        this.imageName = imageName;
    }
}

