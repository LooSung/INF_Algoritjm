package day4;

import java.util.HashMap;
import java.util.Scanner;

public class Solve2 {
	// 아나그램 해쉬
	// Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.

	// AbaAeCe
	// baeeACA
	// YES

	// abaCC
	// Caaab
	// NO

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();

		String result = "YES";
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(char c : input1.toCharArray()){
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}

		for(char c : input2.toCharArray()){
			if(!map1.containsKey(c) || map1.get(c) == 0){
				result = "NO";
				break;
			}
			map1.put(c,map1.get(c) -1);
		}

		System.out.println(result);
	}
}
