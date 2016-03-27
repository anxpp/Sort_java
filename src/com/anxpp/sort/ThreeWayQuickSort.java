package com.anxpp.sort;

import com.anxpp.sort.base.Sortable;
/**
 * 三向切分快速排序（优化的快速排序）
 * @author anxpp.com
 *
 */
public class ThreeWayQuickSort extends Sortable{
	public ThreeWayQuickSort(){
		super.LABLE = "三向切分快速排序";
	}
	public void sort(int[] a,int l ,int h) {
        if(l>=h) return;
        int v = a[l];
        int i=l;
        int lv=l;
        int gh=h;
        while(i<=gh){
            int cmpIndex = compare(a[i],v);
            if(cmpIndex<0) exch(a,i++,lv++);
            else if(cmpIndex>0) exch(a,i,gh--);
            else i++;
        }
        sort(a,l,lv-1);
        sort(a,gh+1,h);
    }
    @Override
    public void sort(int[] a) {
        sort(a,0,a.length-1);
    }
}
