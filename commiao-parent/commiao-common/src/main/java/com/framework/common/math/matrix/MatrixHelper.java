package com.framework.common.math.matrix;

public class MatrixHelper {
	
	public static String[][] getStringMatrix(int[][] matrix){
		String[][] stringMatrix = new String[matrix.length][matrix[0].length];
		String[] arr = null; 
		for (int i = 0; i < matrix.length; i++) {
			arr = new String[matrix[0].length];
			for (int j = 0; j < matrix[0].length; j++) {
				arr[j] = matrix[i][j]+"";
			}
			stringMatrix[i] = arr;
		}
		return stringMatrix;
	}
}
