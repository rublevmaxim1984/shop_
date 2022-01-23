package ru.shop.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class BasketDto {

    private Long id;

    private String idOrder;

    private String idProduct;

    /**
     * Цена товара в заказе.
     */
    private BigDecimal price;

    /**
     * Количество товара в заказе.
     */
    private BigDecimal count;

    /**
     * Общая стоимость конкретного товара в заказе.
     */
    private BigDecimal amount;
}
