package ru.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shop.Entity.PriceProduct;


/**
 * BasketRepository.
 *
 * @author Rublev_Maksim
 */
@Repository
public interface ProductPriceRepository extends JpaRepository<PriceProduct, Long> {
}
