package com.oyo.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @GetMapping("theatres")
    public List<Theatre> getAllTheatres(){
        return theatreService.getAllTheatres();
    }

    @GetMapping("theatres/{id}")
    public Theatre getTheatre(@PathVariable String id){
        System.out.println("-----------------------entered..");
        return theatreService.getTheatre(id);

    }

    @PostMapping("theatres")
    public void addTheatre(@RequestBody Theatre theatre){
        theatreService.addTheatre(theatre);
    }

    @PutMapping("theatres/{id}")
    public void updateTheatre(@RequestBody Theatre theatre,@PathVariable String id){
        theatreService.updateTheatre(id,theatre);
    }

    @DeleteMapping("theatres/{id}")
    public void deleteTheatre(@PathVariable String id){
        System.out.println("-----------------------entered..");
        theatreService.deleteTheatre(id);
    }
}
