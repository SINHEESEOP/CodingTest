package programers.소수찾기;

import java.util.Arrays;

public class 소수찾기 {

	public static void main(String[] args) {

		int n = 10;
	   	int cnt = solution(n);
		System.out.println(cnt);

	}

	static int solution(int n) {
		int cnt = 0;

		boolean[] booleans = new boolean[n+1];
		Arrays.fill(booleans, true);

		booleans[0] = false;
		booleans[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (booleans[i]) {
				for (int j = i * i; j <= n; j += i) {
					booleans[j] = false;
				}
			}
		}

		for (boolean b : booleans) {
			if (b) {
				cnt++;
			}
		}

		return cnt;
	}



}
