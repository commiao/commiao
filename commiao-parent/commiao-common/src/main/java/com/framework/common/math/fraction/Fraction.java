package com.framework.common.math.fraction;

import java.io.IOException;
import java.math.BigDecimal;

import com.framework.common.math.BigDecimalUtils;

public class Fraction {
	/**
	 * 分子
	 */
	private int numerator;
	/**
	 * 分母
	 */
	private int denominator;
	
	/**
	 * 获取分子
	 * @return
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * 设置分子
	 * @param numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * 获取分母
	 * @return
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * 设置分母
	 * @param denominator
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	/**
	 * 创建一个分数
	 * @param numerator 分子
	 * @param denominator 分母
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * 整数转为分数
	 * @param numerator
	 */
	public Fraction(int numerator) {
		this(numerator, 1);
	}
	
	/**
	 * "1/2"字符串转换为分数
	 * @param fraction
	 */
	public Fraction(String fraction){
		Fraction f = FractionTool.StringToFraction(fraction);
		if(f!=null){
			this.denominator = f.getDenominator();
			this.numerator = f.getNumerator();
		}
	}
	
	/**
	 * 加法 “+”
	 * @param f2
	 * @return
	 */
	public Fraction add(Fraction f2){
		Fraction f1 = new Fraction(numerator, denominator);
		return FractionTool.add(f1, f2);
	}

	/**
	 * 减法 “-”
	 * @param f2
	 * @return
	 */
	public Fraction subtract(Fraction f2) {
		Fraction f1 = new Fraction(numerator, denominator);
		return FractionTool.subtract(f1, f2);
	}

	/**
	 * 乘法 “X”
	 * @param f2
	 * @return
	 */
	public Fraction multi(Fraction f2) {
		Fraction f1 = new Fraction(numerator, denominator);
		return FractionTool.multi(f1, f2);
	}

	/**
	 * 除法 “/”
	 * @param f2
	 * @return
	 */
	public Fraction div(Fraction f2) {
		Fraction f1 = new Fraction(numerator, denominator);
		return FractionTool.div(f1, f2);
	}

	@Override
	public String toString() {
		if (denominator == 1) {
			return numerator+"";
		}
		StringBuilder sb = new StringBuilder();
		sb.append(numerator);
		sb.append('/');
		sb.append(denominator);
		return sb.toString();
	}
	
	/**
	 * 转换成 BigDecimal 类型
	 * @return
	 */
	public BigDecimal toBigDecimal(){
		return BigDecimalUtils.div(new BigDecimal(numerator), new BigDecimal(denominator));
	}
	
	/**
	 * 转换成 BigDecimal 类型
	 * @param scale 设置保留小数位数
	 * @return
	 */
	public BigDecimal toBigDecimal(int scale){
		return BigDecimalUtils.div(new BigDecimal(numerator), new BigDecimal(denominator), scale);
	}
	
	/**
	 * 转换成 Double 类型
	 * @return
	 */
	public Double toDouble(){
		double a = numerator;
		double b = denominator;
		return a/b;
	}
	
	public static void main(String[] args) throws IOException{
//		int c;
//		StringBuilder sb = new StringBuilder();
//		while ((c = System.in.read()) != '\n') sb.append((char) c);
//		input(sb.toString());
		Fraction a = new Fraction(3, 1);
		System.out.println(a.toString());
		Fraction b = new Fraction(1, 3);
		System.out.println(b.toString());
		Fraction result = a.add(b).add(new Fraction(1, 6));
		System.out.println(result.toString());
	}
}
