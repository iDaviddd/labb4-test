package labb4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Wrong arguments!");
			return;
		}

		String pattern = args[0];
		String filePath = args[1];

		ArrayList<String> lines = new ArrayList<String>();

		try {
			Scanner scanner = new Scanner(new File(filePath));

			while (scanner.hasNextLine()) {
				lines.add(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found, please run the program again!");
			return;
		}

		for (String line : lines) {
			if (line.contains(pattern)) {
				System.out.println(line);
			}
		}
	}

}
