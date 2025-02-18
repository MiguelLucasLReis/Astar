import java.util.Random;

public class GraphGenerator {
    public static void main(String[] args) {
        int[] sizes = {10, 50, 100, 1000};
        for (int size : sizes) {
            System.out.println("Graph of size: " + size + "x" + size);
            int[][] graph = generateGraph(size);
            printGraph(graph);
            System.out.println();
        }
    }

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

    public static void printGraph(int[][] graph) {
        for (int[] row : graph) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

