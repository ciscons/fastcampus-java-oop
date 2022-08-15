package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<Integer> sort = new BubbleSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList()));
    }
}
