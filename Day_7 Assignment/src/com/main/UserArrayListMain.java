package com.main;

import java.util.ArrayList;
import java.util.Scanner;
import com.model.UserCodeMain8;

public class UserArrayListMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Integer> sortAndMerge = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			al1.add(sc.nextInt());
		for (int j = 0; j < 5; j++)
			al2.add(sc.nextInt());
		sortAndMerge = UserCodeMain8.sortMergeArrayList(al1, al2);

		for (int k = 0; k < 3; k++)
			System.out.println(sortAndMerge.get(k));
	}

}
