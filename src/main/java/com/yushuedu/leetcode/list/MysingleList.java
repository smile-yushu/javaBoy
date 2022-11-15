package com.yushuedu.leetcode.list;

public class MysingleList {
    class Node {
        Object data;
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node first;
    private int total;

    public void add(Object obj){
        if (first == null) {
            first = new Node(obj,null);
        }else {
            Node node = first;
            while (node.next != null) {
                node= node.next;
            }
            node.next= new Node(obj,null);
        }
        total++;

    }

    public int size(){
        return  total;
    }

    public void remove(Object obj){
        try {
            if (obj == null) {
                if (first.data == null) {
                    //如果第一个结点.data是null，说明要删除的就是第一个结点
                    //此时就将原来链表的第二个结点改为第一个结点，即first结点
                    first = first.next;
                } else {
                    //如果first结点不是要删除的对象
                    //那么此时，我们还需要改变被删除结点的上一个结点.next
                    //这里用left表示被删除结点的上一个结点
                    Node left = first;
                    Node now = first.next;
                    while (now.data != null) {
                        left = now;
                        now = now.next;
                    }
                    left.next = now.next;   //now是要删除的结点
                }
            } else {
                if (obj.equals(first.data)) {
                    first = first.next;
                } else {
                    Node headNode = first;
                    Node nextNode = first.next;
                    while (!obj.equals(nextNode.data)) {
                        headNode = nextNode;
                        nextNode = nextNode.next;
                    }
                    headNode.next = nextNode.next;
                }
            }
            total--;
        }catch (Exception e){
            System.out.println("remove Exception");
        }
    }

    public Object[] toArray(){
        Object[] all=new Object[total];
        Node node = first;
        for (int i = 0; i < all.length; i++) {
            all[i]=node.data;
            node=node.next;
        }
        return all;
    }
}
