package com.anxpp.sort;

import com.anxpp.sort.base.Sortable;
/**
 * 优化后的归并排序
 * @author anxpp.com
 *
 */
public class BetterMergeSort extends Sortable {
	public BetterMergeSort(){
		super.LABLE = "归并排序优化";
	}
    int[] temp ;
    private void merge(int[] a, int l, int m, int h){
        for(int i=l;i<=h;i++){
            temp[i]=a[i];
        }
        int i=l;
        int j=m+1;
        for(int k=l;k<=h;k++){
            if(i>m) a[k]=temp[j++];
            else if(j>h) a[k]=temp[i++];
            else if(less(temp[i],temp[j])) a[k]=temp[i++];
            else a[k] = temp[j++];
        }
    }
    private void sort(int[] a,int l,int h) {
        if(l<h){
            int mid = (l+h)/2;
            sort(a,l,mid);
            sort(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    @Override
    public void sort(int[] a) {
        temp = new int[a.length];
        sort(a,0,a.length-1);
    }
}