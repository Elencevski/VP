package mk.ukim.finki.scoutster.repository;

import mk.ukim.finki.scoutster.model.ShoppingCart;
import mk.ukim.finki.scoutster.model.Tour;
import mk.ukim.finki.scoutster.model.User;
import mk.ukim.finki.scoutster.model.enumerations.ShoppingCartStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

    Optional<ShoppingCart> findByUserAndStatus(User user, ShoppingCartStatus status);

}
