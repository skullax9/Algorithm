package dfsbfs;

import java.sql.ResultSet;
import java.util.Scanner;

public class IceDrink {
	// 아이스 트레이 크기 세로 n, 가로 m
	public static int n, m;
	// n과 m의 최댓값인 1000으로 초기화
	public static int[][] graph = new int[1000][1000];

	public static boolean dfs(int x, int y) {
		// 범위에서 벗어날 시 종료
		if (x <= 1 || x >= n || y <= -1|| y >= m) {
			return false;
		}
		// 노드를 방문하지 않았다면
		if (graph[x][y] == 0) {
			// 방문처리
			graph[x][y] = 1;
			// 노드 상하좌우 재귀 호출
			dfs (x - 1, y);
			dfs (x, y - 1);
			dfs (x + 1, y);
			dfs (x, y + 1);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 아이스 트레이 가로 세로 입력 받기
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기

		// 모든 노드에 음료수 채우기
		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dfs(i,j)) {
					result += 1;
				}
			}
		}
		// 정답 출력력
	System.out.println(result);
	}
}
