package ru.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shop.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}