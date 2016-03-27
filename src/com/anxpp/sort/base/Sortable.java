package com.anxpp.sort.base;

public abstract class Sortable {
	protected String LABLE="排序算法";
	//比较两个数（使用了Integer中sort的源码）
	protected int compare(int x, int y) {
		return (x < y) ? -1 : ((x == y) ? 0 : 1);
	}
	//同上，不过返回改为bool
	protected boolean less(int x,int y){
		return compare(x,y) <0;
	}
	//交换数组中的两个值
	protected void exch(int[] a,int i,int j){
		Integer temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	//子类需要实现的排序算法
	public abstract void sort(int[] a);
	public String getLABLE() {
		return LABLE;
	}
}
