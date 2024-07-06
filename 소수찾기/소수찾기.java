package programers.소수찾기;

import java.util.Arrays;

public class 소수찾기 {
	// 해당 함수를 좀 더 분리하여 코드를 작성하면 좋을 것 같음.
	// 예시 : 소수배열을 반환하는 메서드1과, 소수의 갯수 혹은 값을 찾는 메서드를 분리하는등.

	public static void main(String[] args) {

		int n = 10;
	   	int cnt = solution(n);
		System.out.println(cnt);

	}


	
	static int solution(int n) {
		int cnt = 0;
		// 배열의 인덱스를 실제 숫자로 보고 계산하기 때문에 0 ~ n까지 확인하기 위해서는 길이를 n+1 해야함.
		// 이렇게 하면 소수의 갯수, 소수들 자체 값을 구하기 매우 편해짐.
		boolean[] booleans = new boolean[n+1];
		// 불린 배열은 기본 값이 false 이므로 true 로 전체값 변경하는 메서드.
		Arrays.fill(booleans, true);

		// 0과 1은 소수가 아니므로 false로 시작.
                // 배열에서 true 를 소수로 판단할 것이기 때문에, 아닌 것들은 false 로 만듬.
		booleans[0] = false;
		booleans[1] = false;

		// 소수를 찾을때, 2,3,5,7 의 배수들과 그 이상의 수들 중 n제곱인 수들을 제외하면서 찾는것이 빠름.
		for (int i = 2; i * i <= n; i++) {
			if (booleans[i]) {
				for (int j = i * i; j <= n; j += i) {
					booleans[j] = false;
				}
			}
		}

		// true 라면 소수. 갯수를 구하는 문제였음.
		for (boolean b : booleans) {
			if (b) {
				cnt++;
			}
		}

		return cnt;
	}



}
