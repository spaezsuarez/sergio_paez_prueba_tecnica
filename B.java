import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[][] response = createScreenProtector(input);
        printMatrix(response);
        System.out.println(calculateSumInverseDiagonal(response, input));
        scanner.close();
    }

    private static int[][] createScreenProtector(int input) {
        int[][] response = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = input-1; j >= 0; j--) {
                if (j == input-i-1) {
                    response[i][j] = input-i;
                }else if(j < input-i-1){
                    response[i][j] = 1;
                }
            }
        }
        return response;
    }

    private static int calculateSumInverseDiagonal(int[][] response,int input) {
        int sum = 0;
        for (int i = 0; i < input; i++) {
            for (int j = input-1; j >= 0; j--) {
                if (j == input-i-1) {
                    sum += response[i][j];
                }
            }
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
