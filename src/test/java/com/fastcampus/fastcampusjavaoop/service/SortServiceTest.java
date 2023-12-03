package com.fastcampus.fastcampusjavaoop.service;

import com.fastcampus.fastcampusjavaoop.logic.Bublesort;
import com.fastcampus.fastcampusjavaoop.logic.JavaSort;
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