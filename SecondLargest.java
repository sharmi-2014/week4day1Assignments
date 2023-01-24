package week4sat1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SecondLargest {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		//int[] total;
		List<Integer>lst=new ArrayList<Integer>();
		//lst.add(null)
		
		for(int i=0;i<data.length;i++) {
			lst.add(data[i]);
			
		}
       
		Collections.sort(lst);
		System.out.println(lst.get(lst.size()-2));
		
		
		
		
	}

}
