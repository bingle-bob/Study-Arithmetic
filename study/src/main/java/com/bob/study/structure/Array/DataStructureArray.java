package com.bob.study.structure.Array;

/**
 * @author MODA-Master
 * @Title: DataStructureArray
 * @ProjectName Study
 * @Description: TODO  数组:把数组码成一排进行存放
 * @date 2020/8/24 16:37
 */
public class DataStructureArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;


        int[] scores = new int[]{100,99,66};
        for (int i = 0; i < scores.length; i++)
        System.out.println(scores[i]);


        for(int score:scores){
            System.out.println(score);
        }
    }
    /**
     * 数据优点-快速查询 可以利用索引的语意
     * TODO 自定义数组类
     *
     */


}
