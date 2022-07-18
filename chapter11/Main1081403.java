package Main001;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main1081403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Person[] p = new Person[N];

		for (int i = 0; i < N; i++) {
			p[i] = new Person(sc.nextInt(), sc.next());
		}
		Arrays.sort(p, new Comparator<Person>() {
			public int compare(Person s1, Person s2) {
				return s1.age - s2.age;
			}
		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			sb.append(p[i]);
		}
		System.out.println(sb);
	}

	public static class Person {
		int age;
		String name;

		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public String toString() {
			return age + " " + name + '\n';
		}
	}
}
