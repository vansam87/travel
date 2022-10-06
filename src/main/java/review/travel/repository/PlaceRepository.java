package review.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import review.travel.model.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place,Long> {

}
