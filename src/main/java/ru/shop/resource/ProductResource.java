package ru.shop.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import ru.shop.Dto.ProductDto;
import ru.shop.Utils.GenericPage;

import org.springframework.data.domain.Pageable;

import static ru.shop.Utils.Utils.PRODUCTS;

/**
 * Resource for work with products.
 *
 * @author Rublev_Maksim
 */
@Api(
        value = "ProductResource",
        tags = "shop"
)
@SwaggerDefinition(
        tags = @Tag(
                name = "shop",
                description = "Resource interface for products actions"
        )
)
public interface ProductResource {
        @GetMapping(
                value = PRODUCTS,
                produces = MediaType.APPLICATION_JSON_UTF8_VALUE
        )
        @ApiOperation("Products list")
        ResponseEntity<GenericPage<ProductDto>> getPage(Pageable pageable);

}