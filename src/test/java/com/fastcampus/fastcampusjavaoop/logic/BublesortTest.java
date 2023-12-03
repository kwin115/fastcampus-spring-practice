package com.fastcampus.fastcampusjavaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BublesortTest {

    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    void given_List_whenExecuting_ThenReturnsortedList() {
//      given
        Bublesort<Integer> bublesort = new Bublesort<>();

//        when
        List<Integer> actual = bublesort.sort(List.of(3,2,4,5,1));

//        Then
        assertEquals(List.of(1,2,3,4,5), actual);
    }
}