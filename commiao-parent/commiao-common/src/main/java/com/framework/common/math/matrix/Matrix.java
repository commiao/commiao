package com.framework.common.math.matrix;

import java.util.Random;

public class Matrix {
	/**
	 * 几行
	 */
	Integer row;
	/**
	 * 几列
	 */
	Integer column;
	/**
	 * 矩阵
	 */
	String[][] mat;
	
	/**
	 * 实例化一个矩阵
	 * @param matrix
	 */
	public Matrix(String[][] matrix) {
		this.mat = matrix;
	}

	/**
	 * 指定行列的实例
	 * @param row
	 * @param column
	 */
	public Matrix(int row, int column) {
		this.row = row;
		this.column = column;
		this.mat = new String[row][column];
	}

	/**
	 * 获取矩阵
	 * @return
	 */
	public String[][] getMat() {
		return mat;
	}

	/**
	 * 设置矩阵
	 * @param matrix
	 */
	public void setMat(String[][] matrix) {
		this.mat = matrix;
	}

	/**
	 * 获取行数
	 * @return
	 */
	public Integer getRow() {
		return row==null?mat.length:row;
	}

	/**
	 * 设置行数
	 * @param row
	 */
	public void setRow(Integer row) {
		this.row = row;
	}

	/**
	 * 获取列数
	 * @return
	 */
	public Integer getColumn() {
		return column==null?mat[0].length:column;
	}

	/**
	 * 设置列数
	 * @param column
	 */
	public void setColumn(Integer column) {
		this.column = column;
	}

	/**
	 * 创建一个随机的矩阵
	 */
	public void NewRandom() {
		Random rand = new Random();
		for (int i = 0; i < row; i++)
		for (int j = 0; j < column; j++)
		mat[i][j] = rand.nextInt(100)+"";
	}
	
	/**
	 * 输出矩阵的所有元素
	 */
	public void OutPut(){
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print("\t" + mat[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * 计算两矩阵之和
	 * @param matrix
	 * @return
	 */
	public Matrix add(Matrix matrix) {
		return MatrixTool.add(mat, matrix.getMat());
	}

	/**
	 * 计算两矩阵之差
	 * @param matrix
	 * @return
	 */
	public Matrix substract(Matrix matrix) {
		return MatrixTool.substract(mat, matrix.getMat());
	}

	/**
	 * 计算两矩阵之积
	 * @param matrix
	 * @return
	 */
	public Matrix multiplication(Matrix matrix) {
		return MatrixTool.multiplication(mat, matrix.getMat());
	}

	/**
	 * 矩阵的所有元素乘以一个数
	 * @param x
	 */
	public Matrix multiplication(int x) {
		return MatrixTool.multiplication(mat, x);
	}
  
    /**
     * 判断矩阵是否为上三角矩阵
     * @return
     */
    public boolean isTriangular() {
        // 用相反的思路进行判断
    	String data = null;
        for (int i = 1; i < mat.length; i++) {   
            for (int j = 0; j < i; j++) { 
            	data = mat[i][j];
                if ( Integer.valueOf(data)!= 0) {   
                    return false;   
                }   
            }   
        }   
        return true;   
    }   
  
    /**
     * 判断是否为对称矩阵
     * @return
     */
    public boolean isSymmetry() {
        for (int i = 1; i < mat.length; i++) {   
            for (int j = 0; j < mat[i].length; j++) {   
                if (!mat[i][j].equals(mat[j][i])) {   
                    return false;   
                }   
            }   
        }   
        return true;   
    }
    
    /**
     * 获取 y行x列 的代数余子式
     * @param y 行
     * @param x 列
     * @return
     */
    public Matrix getAlgebraicComplement(int y, int x) { 
    	String[][] newData = MatrixTool.getAlgebraicComplement(mat, y, x);
        return new Matrix(newData);  
    }
    
    /**
     * 获取矩阵的转置矩阵
     * @return
     */
    public Matrix transpose() {
    	return MatrixTool.transpose(mat);
    } 
    
    /** 
     * 获取矩阵的模
     * @return
     */
    public String getMatrixNorm() {  
        return MatrixTool.getMatrixNorm(mat).toString();  
    }  
    
    /** 
     * 求解逆矩阵
     * @return 
     */  
	public Matrix getInverseMatrix() {
		return MatrixTool.getInverseMatrix(mat);
	}

	/**
	 * test code here !!!!
	 * @param args
	 */
	public static void main(String[] args) {
//		Matrix m = new Matrix(3,3);
//		m.NewRandom();
//		m.OutPut();
		
		String[][] a = new String[][] { { "1/9", "2", "3", "4" }, { "3", "4", "5", "6" }, {"7", "8", "9", "10"}, {"11", "12", "13", "14"} };
		String[][] b = new String[][] { { "7/9", "8", "9", "10" }, { "6", "5", "4", "3" }, {"2", "1", "0", "1"}, {"2", "3", "4", "5"} };
		Matrix m = new Matrix(a).add(new Matrix(b));
		m.OutPut();
		
	}
}
