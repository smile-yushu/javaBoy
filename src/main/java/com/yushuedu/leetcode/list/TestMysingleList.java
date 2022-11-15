package com.yushuedu.leetcode.list;



public class TestMysingleList {
    public static void main(String[] args) {
        //1.创建链表
        MysingleList my = new MysingleList();
        //2.添加元素
        my.add(1111);
        my.add("xiaomu");
        my.add(123.566);
        //3.打印元素个数
        System.out.println("元素总数："+my.size());
        //4.遍历元素
        Object[] array=my.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();

        //5.删除元素
        my.remove(1111);
        //6.遍历元素
        array=my.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();

        //7.删除元素
        my.remove(1555);
        //8.遍历元素
        array=my.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}


