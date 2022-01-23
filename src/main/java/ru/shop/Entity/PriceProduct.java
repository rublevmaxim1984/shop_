package ru.shop.Entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="sh_price_product")
public class PriceProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_product")
    private Product product;

    /**
     * Дата установления новой цены заказа.
     */
    @Column(name = "date_price")
    @Temporal(TemporalType.DATE)
    private Date datePrice;

    @Column(
            name = "price",
            precision = 19,
            scale = 2
    )
    private BigDecimal price;
}
