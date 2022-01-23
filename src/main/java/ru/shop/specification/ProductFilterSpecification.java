/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2019 VTB Group. All rights reserved.
 */

package ru.shop.specification;

/* import org.springframework.data.jpa.domain.Specification;
import ru.shop.Entity.Product;

/**
 * Product filter specification.
 *
 * @author Rublev_Maksim
 */
/* public class ProductFilterSpecification extends AbstractFilterSpecification<Product>
        implements Specification<Product> {

   public ProductFilterSpecification(PaymentClaimBankFilterDto filter) {
        super(filter);
        //this.bankActionProperties = bankActionProperties;
        //this.messageHelper = messageHelper;
    }

    @Override
    public Predicate toPredicate(Root<Product> root,
                                 CriteriaQuery<?> query,
                                 CriteriaBuilder cb) {
        List<Predicate> predicates = applyFilters(root, query, cb);

        return cb.and(predicates.toArray(new Predicate[0]));
    }

    @Override
    protected List<Predicate> applyCustomFilters(Root<PaymentClaim> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        List<Predicate> result = new ArrayList<>();

        List<Predicate> groupOrStatus = filterByStatusGroupOrStatus(root, query, cb);
        if (isNotEmpty(groupOrStatus)) {
            result.addAll(groupOrStatus);
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    private List<Predicate> filterByStatusGroupOrStatus(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        List<Predicate> result = new ArrayList<>();

        if (nonNull(getFilter().getStatusGroup())) {
            result.add(new ProductFilterByStatusSpecification(
                    bankActionProperties, getFilter().getStatusGroup()).toPredicate(root, query, cb));
        }

        if (isNotEmpty(getFilter().getStatuses())) {
            List<Predicate> statusesPredicates = filterByStatuses(
                    root,
                    cb,
                    getFilter().getStatuses()
                               .stream()
                               .map(messageHelper::getBankStatus)
                               .collect(toList())
            );
            if (isNotEmpty(statusesPredicates)) {
                result.addAll(statusesPredicates);
            }
        }

        return result;
    }

}*/

