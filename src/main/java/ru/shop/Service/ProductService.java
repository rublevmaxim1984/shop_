package ru.shop.Service;


import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.shop.Dto.ProductDto;
import ru.shop.Entity.Product;
import ru.shop.Repository.ProductPriceRepository;
import ru.shop.Repository.ProductRepository;
import ru.shop.Utils.GenericPage;
import ru.shop.mapper.ProductMapper;
import ru.shop.mapper.ProductPriceMapper;

import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;

/**
 * Working implementation of {@link ProductService}.
 *
 * @author Rublev_Maksim
 */
@Builder
@RequiredArgsConstructor
@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductPriceRepository productPriceRepository;
    private final ProductMapper productMapper;
    private final ProductPriceMapper productPriceMapper;

    /**
     * Get products page.
     *
     * @return page by criteria
     */
    public GenericPage<ProductDto> getPage(Pageable pageable) {
        Page<Product> page = productRepository.findAll(pageable);
        List<ProductDto> result = Optional.of(page.getContent())
                .map(productMapper::toListDto)
                .orElse(emptyList());
        return new GenericPage<>(result, page.getTotalElements());
    }


}

