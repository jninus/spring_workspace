package io.redondo.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {

		Thread thread = new Thread(MethodReferenceExample1::printMessage);   // Method Reference
		thread.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}
}
