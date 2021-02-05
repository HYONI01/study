package easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Array2D {

  // Complete the hourglassSum function below.
  static int hourglassSum(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = 0; j < arr[i].length - 2; j++) {
        int cnt = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
            + arr[i + 1][j + 1]
            + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
        if (cnt > max) {
          max = cnt;
        }
      }
    }

    return max;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(
        new FileWriter(System.getenv("OUTPUT_PATH")));

    int[][] arr = new int[6][6];

    for (int i = 0; i < 6; i++) {
      String[] arrRowItems = scanner.nextLine().split(" ");

      for (int j = 0; j < 6; j++) {
        int arrItem = Integer.parseInt(arrRowItems[j]);
        arr[i][j] = arrItem;
      }
    }

    int result = hourglassSum(arr);
    System.out.println(result);
    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
