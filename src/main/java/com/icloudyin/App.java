package com.icloudyin;

import com.icloudyin.jdk8.function.MinImpl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        MinImpl<Integer> integerMin = new MinImpl<>();

        List<Integer> ages = Arrays.asList(4,2,3,1,-23,0);


        Integer  min = integerMin.min(ages,Comparator.naturalOrder());

        System.out.println("Min value is:" + min);

    }
}
