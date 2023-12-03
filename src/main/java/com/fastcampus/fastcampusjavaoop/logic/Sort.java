package com.fastcampus.fastcampusjavaoop.logic;

import java.util.Collections;
import java.util.List;

public interface Sort <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
