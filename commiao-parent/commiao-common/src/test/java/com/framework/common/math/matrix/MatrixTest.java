package com.framework.common.math.matrix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MatrixTest {
	int[][] a = null;
	String[][] b = null;
	Matrix x = null;
	Matrix y = null;
	Matrix result = null;
	@Before
	public void setUp() throws Exception {
		a = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, {7, 8, 9, 10}, {11, 12, 13, 14} };
		b = new String[][] { { "7", "8", "9", "10" }, { "6", "5", "4", "3" }, {"2", "1", "0", "1"}, {"2", "3", "4", "5"} };
		x = new Matrix(MatrixHelper.getStringMatrix(a));
		y = new Matrix(b);
		System.out.println("before");
	}

	@After
	public void testdown() {
		System.out.println("end");
	}
//	@Test
	public void testgetInverseMatrix(){
		int[][] temp = a = new int[][] { { 1, 2 }, { 3, 4} };
		System.out.println("原矩阵：");
		new Matrix(MatrixHelper.getStringMatrix(temp)).OutPut();
		System.out.println("逆矩阵：");
		result = new Matrix(MatrixHelper.getStringMatrix(temp)).getInverseMatrix();
		result.OutPut();
	}
//	@Test
	public void testgetMatrixNorm(){
		int[][] temp = a = new int[][] { { 4, 0, 0 }, { 0, 3, -2}, { 0, 1, 5} };
		String s = new Matrix(MatrixHelper.getStringMatrix(temp)).getMatrixNorm();
		System.out.println("矩阵的模："+s);
	}
}
