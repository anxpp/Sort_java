package com.anxpp.sort;

import com.anxpp.sort.base.Sortable;
/**
 * 快速排序
 * @author u
 *
 * 原理：选择一个基准元素，通过一趟扫描，将数据分成大于和不大于基准元素的两部分（分别在基准元素的两边），此时
 *       基准元素就在未来排好后的正确位置，然后递归使用类似的方法处理这个基准元素两边的部分。
 * 既然用了递归，难免在空间上的效率不高...
 * 平均性能通常被认为是最好的
 */
public class quickSort extends Sortable {
	public quickSort(){
		super.LABLE = "快速排序";
	}
	/**
	 * 
	 * @param a 要排序的列表
	 * @param low 左边位置
	 * @param high 右边位置
	 */
	private void sort(int[] a,int low,int high){
		//左
		int l =low;
		//右
		int h = high;
		//基准值
		int k = a[low];
		//判断一趟是否完成
		while(l<h){
			//若顺序正确就比较下一个
			while(l<h&&a[h]>=k)
				h--;
			if(l<h){
				int temp = a[h];
				a[h] = a[l];
				a[l] = temp;
				l++;
			}
			while(l<h&&a[l]<=k)
				l++;
			if(l<h){
				int temp = a[h];
				a[h] = a[l];
				a[l] = temp;
				h--;
			}
		}
		if(l>low) sort(a,low,l-1);
		if(h<high) sort(a,l+1,high);
	}
	@Override
	public void sort(int[] a) {
		sort(a,0,a.length-1);
	}
}
