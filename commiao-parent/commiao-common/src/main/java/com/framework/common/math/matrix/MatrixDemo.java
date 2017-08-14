package com.framework.common.math.matrix;

public class MatrixDemo {
	public final static int OPERATION_ADD = 1;// 加法
	public final static int OPERATION_SUB = 2;// 减法
	public final static int OPERATION_MUL = 4;// 乘法

	/**
	 * 计算两矩阵之和（they must be of the same size）
	 * @param matrixa
	 * @param matrixb
	 * @return
	 */
	public static int[][] add(int[][] matrixa, int[][] matrixb) {
		if (legalOperation(matrixa, matrixb, OPERATION_ADD)) {
			for (int i = 0; i < matrixa.length; i++) {
				for (int j = 0; j < matrixa[0].length; j++) {
					matrixa[i][j] = matrixa[i][j] + matrixb[i][j];
				}
			}
		}
		return matrixa;
	}

	/**
	 * 计算两矩阵之差（they must be of the same size）
	 * @param matrixa
	 * @param matrixb
	 * @return
	 */
	public static int[][] substract(int[][] matrixa, int[][] matrixb) {
		if (legalOperation(matrixa, matrixb, OPERATION_SUB)) {
			for (int i = 0; i < matrixa.length; i++) {
				for (int j = 0; j < matrixa[0].length; j++) {
					matrixa[i][j] = matrixa[i][j] - matrixb[i][j];
				}
			}
		}
		return matrixa;
	}

	/**
	 * 计算两矩阵之积（they must be of the same size）
	 * @param matrixa
	 * @param matrixb
	 */
	public static int[][] multiplication(int[][] matrixa, int[][] matrixb) {
		if (legalOperation(matrixa, matrixb, OPERATION_SUB)) {
			int[][] result = new int[matrixa.length][matrixb[0].length];
			for (int i = 0; i < matrixa.length; i++) {
				for (int j = 0; j < matrixb[0].length; j++) {
					// i will complete this tomorrow @2012/09/17
					result[i][j] = calculateSingleResult(matrixa, matrixb, i, j);
				}
			}
			return result;
		} else {
			return null;
		}
	}

	private static int calculateSingleResult(int[][] matrixa, int[][] matrixb, int row, int col) {
		int result = 0;
		for (int k = 0; k < matrixa[0].length; k++) {
			result += matrixa[row][k] * matrixb[k][col];
		}
		return result;
	}

	/**
	 * 计算一个矩阵所有元素乘以一个数
	 * @param matrixa
	 * @param b
	 */
	public static int[][] multiplication(int[][] matrixa, int b) {
		for (int i = 0; i < matrixa.length; i++) {
			for (int j = 0; j < matrixa[0].length; j++) {
				matrixa[i][j] = matrixa[i][j] * b;
			}
		}
		return matrixa;
	}

	/**
	 * 验证两个矩阵长度是否一致
	 * @param a
	 * @param b
	 * @param type
	 * @return
	 */
	private static boolean legalOperation(int[][] a, int[][] b, int type) {
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
	 * 输出矩阵的所有元素
	 * @param result
	 */
	public static void toString(int[][] result){
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print("\t" + result[i][j]);
			}
			System.out.println();
		}
	}
	
    /**
     * 求一个矩阵的转置矩阵
     * @param matrix
     * @return
     */
    public static int[][] transpose(int[][] matrix) {
    	int[][] transpose_matrix = new int[matrix.length][matrix[0].length];   
    	for (int i = 0; i < matrix.length; i++)    
    		for (int j = 0; j < matrix[0].length; j++)      
    			transpose_matrix[i][j] = matrix[j][i];    
    	return transpose_matrix;
    }   
  
    /**
     * 判断一个矩阵是否为上三角矩阵
     * @param matrix
     * @return
     */
    public static boolean isTriangular(int[][] matrix) {
        // 用相反的思路进行判断   
        for (int i = 1; i < matrix.length; i++) {   
            for (int j = 0; j < i; j++) {   
                if (matrix[i][j] != 0) {   
                    return false;   
                }   
            }   
        }   
        return true;   
    }   
  
    /**
     * 判断是否为对称矩阵
     * @param matrix
     * @return
     */
    public static boolean isSymmetry(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {   
            for (int j = 0; j < matrix[i].length; j++) {   
                if (matrix[i][j] != matrix[j][i]) {   
                    return false;   
                }   
            }   
        }   
        return true;   
    }
    
    
    /**
     * 获取 y行x列 的代数余子式
     * @param matrix
     * @param y 行
     * @param x 列
     * @return
     */
    public static int[][] getAlgebraicComplement(int[][] matrix, int y, int x) {  
        int H = matrix.length;  
        int V = matrix[0].length;  
        int[][] newData = new int[H - 1][V - 1];  
  
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
    public static int getMatrixNorm(int[][] matrix) {  
  
        // 终止条件  
        if (matrix.length == 2) {  
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];  
        }  
  
        int total = 0;  
        // 根据data 得到行列式的行数和列数  
        int num = matrix.length;  
        // 创建一个大小为num 的数组存放对应的展开行中元素求的的值  
        int[] nums = new int[num];  
  
        for (int i = 0; i < num; i++) {  
            if (i % 2 == 0) {  
                nums[i] = matrix[0][i] * getMatrixNorm(getAlgebraicComplement(matrix, 1, i + 1));  
            } else {  
                nums[i] = -matrix[0][i] * getMatrixNorm(getAlgebraicComplement(matrix, 1, i + 1));  
            }  
        }  
        for (int i = 0; i < num; i++) {  
            total += nums[i];  
        }  
        return total;  
    }  
    
    /** 
     * 求解逆矩阵
     *  
     * @param data 
     * @return 
     */  
    public int[][] getInverseMatrix(int[][] data) {  
        // 先是求出行列式的模|data|  
    	int A = getMatrixNorm(data);  
        // 创建一个等容量的逆矩阵  
    	int[][] newData = new int[data.length][data.length];  
  
        for (int i = 0; i < data.length; i++) {  
            for (int j = 0; j < data.length; j++) {  
            	int num;  
                if ((i + j) % 2 == 0) {  
                    num = getMatrixNorm(getAlgebraicComplement(data, i + 1, j + 1));  
                } else {  
                    num = -getMatrixNorm(getAlgebraicComplement(data, i + 1, j + 1));  
                }  
  
                newData[i][j] = num / A;  
            }  
        }  
  
        // 转置 代数余子式转制  
        newData = transpose(newData);  
        return newData;  
    }

	/**
	 * test code here !!!!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		int[][] a = null;
//		int[][] b = null;
//		int[][] result = null;
//		MatrixDemo md = new MatrixDemo();
//		System.out.println("===========================");
//		a = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, {7, 8, 9, 10}, {11, 12, 13, 14} };
//		System.out.println("矩阵一：");
//		toString(a);
//		System.out.println("===========================");
//		b = new int[][] { { 7, 8, 9, 10 }, { 6, 5, 4, 3 }, {2, 1, 0, 1}, {2, 3, 4, 5} };
//		System.out.println("矩阵二：");
//		toString(b);
		
		
//		System.out.println("===========================");
//		a = new int[][] { { 1, 2, 3 }, { 2, 2, 1 }, { 3, 4, 3 } };
//		System.out.println("矩阵一：");
//		toString(a);
		
		
//		int[][] temp = a = new int[][] { { 1, 2, 3 }, { 4, 5, 6}, { 7, 8, 9} };
//		System.out.println("===========================");
//		System.out.println("逆矩阵：");
//		result = md.getInverseMatrix(temp);
//		toString(result);
		
//		System.out.println("===========================");
//		System.out.println("矩阵的模："+md.getMatrixNorm(temp));
		
//		System.out.println("===========================");
//		System.out.println("代数余子式：");
//		result = bmm.getAlgebraicComplement(a, 3, 2);
//		toString(result);
		
//		System.out.println("===========================");
//		System.out.println("矩阵相加：");
//		result = MatrixDemo.add(a, b);
//		toString(result);
//
//		a = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, {7, 8, 9, 10}, {11, 12, 13, 14} };
//		b = new int[][] { { 7, 8, 9, 10 }, { 6, 5, 4, 3 }, {2, 1, 0, 1}, {2, 3, 4, 5} };
//		System.out.println("===========================");
//		System.out.println("矩阵相减：");
//		result = bmm.substract(a, b);
//		toString(result);
//
//		a = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, {7, 8, 9, 10}, {11, 12, 13, 14} };
//		b = new int[][] { { 7, 8, 9, 10 }, { 6, 5, 4, 3 }, {2, 1, 0, 1}, {2, 3, 4, 5} };
//		System.out.println("===========================");
//		System.out.println("矩阵一 X 3：");
//		result = bmm.multiplication(a, 3);
//		toString(result);
//
//		a = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, {7, 8, 9, 10}, {11, 12, 13, 14} };
//		b = new int[][] { { 7, 8, 9, 10 }, { 6, 5, 4, 3 }, {2, 1, 0, 1}, {2, 3, 4, 5} };
//		System.out.println("===========================");
//		System.out.println("矩阵相乘：");
//		result = bmm.multiplication(a, b);
//		toString(result);
		
	}
}
