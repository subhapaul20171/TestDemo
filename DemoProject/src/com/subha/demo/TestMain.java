package com.subha.demo;

import java.io.File;

public class TestMain {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\User\\Desktop\\Zebra\\Zebra_Daily_Dashboard_Status.xlsx");
		System.out.println("File size:" + GetFileSize.getFileSize(file));
	}
}
