package ru.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shop.Entity.Product;

import java.util.List;


/**
 * BasketRepository.
 *
 * @author Rublev_Maksim
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //@Query(value = "select "
     //       + "count(l.id) as count "
     //       + "from sh_product l "
     //       + "where l.id in (:ids)"
   // )
   // TotalAmount sumTotalAmount(@Param("ids") Set<Long> ids);

    List<Product> findAll();




}
