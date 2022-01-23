package ru.shop.Service;


import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.shop.Dto.CustomerDto;
import ru.shop.Entity.Customer;
import ru.shop.Repository.CustomerRepository;
import ru.shop.Utils.GenericPage;
import ru.shop.mapper.CustomerMapper;

import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;

/**
 * Working implementation of {@link CustomerService}.
 *
 * @author Rublev_Maksim
 */
@Builder
@RequiredArgsConstructor
@Service
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper mapper;

    /**
     * Get Customers page.
     *
     * @return page by criteria
     */
    public GenericPage<CustomerDto> getPage(Pageable pageable) {
        Page<Customer> page = customerRepository.findAll(pageable);
        List<CustomerDto> result = Optional.of(page.getContent())
                .map(mapper::toListDto)
                .orElse(emptyList());

        return new GenericPage<>(result, page.getTotalElements());
    }


}
