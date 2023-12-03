package com.fastcampus.fastcampusjavaoop;
import com.fastcampus.fastcampusjavaoop.logic.Bublesort;
import com.fastcampus.fastcampusjavaoop.logic.JavaSort;
import com.fastcampus.fastcampusjavaoop.logic.Sort;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        Bublesort<String> sort = new Bublesort<>();를 javasort로 바꿔야하는데,
//        인터페이스로 하면 밑에처럼 인터페이스 = 구현하고 싶은 구현체로 바꿀 수 있다.
        Sort<String> sort = new JavaSort<>();

        System.out.println("result :" + sort.sort(Arrays.asList(args)));
    }
}
