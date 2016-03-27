package com.anxpp.sort;

import com.anxpp.sort.base.Sortable;
/**
 * 希尔排序
 * @author anxpp.com
 *
 */
public class ShellSort extends Sortable {
	public ShellSort(){
		super.LABLE = "希尔排序";
	}
    @Override
    public void sort(int[] a) {
        int h=1;
        while(h<a.length/3){
            h=3*h+1;
        }
        while(h>=1){
            for(int i=h;i<a.length;i++){
                for(int j=i;j>=h;j=j-h){
                    if(less(a[j],a[j-h])){
                        exch(a,j,j-h);
                    }
                    else break;
                }
            }
            h=h/3;
        }
    }
}