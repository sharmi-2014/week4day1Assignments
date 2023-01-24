package week4sat1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
public static void main(String[] args) {
	
	String text="we learn java basics as part of java sessions in java week";
	 
	List<String>dups=new ArrayList<String>();
	dups.add("we");
	dups.add("learn");
	dups.add("java");
	dups.add("basics");
	dups.add("as");
	dups.add("part");
	dups.add("of");
	dups.add("java");
	dups.add("sessions");
	dups.add("in");
	dups.add("java");
	dups.add("week");
	System.out.println(dups);
	
	Set<String>set=new LinkedHashSet<String>(dups);
	dups.clear();
	dups.addAll(set);
				System.out.println(dups);
			}
	
		
	
}


