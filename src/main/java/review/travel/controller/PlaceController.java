package review.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import review.travel.service.PlaceService;

@RestController
@RequestMapping("/api/place")
public class PlaceController {
    @Autowired
    private PlaceService placesService;

    @GetMapping("/")
    public ResponseEntity<?> allPlace() {
        return ResponseEntity.ok(placesService.findAll());
    }
}
