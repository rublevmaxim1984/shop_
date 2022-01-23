package ru.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shop.Entity.Basket;
import org.springframework.stereotype.Repository;


/**
 * BasketRepository.
 *
 * @author Rublev_Maksim
 */
@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {
}
