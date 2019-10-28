package com.algo.topcoder.SRM669;

import java.util.HashMap;

/**
 * @author:Govinda<govinda@cdac.in>
 * Date:28-Sep-2015
 */
public class LiveConcert
{
	/*public static void main( String[] args )
	{
		int h[]={100,100,100,100,100,100,100,100,100,100,100,100,100};
		String s[]={"haruka","chihaya","yayoi","iori","yukiho","makoto","ami","mami","azusa","miki","hibiki","takane","ritsuko"};
		System.out.println(maxHappiness(h, s));
	}*/
	public int maxHappiness(int[] h, String[] s){
		
		HashMap< String, Integer> demo = new HashMap<String, Integer>();
		
		for(int i=0;i<s.length;i++){
			if(!demo.containsKey(s[i]))
				demo.put(s[i],h[i]);
			else{
				int val= demo.get(s[i]);
				if(h[i]-val> 0)
					demo.put(s[i], h[i]);
				else continue;
			}
		}
		
		int sum = 0;
		
		for (String key : demo.keySet()) {
		    int value = demo.get(key);
		    sum = sum + value;
		}
		
		return sum;
	}
}
