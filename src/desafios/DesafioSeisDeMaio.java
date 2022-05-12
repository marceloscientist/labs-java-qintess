package desafios;
import java.util.Scanner;
public
class DesafioSeisDeMaio {

    private static
    void displayMatrix (int[][] matrix, String resultingMatrix) {
        System.out.println("=========="+resultingMatrix+"==========");
        for(int []line : matrix) {
            for(int cell : line) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static
    void createMatrix (Scanner inPut, int matrixLength, int[][] matrix) {
        for(int i=0; i<matrixLength;i++) {
            for(int j=0;j<matrixLength;j++){
                matrix[i][j]=inPut.nextInt();
            }
        }
    }

    public static
    void main (String[] args) {

        /* DesafioSeisDeMaio */

        Scanner inPut = new Scanner(System.in);
        final int matrixLength = 3;
        int[][] matrixA = new int[matrixLength][matrixLength];
        int[][] matrixB = new int[matrixLength][matrixLength];

        System.out.println("Insira os valores da Matriz A");
        createMatrix(inPut, matrixLength, matrixA);

        System.out.println("Insira os valores da Matriz B");
        createMatrix(inPut, matrixLength, matrixB);

        int[][] matrix = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println("Produto das Matrizes A & B");

        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                for(int k = 0; k < matrixLength; k++) {
                    matrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        displayMatrix(matrixA, "Matriz A");
        displayMatrix(matrixB, "Matriz B");
        displayMatrix(matrix, "Matriz Resultante");
    }
}
