package com.framework.common.math.fraction;

public class FractionTool {

	/**
	 * 加法
	 * @param f1
	 * @param f2
	 * @return
	 */
	public static Fraction add(Fraction f1, Fraction f2) {
		Fraction[] fs = RCD(f1, f2);
		Fraction add = new Fraction(fs[0].getNumerator() + fs[1].getNumerator(), fs[0].getDenominator());
		return simpler(add);
	}
	
	/**
	 * 减法
	 * @param f1
	 * @param f2
	 * @return
	 */
	public static Fraction subtract(Fraction f1, Fraction f2) {
		Fraction[] fs = RCD(f1, f2);
		Fraction minus = new Fraction(fs[0].getNumerator() - fs[1].getNumerator(), fs[0].getDenominator());
		return simpler(minus);
	}
	
	/**
	 * 乘法
	 * @param f1
	 * @param f2
	 * @return
	 */
	public static Fraction multi(Fraction f1, Fraction f2) {
		Fraction multi = new Fraction(f1.getNumerator() * f2.getNumerator(), f1.getDenominator() * f2.getDenominator());
		return simpler(multi);
	}

	/**
	 * 除法
	 * @param f1
	 * @param f2
	 * @return
	 */
	public static Fraction div(Fraction f1, Fraction f2) {
		return multi(f1, new Fraction(f2.getDenominator(), f2.getNumerator()));
	}
	
	/**
	 * 最大公约数
	 * greatest common divisor
	 */
	private static int GCD(int s, int b) {
		// s-small,b-big
		if (s > b) {
			int temp = s;
			s = b;
			b = temp;
		}
		while (b != 0) {
			int temp = s % b;
			s = b;
			b = temp;
		}
		return s;
	}

	/**
	 * 最小公倍数
	 * a lowest common multiple
	 */
	private static int LCM(int a, int b) {
		return a * b / GCD(a, b);
	}
	
	/**
	 * 分子和分母都除以最大公约数
	 * both the numerator and denominator are divided by GCD
	 */
	private static Fraction simpler(Fraction f) {
		int gcd = GCD(f.getNumerator(), f.getDenominator());
		if (gcd > 1)
			return new Fraction(f.getNumerator() / gcd, f.getDenominator() / gcd);
		else
			return f;
	}

	/**
	 * 减少公分母
	 * reduction to common denominator
	 */
	private static Fraction[] RCD(Fraction f1, Fraction f2) {
		int lcm = LCM(f1.getDenominator(), f2.getDenominator());
		int m = lcm / f1.getDenominator();
		if (m > 1)
			f1 = new Fraction(f1.getNumerator() * m, f1.getDenominator() * m);
		m = lcm / f2.getDenominator();
		if (m > 1)
			f2 = new Fraction(f2.getNumerator() * m, f2.getDenominator() * m);
		return new Fraction[] { f1, f2 };
	}
	
	public static void output(String s) {
		System.out.println(s);
	}
	
	public static Fraction StringToFraction(String data){
		String[] ss = data.split("/");
		try {
			if (ss.length == 2)
				return simpler(new Fraction(Integer.valueOf(ss[0]), Integer.valueOf(ss[1])));
			else if (ss.length == 1)
				return new Fraction(Integer.valueOf(ss[0]));
			else
				return null;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			output("【字符串转分数】：类型转换错误-"+data);
		}
		return null;
	}
	
}
