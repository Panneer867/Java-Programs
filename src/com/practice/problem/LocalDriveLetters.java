package com.practice.problem;

import java.io.File;

public class LocalDriveLetters {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
	    for (File root : roots) {
	      
	      System.out.println(root.getAbsolutePath().substring(0, 2));
	    }

	}

}
