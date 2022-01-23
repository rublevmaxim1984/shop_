package ru.shop.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import ru.shop.Dto.OrderDto;
import ru.shop.Entity.Order;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static ru.shop.Utils.Utils.SPRING;

/**
 * Mapper for Order.
 *
 * @author Rublev_Maksim
 */
@Mapper(componentModel = SPRING, builder = @Builder(disableBuilder = true))
public interface OrderMapper {

    OrderDto toDto(Order value);

    Order toModel(OrderDto value);

    @AfterMapping
    default List<OrderDto> toListDto(List<Order> Orders) {
        if (Orders.isEmpty()) {
            return emptyList();
        }
        return Orders.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @AfterMapping
    default List<Order> toList(List<OrderDto> OrderDto) {
        if (OrderDto.isEmpty()) {
            return emptyList();
        }
        return OrderDto.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }


}


