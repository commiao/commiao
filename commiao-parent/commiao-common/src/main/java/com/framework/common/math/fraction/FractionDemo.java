package com.framework.common.math.fraction;

import java.io.IOException;

public class FractionDemo {
	private int numerator;
	private int denominator;

	public FractionDemo(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public FractionDemo(int numerator) {
		this(numerator, 1);
	}

	public static FractionDemo add(FractionDemo f1, FractionDemo f2) {
		FractionDemo[] fs = RCD(f1, f2);
		FractionDemo add = new FractionDemo(fs[0].numerator + fs[1].numerator,
				fs[0].denominator);
		return simpler(add);
	}

	public static FractionDemo minus(FractionDemo f1, FractionDemo f2) {
		FractionDemo[] fs = RCD(f1, f2);
		FractionDemo minus = new FractionDemo(fs[0].numerator - fs[1].numerator,
				fs[0].denominator);
		return simpler(minus);
	}

	public static FractionDemo multi(FractionDemo f1, FractionDemo f2) {
		FractionDemo multi = new FractionDemo(f1.numerator * f2.numerator,
				f1.denominator * f2.denominator);
		return simpler(multi);
	}

	public static FractionDemo div(FractionDemo f1, FractionDemo f2) {
		return multi(f1, new FractionDemo(f2.denominator, f2.numerator));
	}

	public static void input(String s) {
		String[] ss = s.split(" ");
		if (ss.length == 1) {
			FractionDemo f = StringToFraction(ss[0]);
			if (f == null)
				output("Usage: Should input a numeric");
			else
				output(f);
		} else if (ss.length == 3) {
			FractionDemo f1 = StringToFraction(ss[0]);
			FractionDemo f2 = StringToFraction(ss[2]);
			if (f1 == null) {
				output("Usage: The first input should be numeric/numeric");
				return;
			}
			if (f2 == null) {
				output("Usage: The third input should be numeric/numeric");
				return;
			}
			switch (ss[1].charAt(0)) {
			case '+':
				output(add(f1, f2));
				break;
			case '-':
				output(minus(f1, f2));
				break;
			case '*':
				output(multi(f1, f2));
				break;
			case '/':
				output(div(f1, f2));
				break;
			default:
				output("Usage: The second input should be one of +-*/");
				break;
			}
		} else
			output("Usage: Should input one fraction or two fractions and a operator with the style 'f1 + f2'");
	}

	public static void output(FractionDemo f) {
		if (f.denominator == 1) {
			System.out.println(f.numerator);
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(f.numerator);
		sb.append('/');
		sb.append(f.denominator);
		System.out.println(sb.toString());
	}

	public static void output(String s) {
		System.out.println(s);
	}

	private static FractionDemo StringToFraction(String s) {
		String[] ss = s.split("/");
		try {
			if (ss.length == 2)
				return simpler(new FractionDemo(Integer.valueOf(ss[0]),
						Integer.valueOf(ss[1])));
			else if (ss.length == 1)
				return new FractionDemo(Integer.valueOf(ss[0]));
			else
				return null;
		} catch (NumberFormatException e) {
			output("Usage: Should input one fraction or two fractions and a operator with the style 'f1 + f2'");
		}
		return null;
	}

	/**
	 * both the numerator and denominator are divided by GCD
	 */
	private static FractionDemo simpler(FractionDemo f) {
		int gcd = GCD(f.numerator, f.denominator);
		if (gcd > 1)
			return new FractionDemo(f.numerator / gcd, f.denominator / gcd);
		else
			return f;
	}

	/**
	 * reduction to common denominator
	 */
	private static FractionDemo[] RCD(FractionDemo f1, FractionDemo f2) {
		int lcm = LCM(f1.denominator, f2.denominator);
		int m = lcm / f1.denominator;
		if (m > 1)
			f1 = new FractionDemo(f1.numerator * m, f1.denominator * m);
		m = lcm / f2.denominator;
		if (m > 1)
			f2 = new FractionDemo(f2.numerator * m, f2.denominator * m);
		return new FractionDemo[] { f1, f2 };
	}

	/**
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
	 * a lowest common multiple
	 */
	private static int LCM(int a, int b) {
		return a * b / GCD(a, b);
	}

	public static void main(String[] args) throws IOException {
		int c;
		StringBuilder sb = new StringBuilder();
		while ((c = System.in.read()) != '\n')
			sb.append((char) c);
		input(sb.toString());
	}
}
