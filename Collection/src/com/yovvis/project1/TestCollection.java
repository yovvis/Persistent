package com.yovvis.project1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 描述
 *
 * @author
 */
public class TestCollection {

    public static void main(String[] args) {
        // 无参构造器的List
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 10; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
