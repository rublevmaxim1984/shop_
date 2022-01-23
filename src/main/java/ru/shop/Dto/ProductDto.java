package ru.shop.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ProductDto {

    private Long id;

    /**
     * Название продукта.
     */
    private String nameProduct;

    /**
     * Фото.
     */
    private String photo;

    /**
     * Характеристики. Описание товара
     */
    private String specifications;
}
