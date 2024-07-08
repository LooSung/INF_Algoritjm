package day5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}

}

public class Solve8 {
	public static void main(String[] args) {
		// 현재 N명의 환자가 대기목록에 있습니다.
		//
		//N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.
		//
		//대기목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것입니다

		/*
		5 2
		60 50 70 80 90
		*/
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		Queue<Person> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			queue.add(new Person(i, sc.nextInt()));
		}

		int result = 1;
		while (!queue.isEmpty()) {
			Person person = queue.poll();
			for (Person p : queue) {
				if (p.priority > person.priority) {
					queue.add(person);
					person = null;
					break;
				}
			}

			if(person != null) {
				if(person.id != m) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
