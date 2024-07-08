package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// 밑면이 정사각형인 직육면체 벽돌들을 사용하여 탑을 쌓고자 한다. 탑은 벽돌을 한 개씩 아래에서 위로 쌓으면서 만들어 간다.
//
//아래의 조건을 만족하면서 가장 높은 탑을 쌓을 수 있는 프로그램을 작성하시오.
//
//(조건1) 벽돌은 회전시킬 수 없다. 즉, 옆면을 밑면으로 사용할 수 없다.
//
//(조건2) 밑면의 넓이가 같은 벽돌은 없으며, 또한 무게가 같은 벽돌도 없다.
//
//(조건3) 벽돌들의 높이는 같을 수도 있다.
//
//(조건4) 탑을 쌓을 때 밑면이 좁은 벽돌 위에 밑면이 넓은 벽돌은 놓을 수 없다.
//
//(조건5) 무게가 무거운 벽돌을 무게가 가벼운 벽돌 위에 놓을 수 없다.



/*
벽돌 개수
넓이 높이 무게
5
25 3 4
4 4 6
9 2 3
16 2 5
1 5 2

// 출력 가장 높이 쌓을 수 있는 높이를 구해라
*/
class Cuboid implements Comparable<Cuboid> {
	public int area, height, weight;
	Cuboid(int area, int height, int weight){
		this.area = area;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Cuboid o) {
		return o.area - this.area;
	}
}

public class Solve4 {
	static int[] dy;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Cuboid> cuboids = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			cuboids.add(new Cuboid(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(cuboids);

		dy = new int[cuboids.size()];
		dy[0] = cuboids.get(0).height;
		int result = dy[0];

		for (int i = 1; i < cuboids.size(); i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (cuboids.get(j).weight > cuboids.get(i).weight) {
					if (dy[j] > max) {
						max = dy[j];
					}
				}
			}
			dy[i] = max + cuboids.get(i).height;
			result = Math.max(result, dy[i]);
		}

		System.out.println(result);
	}
}
