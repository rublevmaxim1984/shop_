package ru.shop.Service;


import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.shop.Dto.BasketDto;
import ru.shop.Entity.Basket;
import ru.shop.Repository.BasketRepository;
import ru.shop.Utils.GenericPage;
import ru.shop.mapper.BasketMapper;

import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;

/**
 * Working implementation of {@link BasketService}.
 *
 * @author Rublev_Maksim
 */
@Builder
@RequiredArgsConstructor
@Service
@Slf4j
public class BasketService {
    private final BasketRepository basketRepository;
    private final BasketMapper mapper;

    /**
     * Get Baskets page.
     *
     * @return page by criteria
     */
    public GenericPage<BasketDto> getPage(Pageable pageable) {
        Page<Basket> page = basketRepository.findAll(pageable);
        List<BasketDto> result = Optional.of(page.getContent())
                .map(mapper::toListDto)
                .orElse(emptyList());

        return new GenericPage<>(result, page.getTotalElements());
    }


}
