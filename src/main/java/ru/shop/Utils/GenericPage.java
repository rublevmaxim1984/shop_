/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2018 VTB Group. All rights reserved.
 */

package ru.shop.Utils;

import static java.util.Collections.emptyList;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * Page wrapper.
 *
 * @param <T> type of inner objects.
 *
 * @author Rublev_Maksim
 */
@Getter
@Setter
@Accessors(chain = true)
public class GenericPage<T> {

    private final List<T> data;
    private final long total;

    @SuppressWarnings("unused")
    public GenericPage() {
        this(emptyList(), 0);
    }

    public GenericPage(List<T> data, long total) {
        this.data = new ArrayList<>(data);
        this.total = total;
    }
}

