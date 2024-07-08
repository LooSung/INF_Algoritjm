package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solve4 {
	public static void main(String[] args) {
		// S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
		//
		//아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
		// 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.

		// bacaAacba
		// abc

		// 설명 : 슬라이딩 윈도우, 투포인터, 해쉬 모두 사용
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String fomStr = sc.nextLine();

		ArrayList<Character> arr = new ArrayList<>();
		for(char c : str.toCharArray()) {
			arr.add(c);
		}

		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : fomStr.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int result = 0;

		HashMap<Character, Integer> tmpMap = new HashMap<>();
		for(int i = 0; i < fomStr.length() - 1; i++) {
			tmpMap.put(arr.get(i), tmpMap.getOrDefault(arr.get(i), 0) + 1);
		}

		int lt = 0;
		for (int rt = fomStr.length()-1; rt < arr.size(); rt++) {
			tmpMap.put(arr.get(rt), tmpMap.getOrDefault(arr.get(rt), 0) + 1);

			if(tmpMap.equals(map)) result++;

			tmpMap.put(arr.get(lt), tmpMap.getOrDefault(arr.get(lt), 0) - 1);

			if(tmpMap.get(arr.get(lt)) == 0) {
				tmpMap.remove(arr.get(lt));
			}

			lt++;
		}

		System.out.println(result);
	}
}
