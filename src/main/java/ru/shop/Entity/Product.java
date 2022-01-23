package ru.shop.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sh_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_product", unique = true, nullable = false)
    private String nameProduct;

    /**
     * Фото.
     */
    @Column(name = "photo")
    private String photo;

    /**
     * Характеристики. Описание товара
     */
    @Column(name = "specifications")
    private String specifications;
}
