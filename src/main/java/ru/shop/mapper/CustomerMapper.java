package ru.shop.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import ru.shop.Dto.CustomerDto;
import ru.shop.Entity.Customer;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static ru.shop.Utils.Utils.SPRING;

/**
 * Mapper for Customer.
 *
 * @author Rublev_Maksim
 */
@Mapper(componentModel = SPRING, builder = @Builder(disableBuilder = true))
public interface CustomerMapper {

    CustomerDto toDto(Customer value);

    Customer toModel(CustomerDto value);

    @AfterMapping
    default List<CustomerDto> toListDto(List<Customer> Customers) {
        if (Customers.isEmpty()) {
            return emptyList();
        }
        return Customers.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @AfterMapping
    default List<Customer> toList(List<CustomerDto> CustomerDto) {
        if (CustomerDto.isEmpty()) {
            return emptyList();
        }
        return CustomerDto.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }


}


