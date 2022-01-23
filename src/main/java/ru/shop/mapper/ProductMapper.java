package ru.shop.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import ru.shop.Dto.ProductDto;
import ru.shop.Entity.Product;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static ru.shop.Utils.Utils.SPRING;

/**
 * Mapper for Product.
 *
 * @author Rublev_Maksim
 */
@Mapper(componentModel = SPRING, builder = @Builder(disableBuilder = true))
public interface ProductMapper {

    ProductDto toDto(Product value);
    Product toModel(ProductDto value);

    @AfterMapping
    default List<ProductDto> toListDto(List<Product> products) {
        if (products.isEmpty()) {
            return emptyList();
        }
        return products.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @AfterMapping
    default List<Product> toList(List<ProductDto> productDto) {
        if (productDto.isEmpty()) {
            return emptyList();
        }
        return productDto.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
}


