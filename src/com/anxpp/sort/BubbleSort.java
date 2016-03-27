package com.anxpp.sort;

import com.anxpp.sort.base.Sortable;
/**
 * 最简单的冒泡排序
 * 
 * @author anxpp.com
 * 原理：比较相邻两个元素，从第一对开始比较一直到最后一对，若顺序不对就交换（感觉就像冒泡一样）。
 *       一趟比较后，最大（或最小）的会位于最后的位置，然后再以类似方式比较前面的元素。
 */
public class BubbleSort extends Sortable {
	public BubbleSort(){
		super.LABLE = "冒泡排序";
	}
	@Override
	public void sort(int[] a) {
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(less(a[j+1],a[j])){
					exch(a,j,j+1);
				}
			}
		}
	}
}