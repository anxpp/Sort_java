package com.anxpp.sort;

import java.util.Random;
import com.anxpp.sort.base.Sortable;
/**
 * 测试排序算法
 * @author anxpp.com
 *
 */
public class TestSort {
	//需要排序的数字长度为LEN
    private final static int LEN = 30000;
    //最大值为MAX
    private final static int MAX = 99999;
    public static void main(String[] args){
    	//初始化排序算法
    	Sortable[] sortables = {
    			new BubbleSort(),new BetterBubbleSort(),new SelectionSort(),
    			new InsertionSort(),new ShellSort(),new MergeSort(),
    			new BetterMergeSort(),new quickSort(),new ThreeWayQuickSort()};
        //产生源数据
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int[][] a = new int[sortables.length][LEN];
        int i = 0;
        while(i++ < LEN-1){
        	int num = random.nextInt(MAX);
        	int j = 0;
        	while(j<sortables.length)
        		a[j++][i] = num;
        }
        //排序
        for(i = 0;i<sortables.length;i++){
        	System.out.println(sortables[i].getLABLE()+":");
//        	print(a[i]);
//        	sortTime(a[i],sortables[i]);
            System.out.println(sortTime(a[i],sortables[i]));
//        	print(a[i]);
        }
    }
    public static int sortTime(int[] a,Sortable sortable){
        long start = System.currentTimeMillis();
        sortable.sort(a);
        return (int) (System.currentTimeMillis()-start);
    }
    public static void print(int[] a){
        for(int i = 0;i<a.length;i++)
            System.out.print(a[i] + ",");
        System.out.println();
    }
}
