/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2018 VTB Group. All rights reserved.
 */

package ru.shop.Utils;


import java.math.BigDecimal;

/**
 * Projection for Product.
 *
 * @author Rublev_Maksim
 */
public interface TotalAmount {

    Long getCount();

    BigDecimal getSum();

    void setCount(Long count);

    void setSum(BigDecimal sum);
}
