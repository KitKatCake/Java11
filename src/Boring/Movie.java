package Boring;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }
    public Movie(String nm,double rt,int yr){
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}
