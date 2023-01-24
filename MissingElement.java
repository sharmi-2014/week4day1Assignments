package week4sat1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,6,8};
		//List<String>lst=new ArrayList<String>();
		Set<Integer>set=new TreeSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		List<Integer>lst=new ArrayList<Integer>(set);
			Collections.sort(lst);
			for(int i=0; i<lst.size();i++) {
			if(lst.get(i)!=i+1) 
			{
				System.out.println(i+1);
				break;
				
				
			}
		}
		
		
		
	}

}
