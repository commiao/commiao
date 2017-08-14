package com.framework.common.math.matrix;

import com.framework.common.math.fraction.Fraction;

public class MatrixTool {
	public final static int OPERATION_ADD = 1;// 加法
	public final static int OPERATION_SUB = 2;// 减法
	public final static int OPERATION_MUL = 4;// 乘法

	/**
	 * 计算两矩阵之和（they must be of the same size）
	 * @param matrixa
	 * @param matrixb
	 * @return
	 */
	public static Matrix add(String[][] matrixa, String[][] matrixb) {
		Matrix mat = null;
		if (legalOperation(matrixa, matrixb, OPERATION_ADD)) {
			String[][] temp = new String[matrixa.length][matrixa[0].length];
			for (int i = 0; i < matrixa.length; i++) {
				for (int j = 0; j < matrixa[0].length; j++) {
					temp[i][j] = new Fraction(matrixa[i][j]).add(new Fraction(matrixb[i][j])).toString();
				}
			}
			mat = new Matrix(temp);
		}
		return mat;
	}

	/**
	 * 计算两矩阵之差（they must be of the same size）
	 * @param matrixa
	 * @param matrixb
	 * @return
	 */
	public static Matrix substract(String[][] matrixa, String[][] matrixb) {
		Matrix mat = null;
		if (legalOperation(matrixa, matrixb, OPERATION_SUB)) {
			String[][] temp = new String[matrixa.length][matrixa[0].length];
			for (int i = 0; i < matrixa.length; i++) {
				for (int j = 0; j < matrixa[0].length; j++) {
					matrixa[i][j] = new Fraction(matrixa[i][j]).subtract(new Fraction(matrixb[i][j])).toString();
				}
			}
			mat = new Matrix(temp);
		}
		return mat;
	}

	/**
	 * 计算两矩阵之积（they must be of the same size）
	 * @param matrixa
	 * @param matrixb
	 */
	public static Matrix multiplication(String[][] matrixa, String[][] matrixb) {
		Matrix mat = null;
		if (legalOperation(matrixa, matrixb, OPERATION_SUB)) {
			String[][] temp = new String[matrixa.length][matrixa[0].length];
			for (int i = 0; i < matrixa.length; i++) {
				for (int j = 0; j < matrixb[0].length; j++) {
					// i will complete this tomorrow @2012/09/17
					temp[i][j] = calculateSingleResult(matrixa, matrixb, i, j);
				}
			}
			mat = new Matrix(temp);
		} 
		return mat;
	}

	private static String calculateSingleResult(String[][] matrixa, String[][] matrixb, int row, int col) {
		int result = 0;
		String str = null;
		for (int k = 0; k < matrixa[0].length; k++) {
			str = new Fraction(matrixa[row][k]).multi(new Fraction(matrixb[k][col])).toString();
			result += Integer.valueOf(str);
		}
		return result+"";
	}

	/**
	 * 计算一个矩阵所有元素乘以一个数
	 * @param matrix
	 * @param x
	 */
	public static Matrix multiplication(String[][] matrix, int x) {
		String data = null;
		String[][] temp = new String[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				data = matrix[i][j];
				temp[i][j] =  new Fraction(data).multi(new Fraction(x)).toString();
			}
		}
		return new Matrix(temp);
	}

	/**
	 * 验证两个矩阵长度是否一致
	 * @param a
	 * @param b
	 * @param type
	 * @return
	 */
	private static boolean legalOperation(String[][] a, String[][] b, int type) {
		boolean legal = true;
		if (type == OPERATION_ADD || type == OPERATION_SUB) {
			if (a.length != b.length || a[0].length != b[0].length) {
				legal = false;
			}
		} else if (type == OPERATION_MUL) {
			if (a[0].length != b.length) {
				legal = false;
			}
		}
		return legal;
	}

    /**
     * 求一个矩阵的转置矩阵
     * @param matrix
     * @return
     */
    public static Matrix transpose(String[][] matrix) {
    	String[][] transpose_matrix = new String[matrix.length][matrix[0].length];   
    	for (int i = 0; i < matrix.length; i++)    
    		for (int j = 0; j < matrix[0].length; j++)      
    			transpose_matrix[i][j] = matrix[j][i];    
    	return new Matrix(transpose_matrix);
    }  
	
    /**
     * 获取 y行x列 的代数余子式
     * @param matrix
     * @param y 行
     * @param x 列
     * @return
     */
    public static String[][] getAlgebraicComplement(String[][] matrix, int y, int x) {  
        int H = matrix.length;  
        int V = matrix[0].length;  
        String[][] newData = new String[H - 1][V - 1];  
  
        for (int i = 0; i < newData.length; i++) {  
  
            if (i < y - 1) {  
                for (int j = 0; j < newData[i].length; j++) {  
                    if (j < x - 1) {  
                        newData[i][j] = matrix[i][j];  
                    } else {  
                        newData[i][j] = matrix[i][j + 1];  
                    }  
                }  
            } else {  
                for (int j = 0; j < newData[i].length; j++) {  
                    if (j < x - 1) {  
                        newData[i][j] = matrix[i + 1][j];  
                    } else {  
                        newData[i][j] = matrix[i + 1][j + 1];  
                    }  
                }  
  
            }  
        }  
  
        return newData;  
    }
    
    /** 
     * 获取矩阵的模
     * @param matrix
     * @return
     */
    public static Fraction getMatrixNorm(String[][] matrix) {  
        // 终止条件  
        if (matrix.length == 2) {
            return new Fraction(matrix[0][0]).multi(new Fraction(matrix[1][1])).subtract(new Fraction(matrix[0][1]).multi(new Fraction(matrix[1][0])));  
        }  
  
        Fraction total = new Fraction(0);  
        // 根据data 得到行列式的行数和列数  
        int num = matrix.length;  
        // 创建一个大小为num 的数组存放对应的展开行中元素求的的值  
        Fraction[] nums = new Fraction[num];  
        Integer temp = null;
        for (int i = 0; i < num; i++) {
        	temp = Integer.valueOf(matrix[0][i]);
            if (i % 2 == 0) {  
                nums[i] = new Fraction(temp).multi(getMatrixNorm(MatrixTool.getAlgebraicComplement(matrix, 1, i + 1)));  
            } else {  
                nums[i] = new Fraction(-temp).multi(getMatrixNorm(MatrixTool.getAlgebraicComplement(matrix, 1, i + 1)));  
            }  
        }  
        for (int i = 0; i < num; i++) {  
            total = total.add(nums[i]);  
        }  
        return total;  
    }
    
    /** 
     * 求解逆矩阵
     * @param data 
     * @return 
     */  
	public static Matrix getInverseMatrix(String[][] matrix) {
		// 先是求出行列式的模|data|
		Fraction A = getMatrixNorm(matrix);
		// 创建一个等容量的逆矩阵
		String[][] newData = new String[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				int num;
				// 代数余子式的模
				Fraction f = MatrixTool.getMatrixNorm(MatrixTool.getAlgebraicComplement(matrix, i + 1, j + 1));
				if ((i + j) % 2 == 0) {
					num = Integer.valueOf(f.toString());
				} else {
					num = -Integer.valueOf(f.toString());
				}
				newData[i][j] = new Fraction(num).div(A).toString();
			}
		}
		// 转置 代数余子式转制
		return transpose(newData);
	}

}
