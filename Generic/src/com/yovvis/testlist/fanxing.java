package com.yovvis.testlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author
 */
public class fanxing {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        C<A> c = new C<A>(new A());
    }
}

class A {

}

class B {

}

class C<E> {
    E p;

    C(E p) {
        this.p = p;
    }
}

interface X<U, R> {
    U u();

    R r();
}

class Demo<E, L> {
    void AA() {
    }

     <T, R> void A(T t, R r) {
    }
}
