package ru.shop.resource.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.shop.Dto.ProductDto;
import ru.shop.Service.ProductService;
import ru.shop.Utils.GenericPage;
import ru.shop.resource.ProductResource;

import javax.transaction.Transactional;

import static org.springframework.http.ResponseEntity.ok;


/**
 * Implementation of {@link ProductResource}.
 *
 * @author Rublev_Maksim
 */
@Slf4j
@Transactional
@RestController
//@EnableResourceServer
@RequiredArgsConstructor
public class ProductResourceImpl implements ProductResource {
    private final ProductService productService;

    @Override
    public ResponseEntity<GenericPage<ProductDto>> getPage(Pageable pageable) {
        return ok(productService.getPage((org.springframework.data.domain.Pageable) pageable));
    }
}
