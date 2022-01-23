package ru.shop.Entity;

import javax.persistence.*;
import java.util.Date;

import static java.lang.Boolean.FALSE;

@Entity
@Table(name="sh_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date_order")
    @Temporal(TemporalType.DATE)
    private Date dateOrder;

    @Column(name = "id_customer", unique = true, nullable = false)
    private Long idCustomer;

    /**
     * Статус доставки. Доставка/Самовывоз
     */
    @Column(name = "delivery")
    private Boolean delivery = FALSE;

    /**
     * Дата выполнения заказа. Если null, то заказ пока не выполнен
     */
    @Column(name = "order_completion_date")
    @Temporal(TemporalType.DATE)
    private Date orderCompletionDate;
}
