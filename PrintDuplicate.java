package week4sat1;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//Set<Integer>count=new HashSet<Integer>();
		List<Integer>lst=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			lst.add(arr[i]);
		}
					Collections.sort(lst);
			
			for(int i=0;i<lst.size();i++){
				for(int j=i+1;j<lst.size();j++) {
				if(lst.get(i)==lst.get(j)){
				
					System.out.println(lst.get(i));
					
				}
				
			}
		}
		
	}
		
	}

