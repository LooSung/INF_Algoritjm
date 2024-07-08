package day3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solve1 {
	public static void main(String[] args) {
		// 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
		// 3
		//1 3 5
		//5
		//2 3 6 7 9
		// --> 1 2 3 3 5 6 7 9

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list1.add(i, sc.nextInt());
		}

		int K = sc.nextInt();
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < K; i++) {
			list2.add(i, sc.nextInt());
		}

		for (Integer i : solve2(list1, list2)) {
			System.out.println(i + " ");
		}

	}

	private static ArrayList<Integer> solve1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(list1);
		result.addAll(list2);

		result.sort(Comparator.naturalOrder());

		for (Integer integer : result) {
			System.out.println(integer + " ");
		}
		return result;
	}

	private static ArrayList<Integer> solve2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> result = new ArrayList<>();

		int p1=0, p2=0;
		while(p1 < list1.size() && p2 < list2.size()) {
			if(list1.get(p1) < list2.get(p2)) {
				result.add(list1.get(p1++));
			} else {
				result.add(list2.get(p2++));
			}
		}
		while(p1 < list1.size()) {
			result.add(list1.get(p1++));
		}

		while(p2 < list2.size()) {
			result.add(list2.get(p2++));
		}

		return result;
	}
}
