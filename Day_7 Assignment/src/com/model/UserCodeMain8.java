package com.model;
import java.util.ArrayList;
import java.util.Collections;

public class UserCodeMain8{
	
	
	 
	public static ArrayList<Integer> sortMergeArrayList(ArrayList<Integer> al1, ArrayList<Integer> al2)
	{
	al1.addAll(al2);
	Collections.sort(al1);
	ArrayList<Integer> ans=new ArrayList<Integer>();
	ans.add(al1.get(2));
	ans.add(al1.get(6));
	ans.add(al1.get(8));
	return ans;
	}
}