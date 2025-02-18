import java.util.Random;

public class GraphGenerator {
    public static int[][] generateGraph(int size) {
        Random rand = new Random();
        int[][] graph = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                graph[i][j] = rand.nextInt(2); // Gera 0 ou 1 aleatoriamente
            }
        }

        return graph;
    }

}

