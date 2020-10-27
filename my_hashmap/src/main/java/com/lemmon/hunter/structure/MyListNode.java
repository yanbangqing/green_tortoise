package com.lemmon.hunter.structure;

/**
 * @author yanbangqing
 * @version V1.0
 * @Description
 * @date 2020/9/9 10:19 下午
 */
public class MyListNode {
    int size;
    Node head;

    public MyListNode(){
        size = 1;
        this.head = new Node("head");
    }

    public void add(Node node){
        addByIndex(size,node);
    }

    public void addByIndex(int index,Node node){
        if(index > size) return;
        if(index < size) index = 0;
        Node pre = head;
        for(int i = 0;i < index;i++) {
            if(pre.next == null){
                pre.next = node;
            }else{
                pre = pre.next;
                if( i == index -1 ){
                    node.next = pre.next;
                    pre.next = node;
                }
            }
        }
        ++size;
    }
}
