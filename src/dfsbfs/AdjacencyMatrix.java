package dfsbfs;

public class AdjacencyMatrix {
	public static void main(String[] args) {
		int INF = Integer.MAX_VALUE;

		/* 인접 행렬 */
		int[][] graph = {
			{0,7,5},
			{7,0,INF},
			{5,INF,0}
		};

		/* 인접 행렬 */
		for (int[] i : graph) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		/* 인접 리스트 */
	}
}
