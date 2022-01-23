package ru.shop.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import ru.shop.Dto.PriceProductDto;
import ru.shop.Entity.PriceProduct;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static ru.shop.Utils.Utils.SPRING;

/**
 * Mapper for PriceProduct.
 *
 * @author Rublev_Maksim
 */
@Mapper(componentModel = SPRING, builder = @Builder(disableBuilder = true))
public interface ProductPriceMapper {

    PriceProductDto toDto(PriceProduct value);

    PriceProduct toModel(PriceProductDto value);

    @AfterMapping
    default List<PriceProductDto> toListDto(List<PriceProduct> PriceProducts) {
        if (PriceProducts.isEmpty()) {
            return emptyList();
        }
        return PriceProducts.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @AfterMapping
    default List<PriceProduct> toList(List<PriceProductDto> PriceProductDto) {
        if (PriceProductDto.isEmpty()) {
            return emptyList();
        }
        return PriceProductDto.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }


}


