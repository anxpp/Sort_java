package com.anxpp.sort;

import com.anxpp.sort.base.Sortable;
/**
 * 设置标志优化后的冒泡排序
 * @author anxpp.com
 * 
 * 原理：比较相邻两个元素，从第一对开始比较一直到最后一对，若顺序不对就交换（感觉就像冒泡一样）。
 *       一趟比较后，最大（或最小）的会位于最后的位置，然后再以类似方式比较前面的元素。
 * 优化：传统的冒泡排序，总是要比较那么多次，如果在某趟完成后，并无交换表示数据已经有序，所以设置
 *       一个标志，如某趟比较完成后没有发生，则不再继续后面的运算直接返回即可
 * 其他：据说分而治之也能有用到冒泡，这里就不深究了...
 */
public class BetterBubbleSort extends Sortable {
	public BetterBubbleSort(){
		super.LABLE = "冒泡排序优化";
	}
    @Override
    public void sort(int[] a) {
    	boolean didSwap;
        for(int i=0;i<a.length-1;i++){
            didSwap = false;
            for(int j=0;j<a.length-1-i;j++){
                if(less(a[j+1],a[j])){
                    exch(a,j,j+1);
                    didSwap = true;
                }
            }
            if(!didSwap) return ;
        }
    }
}
