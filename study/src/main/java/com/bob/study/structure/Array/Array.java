package com.bob.study.structure.Array;


/**
 * @author MODA-Master
 * @Title: Array
 * @ProjectName Study
 * @Description: TODO  自定义数组
 * @date 2020/8/24 17:35
 */
public class Array {

    private int[] data;
    private int size;

    //构造函数
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    //无参构造函数,默认数组大小为capacity=10
    public Array() {
        this(10);
    }

    //获取数组中的元素个数
    public int getSize() {
        return size;
    }

    //获取数组容量
    public int getCapacity() {
        return data.length;
    }

    //返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //向所有元素的最后添加一个新元素
    public void addList(int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("AddLast failed.Array is full.");
        }
        data[size] = e;
        size++;
    }

    //在第index个位置插入一个新元素 e
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("AddLast failed.Array is full.");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("AddLast failed.Array is full.");
        }
        for (int i = size-1; i >=index ; i--) {
               data[i+1] = data[i];
        }
    }
}
