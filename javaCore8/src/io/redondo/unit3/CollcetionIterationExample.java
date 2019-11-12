package io.redondo.unit3;

import java.util.Arrays;
import java.util.List;

import io.redondo.javaCore8.Person;

public class CollcetionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Reda", "Zejli", 29), new Person("Jack", "Reacher", 20),
				new Person("Arthur", "Bishop", 43), new Person("Billy", "Boy", 23),
				new Person("Frankie", "De jong", 21), new Person("John", "Wick", 39));

//		for (int i = 0; i < people.size(); i++) {
//			System.out.println(people.get(i));
//		}
//
//		for (Person p : people) {
//			System.out.println(p);
//		}

		people.forEach(System.out::println);
		people.forEach((p) ->{
			System.out.println("Hello People");
			System.out.println(p);

		});

	}

}
