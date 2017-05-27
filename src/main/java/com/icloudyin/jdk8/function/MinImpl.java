package com.icloudyin.jdk8.function;


import java.util.Collection;
import java.util.Comparator;

public class MinImpl<T> implements Min<T> {
    @Override
    public T min(Collection<T> collection, Comparator<? super T> comparator) {
            return collection.stream().min(comparator).get();
    }
}
