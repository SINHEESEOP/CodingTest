package programers.k번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K번째수 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		solution(array, commands);

	}

	static List<Integer> solution(int[] array,final int[][] commands) {
		List<Integer> answer = new ArrayList();

		int cnt = commands.length;
		List<Integer> list = new ArrayList();

		for (int i = 0; i < cnt; i++) {
			System.out.println(Arrays.toString(array));
			System.out.println(index(commands, i).toString());
			list.add(cuting(index(commands, i), array));
			System.out.println(list.toString());
			System.out.println("다음 정답 : --------------------------");
		}
		return answer;
	}

	static int cuting(List list, int[] array) {
//		StringBuilder sum = new StringBuilder();
		List<Integer> ab = new ArrayList<>();
		for (int i = (int)list.get(0) - 1; i < (int)list.get(1); i++) {
			ab.add(array[i]);
		}

		Collections.sort(ab);
		return ab.get((int) list.get(2) - 1);

//		for (int i = 0; i < array.length; i++) {
//			sum.append(Integer.toString(array[i]));
//		}
//		System.out.println(sum.toString());
//		String a = sum.substring((int) list.get(0) - 1, (int) list.get(1));
//		System.out.println(a);
//		List<Integer> b = new ArrayList<>();
//		for (int i = 0; i < a.length(); i++) {
//			b.add(Character.getNumericValue(a.charAt(i)));
//		}
//		Collections.sort(b);
//		return b.get((int)list.get(2)-1);
	}

	// 2차원 배열 + 인덱스를 매개변수로 받아 1차원 List로 리턴 해주는 함수.
	static List index(int[][] commands, int length) {

		List index = new ArrayList();

		for (int j = 0; j < commands[length].length; j++) {
			index.add(commands[length][j]);
		}

		return index;
	}
}
