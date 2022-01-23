package ru.shop.Entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="sh_basket")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_order", unique = true, nullable = false)
    private String idOrder;

    @Column(name = "id_product", unique = true, nullable = false)
    private String idProduct;

    @Column(
            name = "price",
            precision = 19,
            scale = 2
    )
    private BigDecimal price;

    @Column(
            name = "count",
            precision = 19,
            scale = 2
    )
    private BigDecimal count;

    @Column(
            name = "amount",
            precision = 19,
            scale = 2
    )
    private BigDecimal amount;
}
