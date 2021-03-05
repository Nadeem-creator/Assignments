/**
 * @author Nadeem
 *
 * 
 */

package com.main;

import com.service.ProblemTen;

public class MainAppTen {

	public static void main(String[] args) {

		ProblemTen pTen = new ProblemTen();
		System.out.println(pTen.add(5, 10));

		// dereferencing
		pTen = null;
	}

}
