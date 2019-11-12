package io.redondo.javaCore8;

public class Test {

	public void greet(Greeting greeting) {

		greeting.perform();
	}

	public static void main(String[] args) {
		Test t = new Test();
		HelloWorldGreeting hello = new HelloWorldGreeting();
		t.greet(hello);

		Greeting myLambdaFunction = () -> System.out.println("Hello WOrld");
//		MyAdd addFunction = (int a, int b) -> a + b;
	}

}
