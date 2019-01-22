package Sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable String id){
        return movieService.getMovie(id);
    }

    @PostMapping("/movies")
    public void addMovie(@RequestBody Movie movie){
         movieService.addMovie(movie);
    }

    @PutMapping("/movies/{id}")
    public void updateMovie(@RequestBody Movie movie, @PathVariable String id){
        movieService.updateMovie(id,movie);
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@PathVariable String id){
        movieService.deleteMovie(id);
    }
}
