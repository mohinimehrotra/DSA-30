package DSA;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {

  public static List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> res = new ArrayList<>();

    if (matrix.length == 0) {
      return res;
    }

    int rowBegin = 0;
    int rowEnd = matrix.length - 1;
    int colBegin = 0;
    int colEnd = matrix[0].length - 1;

    while (rowBegin <= rowEnd && colBegin <= colEnd) {
      //  move right
      for (int j = colBegin; j <= colEnd; j++) {
        res.add(matrix[rowBegin][j]);
      }
      rowBegin++;

      // move down
      for (int j = rowBegin; j <= rowEnd; j++) {
        res.add(matrix[j][colEnd]);
      }
      colEnd--;

      if (rowBegin <= rowEnd) {
        // move left
        for (int j = colEnd; j >= colBegin; j--) {
          res.add(matrix[rowEnd][j]);
        }
      }
      rowEnd--;

      if (colBegin <= colEnd) {
        // move up
        for (int j = rowEnd; j >= rowBegin; j--) {
          res.add(matrix[j][colBegin]);
        }
      }
      colBegin++;
    }

    return res;
  }
  public static void main(String args[]) {
	  int[][] matrix = {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {9, 10, 11, 12, 13}, {13, 14, 15, 16, 17}};
	  System.out.println("The array after spiral traversal of matrix is " + spiralOrder(matrix));
  }
  
}