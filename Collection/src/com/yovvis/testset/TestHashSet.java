package com.yovvis.testset;

/**
 * 模拟HashSet底层
 *
 * @author yovvis
 */
public class TestHashSet {
    public static void main(String[] args) {
        // 模拟HashSet底层 数组+链表+红黑树

        // 1、定义存放node的数组
        Node[] table = new Node[16];
        // 2、创建结点
        Node join = new Node("join", null);

        table[2] = join;

        Node jack = new Node("jack", null);
        // 将jack挂载到join
        join.next = jack;
        Node rose = new Node("rose",null);
        // 将rose挂载到jack
        jack.next = rose;

        Node rucy = new Node("rucy", null);
        table[3] = rucy;
        System.out.println(table);
    }
}

class Node {
    // 结点 存储数据，可以指向下一个结点，从而形成链表
    Object item; // 存放数据
    Node next; // 定义了指针

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
