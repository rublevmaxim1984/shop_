package ru.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shop.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}