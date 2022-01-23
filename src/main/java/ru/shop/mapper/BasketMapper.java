package ru.shop.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import ru.shop.Dto.BasketDto;
import ru.shop.Entity.Basket;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static ru.shop.Utils.Utils.SPRING;

/**
 * Mapper for Basket.
 *
 * @author Rublev_Maksim
 */
@Mapper(componentModel = SPRING, builder = @Builder(disableBuilder = true))
public interface BasketMapper {

    BasketDto toDto(Basket value);
    Basket toModel(BasketDto value);

    @AfterMapping
    default List<BasketDto> toListDto(List<Basket> basket) {
        if (basket.isEmpty()) {
            return emptyList();
        }
        return basket.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @AfterMapping
    default List<Basket> toList(List<BasketDto> basketDto) {
        if (basketDto.isEmpty()) {
            return emptyList();
        }
        return basketDto.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

}


