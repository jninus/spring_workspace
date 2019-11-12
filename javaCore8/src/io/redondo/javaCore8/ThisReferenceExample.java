package io.redondo.javaCore8;

import io.redondo.javaCore8.ClosureExample.Process;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		doProcess(45, (i) -> {
			System.out.println("execution method");
			System.out.println(this);
		});

	}

	public static void main(String[] args) {

		ThisReferenceExample reference = new ThisReferenceExample();
		/*
		 * reference.doProcess(10, new Process() {
		 * 
		 * @Override public void process(int i) { System.out.println("value of i is :" +
		 * i); System.out.println(this);
		 * 
		 * }
		 * 
		 * @Override public String toString() { return "This is the anonymous class"; }
		 * });
		 */

		reference.doProcess(9, (i) -> System.out.println("Hey Redondo"));
		reference.execute();
	}

	@Override
	public String toString() {
		return "Hello TO String";
	}

}
