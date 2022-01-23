package ru.shop.Service;


import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.shop.Dto.OrderDto;
import ru.shop.Entity.Order;
import ru.shop.Repository.OrderRepository;
import ru.shop.Utils.GenericPage;
import ru.shop.mapper.OrderMapper;

import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;

/**
 * Working implementation of {@link OrderService}.
 *
 * @author Rublev_Maksim
 */
@Builder
@RequiredArgsConstructor
@Service
@Slf4j
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper mapper;


    /**
     * Get Orders page.
     *
     * @return page by criteria
     */
    public GenericPage<OrderDto> getPage(Pageable pageable) {
        Page<Order> page = orderRepository.findAll(pageable);
        List<OrderDto> result = Optional.of(page.getContent())
                .map(mapper::toListDto)
                .orElse(emptyList());

        return new GenericPage<>(result, page.getTotalElements());
    }


}
