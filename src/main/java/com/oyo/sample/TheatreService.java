package com.oyo.sample;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TheatreService {

    private List<Theatre> theatres = new ArrayList<>(Arrays.asList(
            new Theatre("theatre1","name1","hyd"),
            new Theatre("theatre2","name2","gkp"),
            new Theatre("theatre3","name3","lko"),
            new Theatre("theatre4","name4","ptn"),
            new Theatre("theatre5","name5","cnb")
    ));

    public List<Theatre> getAllTheatres(){
        return theatres;
    }

    public Theatre getTheatre(String id){
        return theatres.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTheatre(Theatre theatre){
        theatres.add(theatre);
    }

    public void updateTheatre(String id,Theatre theatre){
        for(int i=0;i<theatres.size();i++){
            Theatre t = theatres.get(i);
            if(t.getId().equals(id)){
                theatres.set(i,theatre);
            }
        }
    }

    public void deleteTheatre(String id){
        theatres.removeIf(t -> t.getId().equals(id));
    }
}
