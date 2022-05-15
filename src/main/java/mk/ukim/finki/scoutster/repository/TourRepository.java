package mk.ukim.finki.scoutster.repository;

import mk.ukim.finki.scoutster.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TourRepository extends JpaRepository<Tour,Long> {
    Optional<Tour> findByName(String name);
    void deleteByName(String name);



   List<Tour> findAllByNameContaining(String name);

}
