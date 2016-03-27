package com.anxpp.sort;

import com.anxpp.sort.base.Sortable;
/**
 * 插入排序
 * @author anxpp
 *
 */
public class InsertionSort extends Sortable {
	public InsertionSort(){
		super.LABLE = "插入排序";
	}
    @Override
    public void sort(int[] a) {
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(less(a[j],a[j-1])){
                    exch(a,j,j-1);
                }
                else break;
            }
        }
    }
}