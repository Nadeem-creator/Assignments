/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import java.util.Scanner;

import com.service.RunRate;

public class BufferedReaderMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		RunRate runRate = new RunRate();
		try {
			System.out.println("Enter runs scored: ");
			int runs = Integer.parseInt(in.next());
			System.out.println("Enter overs faced : ");
			int overs = Integer.parseInt(in.next());

			System.out.println(runRate.rrCalc(runs, overs));
		} catch (java.lang.Exception m) {
			m.printStackTrace();
		}
		in.close();
		runRate = null;

	}

}
