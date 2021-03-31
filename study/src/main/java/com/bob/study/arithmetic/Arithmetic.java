package com.bob.study.arithmetic;

import com.bob.study.arithmetic.vo.ListNode;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MODA-Master
 * @Title: Arithmetic
 * @ProjectName Study-Arithmetic
 * @Description: TODO  力扣算法练习
 * @date 2021/3/31 11:04
 */
public class Arithmetic {
    /**
     *  1.两数求和
     *
     *  给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *
     * 你可以按任意顺序返回答案。
     *
     */
    @Test
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        //给出默认值避免HashMap扩容机制
        Map<Integer, Integer> hashMap = new HashMap<>(len-1);
        //第一个元素不需要去map中做匹配 所以直接存入
        hashMap.put(nums[0],0);
        for (int i = 1; i < len; i++) {
            int difference = target-nums[i];
            // 判断 target-num[i] 在hashMap中是否存在
            if(hashMap.containsKey(difference)){
                return new int[]{i,difference};
            }
            hashMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     *  2.两数相加
     *
     *  给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
     *
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     *
     * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     */
    @Test
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

           return null;
    }
}
