package io.redondo.javaCore8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Reda", "Zejli", 29), new Person("Jack", "Reacher", 20),
				new Person("Arthur", "Bishop", 43), new Person("Billy", "Boy", 23),
				new Person("Frankie", "De jong", 21), new Person("John", "Wick", 39));

		// Step 1. Sort elements by last Name
		Collections.sort(people, (p1, p2) -> p1.getLname().compareTo(p2.getLname()));
		// Step 2. Create a method that print all the elements

		performCondition(people, p -> true, p -> System.out.println(p));
		// Step 3. Create a method that print all people thath elements begins with B
		performCondition(people, p -> p.getLname().startsWith("B"), p -> System.out.println(p.getLname()));
	}

	private static void performCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);

			}
		}

	}

}
