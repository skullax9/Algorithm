package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Nodes {
	private int x, y;

	public Nodes (int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}

public class EscapeMaze {

	public static int n, m;

	public static int[][] graph = new int[201][201];

	public static int dx[] = {-1, 1, 0, 0};
	public static int dy[] = {0, 0, -1, 1};

	public static int bfs(int x, int y) {
		Queue<Nodes> queue = new LinkedList<>();
		queue.offer(new Nodes(x, y));

		while (!queue.isEmpty()) {
			Nodes node = queue.poll();
			x = node.getX();
			y = node.getY();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = x + dy[i];

				if (nx < 0 || nx >= n || ny < 0 || ny >= 0) continue;

				if (graph[nx][ny] == 0) continue;

				if (graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					queue.offer(new Nodes(nx,ny));
				}
			}
		}
		return graph[n - 1][m - 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}

		System.out.println(bfs(0,0));
	}
}
