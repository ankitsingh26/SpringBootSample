package com.oyo.sample;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movies = new ArrayList<>(Arrays.asList(
            new Movie("movie1","name1","2009"),
            new Movie("movie2","name2","2011"),
            new Movie("movie3","name3","2016"),
            new Movie("movie4","name4","2019")

    ));

    public List<Movie> getAllMovies(){
        return movies;
    }

    public Movie getMovie(String id){
        return movies.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void updateMovie(String id,Movie movie){
        for(int i=0;i<movies.size();i++){
            Movie m = movies.get(i);
            if(m.getId().equals(id))
                movies.set(i,movie);
        }
    }

    public void deleteMovie(String id){
        movies.removeIf(t -> t.getId().equals(id));
    }
}
