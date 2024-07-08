package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
6
50 2
20 1
40 2
60 3
30 3
30 1
*/

class WorkPay implements Comparable<WorkPay>{
	public int money;
	public int day;
	WorkPay(int money, int day) {
		this.money = money;
		this.day = day;
	}
	@Override
	public int compareTo(WorkPay ob){
		return ob.day - this.day;
	}
}

public class Solve4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int max = Integer.MIN_VALUE;
		ArrayList<WorkPay> workPays = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			max = Math.max(max, y);

			workPays.add(new WorkPay(x, y));
		}

		int result = 0;
		Collections.sort(workPays);

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int j = 0;
		for (int i = max; i >= 1; i--) {
			while (j < n && workPays.get(j).day >= i) {
				pq.offer(workPays.get(j).money);
				j++;
			}

			if (!pq.isEmpty()) {
				result += pq.poll();
			}
		}
		System.out.println(result);
	}
}
