package programers.k번째수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K번째수_정답 {
	// 문제 링크.
	// https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		solution(array, commands);

	}


	static List<Integer> solution(int[] array, int[][] commands) {
		List<Integer> answer = new ArrayList<>();

		int cnt = commands.length;
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < cnt; i++) {
			answer.add( cuting(index(commands, i), array) );
		}

		return answer;
	}

	// 1차원 리스트로 array 를 자르기, 정렬, 원하는 값까지 추출해주는 메서드.
	static int cuting(List<Integer> list, int[] array) {
		List<Integer> ab = new ArrayList<>();
		for (int i = list.get(0) - 1; i < list.get(1); i++) {
			ab.add(array[i]);
		}

		Collections.sort(ab);
		return ab.get((int) list.get(2) - 1);
	}

	// 2차원 배열 + 인덱스를 매개변수로 받아 1차원 List로 리턴 해주는 메서드.
	static List<Integer> index(int[][] commands, int length) {

		List<Integer> index = new ArrayList<>();

		for (int j = 0; j < commands[length].length; j++) {
			index.add(commands[length][j]);
		}

		return index;
	}

}
