package com.practice.problem;

import java.io.File;

public class RecursiveFileSearch {

	public boolean search(File file, String filename) {

		if (file.getName().equals(filename)) {
			System.out.println("File Found");

			return true;
		}
		if (file.isFile()) {
			System.out.println(file.getPath());
			return false;
		}

		for (File f : file.listFiles()) {
			boolean b = search(f, filename);

			if (b) {

				return true;
			}

		}

		return false;
	}

	public static void main(String[] args) {

		new RecursiveFileSearch().search(new File("D:\\"), "Truecaller_12.23.6.apk");
	}
}
