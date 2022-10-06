package review.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import review.travel.model.Place;
import review.travel.repository.PlaceRepository;

import java.util.List;

@Service
public class PlaceService {
    @Autowired
    private PlaceRepository placesRepository;

    public List<Place> findAll(){
        return placesRepository.findAll();
    }
}
