package ru.shop.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PriceProductDto {

    private Long id;

    @Column(name = "id_product")
    private String idProduct;

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
