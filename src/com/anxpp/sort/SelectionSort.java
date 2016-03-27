package com.anxpp.sort;

import com.anxpp.sort.base.Sortable;
/**
 * 选择排序
 * @author anxpp.com
 *
 */
public class SelectionSort extends Sortable {
	public SelectionSort(){
		super.LABLE = "选择排序";
	}
    @Override
	public void sort(int[] a) {
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(less(a[j],a[min])){
                    min = j;
                }
            }
            exch(a,i,min);
        }
    }
}