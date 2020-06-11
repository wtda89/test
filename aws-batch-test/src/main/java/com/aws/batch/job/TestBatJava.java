package com.aws.batch.job;

import java.io.IOException;

public class TestBatJava {
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("cmd /c start C:\\test\\test.bat");
	}
}
