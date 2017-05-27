package com.icloudyin.jdk8.function;

import java.util.Collection;
import java.util.Comparator;

@FunctionalInterface
public interface Min<T> {

    T min(Collection<T> collection, Comparator<? super T> comparator) ;

}
