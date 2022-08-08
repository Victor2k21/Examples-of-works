package homeworkRotateMatrix;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        giveMatrix(colors);

        int[][] rotatedColors = new int[SIZE][SIZE];

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                rotatedColors[j][colors.length - i - 1] = colors[i][j];
            }
        }
        System.out.println("________________________________");
        giveMatrix(rotatedColors);
    }
    public static void giveMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}