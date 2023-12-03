package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.Bublesort;
import com.fastcampus.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new Bublesort<>());
    @Test
    void test(){
//        Gvien

//        When
        List<String> actual = sut.dosort(List.of("3","2","1"));

//        Then
        assertEquals(List.of("1","2","3"),actual);
    }

}