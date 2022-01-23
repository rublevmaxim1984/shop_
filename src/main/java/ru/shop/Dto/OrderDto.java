package ru.shop.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

import static java.lang.Boolean.FALSE;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OrderDto {

    private Long id;

    /**
     * Дата доставки.
     */
    private Date dateOrder;

    private Long idCustomer;

    /**
     * Статус доставки. Доставка/Самовывоз
     */
    private Boolean delivery = FALSE;

    /**
     * Дата выполнения заказа. Если null, то заказ пока не выполнен
     */
    private Date orderCompletionDate;
}
