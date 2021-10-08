package com.triphan.inputandoutput;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInputAndOutputSample {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(Path.of("myfile.txt"), StandardCharsets.UTF_8);
		System.out.println(in.nextLine());
		
	}

}
