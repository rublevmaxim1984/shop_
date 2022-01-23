package ru.shop.Entity;

import javax.persistence.*;

@Entity
@Table(name="sh_customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_customer", unique = true, nullable = false)
    private String nameCustomer;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

}
