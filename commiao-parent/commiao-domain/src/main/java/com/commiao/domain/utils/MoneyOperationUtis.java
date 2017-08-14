package com.commiao.domain.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 计算各类金融类的金钱工具类
 * @author zhengjinping
 * 2016-3-9 上午11:08:03
 *
 */
public class MoneyOperationUtis {

	/**
	 * 按月计算等额本息还款法中，每月应还本息总额
	 * 采用“四舍五入”的算法
	 * 
	 * @param months
	 *            月数
	 * @param amount
	 *            借款额
	 * @param annualInterestRate
	 *            年化利率
	 * @return
	 */
	public static BigDecimal averageCapitalPlusInterest(int months,
			BigDecimal amount, BigDecimal annualInterestRate) {

		BigDecimal monthlyInterest = BigDecimalUtils.getOneTwelfth(annualInterestRate);

		BigInteger INTEGER_ZERO = BigInteger.ZERO;
		// 每个变量都设为4位小数，初始值为0.0000
		BigDecimal step1 = new BigDecimal(INTEGER_ZERO, 4);
		BigDecimal step2 = new BigDecimal(INTEGER_ZERO, 4);
		BigDecimal step3 = new BigDecimal(INTEGER_ZERO, 4);
		BigDecimal step4 = new BigDecimal(INTEGER_ZERO, 4);

		step1 = amount.multiply(monthlyInterest);
		step2 = (monthlyInterest.add(BigDecimal.ONE)).pow(months);
		step3 = step1.multiply(step2);

		step4 = ((monthlyInterest.add(BigDecimal.ONE)).pow(months)).subtract(BigDecimal.ONE);

		return step3.divide(step4, 2, BigDecimal.ROUND_HALF_UP);
	}
	
	public static void main(String[] args) {
		BigDecimal monthlyRepay = averageCapitalPlusInterest(2, BigDecimal.valueOf(200l),BigDecimal.valueOf(0.2d));
		BigDecimal totalMoney = monthlyRepay.multiply(BigDecimal.valueOf(2));
		System.out.println("每个月应收的钱："+monthlyRepay.doubleValue());
		System.out.println("应收的总钱："+totalMoney.doubleValue());
	}
}
