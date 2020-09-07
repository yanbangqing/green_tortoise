package com.lemmon.hunter.structure;

/**
 * @author yanbangqing
 * @version V1.0
 * @Description
 * @date 2020/9/7 10:58 下午
 */
public class Node {
    Object data;
    Node next;
    public Node head;

    public Node(Object obj){
        this.data = obj;
    }

    public void insert(Object data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

}
