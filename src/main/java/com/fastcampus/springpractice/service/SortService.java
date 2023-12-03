package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.JavaSort;
import com.fastcampus.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    private final Sort<String> sort;

    public SortService(@Qualifier("bublesort") Sort<String> sort) {

        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> dosort(List<String> list){
//        위에 생성자 this.sort를 만들어줌으로써 바로 밑의 코드를 사용할 필요가 없다
//        일단 이게 DI레
//        !!오.... 이거 때문에 javasort를 사용하지 않아도 알아서 잘 작동할것이다.
//        아.. 음... 알거같은데 sort라는 인터페이스를 만들고 그안에 상속받은 클래스를 알아서 쓰게한다?
//        Sort<String> sort = new JavaSort<>();

        return sort.sort(list);
    }
}
