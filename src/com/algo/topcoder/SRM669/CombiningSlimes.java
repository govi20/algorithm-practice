package com.algo.topcoder.SRM669;

import java.util.Arrays;

/**
 * @author:Govinda<govinda@cdac.in>
 * Date:28-Sep-2015
 */

public class CombiningSlimes
{
	 public int maxMascots(int[] a){
		 Arrays.sort(a);
		 int answer=0,sum=0,product=1;
		 for(int i=0;i<a.length;i++){
			 if(i==0){
				 sum = a[i] +a[i+1];
				 product = a[i]*a[i+1];
				 answer = answer + product;
				 i++;
			 }else{
				 product = sum * a[i];
				 sum = sum + a[i];
				 answer = answer + product;
				 
			 }
		 }
		 return answer;
	 }
	 
	/* public static void main( String[] args )
	{
		 int a[]={7,6,5,3,4,6};
		System.out.println(maxMascots(a));
	}*/
}
