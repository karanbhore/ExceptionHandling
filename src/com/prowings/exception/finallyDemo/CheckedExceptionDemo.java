package com.prowings.exception.finallyDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		String text = "Hey java developers welcome to file handling!!";

		writeINToFile(text);
		readFromFile("a.txt");
	}

	public static void writeINToFile(String text) {
		FileWriter fWriter = null;
		try {
			fWriter = new FileWriter("a.txt");
			fWriter.write(text);
			System.out.println(text);

		} catch (IOException e) {
			System.out.println("some error occured during Writing file!!");

		} catch (Exception e) {
			System.out.println("some error while writting file!!");

		} finally {
			try {
				fWriter.close();

			} catch (IOException e) {
				System.out.println("Error while closing file!!");
			}
		}
		System.out.println("File is created successfully!!");

	}

	public static void readFromFile(String fileName) {
		try {
			List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
			System.out.println(lines);
		} catch (IOException e) {
			System.out.println("Error reading file!!");
		}
	}
}
