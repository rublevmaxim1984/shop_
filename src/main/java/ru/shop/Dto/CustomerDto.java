package ru.shop.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CustomerDto {

    private Long id;

    /**
     * Наименование покупателя.(ФИО, название юр. лица)
     */
    private String nameCustomer;

    /**
     * Почта покупателя.
     */
    private String email;

    /**
     * Адрес покупателя.
     */
    private String address;

}
