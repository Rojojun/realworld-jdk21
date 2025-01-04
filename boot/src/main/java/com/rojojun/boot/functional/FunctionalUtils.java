package com.rojojun.boot.functional;

import com.rojojun.realworlddata.common.BaseEntity;
import org.springframework.stereotype.Component;

@Component
public class FunctionalUtils<T, R> {
    public Long getId(T t) {
        if (t instanceof BaseEntity) {
            return ((BaseEntity) t).getId();
        }
        throw new ClassCastException("getId() called on BaseEntity");
    }
}
