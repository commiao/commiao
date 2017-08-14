package com.framework.common.math;

import java.math.BigDecimal;
import java.util.HashMap;

public class MathHelper {
	/**
	 * 计算入口
	 * @param args
	 * @param map
	 * @return
	 */
	public String getResult(String args,HashMap<String ,String> map){
		args = removeBrackets(args);
		return startCalculate(args,map).replace("$", "");
	}
	/**
	 * 将字符串中的"{}"、"[]"替换成"()"
	 * @param args
	 * @return
	 */
	public String removeBrackets(String args){
		if (args.equals("")) {
			return "0"; 
		}
		int has = args.indexOf("["); 
		int have = args.indexOf("{"); 
		if(has!=-1||have!=-1){ 
			args = args.replaceAll("[\\[\\{]", "(").replaceAll("[\\]\\}]", ")");//将字符串中的"{}"、"[]"替换成"()"
		} 
		return args;
	}
	/**
	 * 迭代的方式将所有括号内的部分算完后
	 * @param args
	 * @param map
	 * @return
	 */
	private String startCalculate(String args,HashMap<String ,String> map){
		int end  = args.indexOf(")");
		if(end !=-1){
			int start = args.substring(0, end).lastIndexOf("(");
			String retultTemp = calculate(args.substring(start+1,end),map);
			String str = args.substring(0, start) +retultTemp +args.substring(end+1);
			return startCalculate(str,map);
		}else{
			return calculate(args,map);
		}
		
	}
	/**
	 * 算乘除
	 * @param args
	 * @param map
	 * @return
	 */
	private String calculate(String args,HashMap<String ,String> map){
		int ml = args.indexOf('*'); 
		int dl = args.indexOf('/'); 
		if (ml == -1 && dl == -1) { 
			return nomalCalculate(args,map); 
		} 
		int index = ml == -1 ? dl : ml; 
		String operatorStr = ml == -1 ? "/" : "*";
		String leftParm = leftParm(args,index);
		String rightParm = rightParm(args,index);
		String result = "0";
		String leftParmVal = leftParm;
		String rightParmVal = rightParm;
		if(leftParm.indexOf("$")!=-1){
			leftParmVal = leftParmVal.substring(1,leftParmVal.length()-1);
		}else{
			leftParmVal = map.get(leftParm);
		}
		if(rightParm.indexOf("$")!=-1){
			rightParmVal = rightParmVal.substring(1,rightParmVal.length()-1);
		}else{
			rightParmVal = map.get(rightParm);
		}
		leftParmVal = leftParmVal.replace("#", "-");//在计算之前再将"#"还原成负号；
		rightParmVal = rightParmVal.replace("#", "-");//在计算之前再将"#"还原成负号；
		if("/".equals(operatorStr)){
			result = div(leftParmVal,rightParmVal,2);
		}else{
			result = mul(leftParmVal,rightParmVal);
		}
		result = result.replace("-", "#");//将计算结果的"负号"先用"#"顶替，以免与减号相混；在计算之前再将"#"还原成负号；
		args = args.replace(leftParm+operatorStr+rightParm, "$"+result+"$");
		return calculate(args,map);
	}
	/**
	 * 算加减
	 * @param args
	 * @param map
	 * @return
	 */
	private String nomalCalculate(String args,HashMap<String ,String> map){
		int ml = args.indexOf('+'); 
		int dl = args.indexOf('-'); 
		if (ml == -1 && dl == -1) { 
			return args; 
		} 
		int index = ml == -1 ? dl : ml; 
		String operatorStr = ml == -1 ? "-" : "+";
		String leftParm = leftParm(args,index);
		String rightParm = rightParm(args,index);
		String result = "0";
		String leftParmVal = leftParm;
		String rightParmVal = rightParm;
		if(leftParm.indexOf("$")!=-1){
			leftParmVal = leftParmVal.substring(1,leftParmVal.length()-1);
		}else{
			leftParmVal = map.get(leftParm);
		}
		if(rightParm.indexOf("$")!=-1){
			rightParmVal = rightParmVal.substring(1,rightParmVal.length()-1);
		}else{
			rightParmVal = map.get(rightParm);
		}
		leftParmVal = leftParmVal.replace("#", "-");//在计算之前再将"#"还原成负号；
		rightParmVal = rightParmVal.replace("#", "-");//在计算之前再将"#"还原成负号；
		if("-".equals(operatorStr)){
			result = sub(leftParmVal,rightParmVal);
		}else{
			result = add(leftParmVal,rightParmVal);
		}
		result = result.replace("-", "#");//将计算结果的"负号"先用"#"顶替，以免与减号相混；在计算之前再将"#"还原成负号；
		args = args.replace(leftParm+operatorStr+rightParm, "$"+result+"$");
		return calculate(args,map);
	}
	/**
	 * 获取符号左边的参数
	 * @param args
	 * @param index
	 * @return
	 */
	private String leftParm(String args,int index){
		int ml = args.lastIndexOf('+', index); 
		int dl = args.lastIndexOf('-', index);
		if (ml == -1 && dl == -1) { 
			return args.substring(0,index);
		}
		int leftIndex = ml == -1 ? dl : ml;
		if(leftIndex == index){
			return args.substring(0,index);
		}else{
			return args.substring(leftIndex+1,index);
		}
		
	}
	/**
	 * 获取符号有边的参数
	 * @param args
	 * @param index
	 * @return
	 */
	private String rightParm(String args,int index){
		int ml = args.indexOf('+', index); 
		int dl = args.indexOf('-', index);
		int al = args.indexOf('*', index); 
		int bl = args.indexOf('/', index);
		if (ml == -1 && dl == -1 && al == -1 && bl == -1) { 
			return args.substring(index+1);
		}
		int rightEnd = 1000;
		if(ml>-1 && ml<rightEnd && ml>index){
			rightEnd = ml;
		}
		if(dl>-1 && dl<rightEnd && dl>index){
			rightEnd = dl;
		}		
		if(al>-1 && al<rightEnd && al>index){
			rightEnd = al;
		}		
		if(bl>-1 && bl<rightEnd && bl>index){
			rightEnd = bl;
		}
		if(rightEnd == 1000){
			rightEnd = index;
		}
		if(rightEnd == index){
			return args.substring(rightEnd+1);
		}else{
			return args.substring(index+1,rightEnd);
		}
		
	}
	
	/** 
	 * 将Null转为Zero 
     * param:String 
     * @return "0" 
     */ 
    private String null2zero(String str) 
    { 
        if (str == null || "".equals(str)) 
        { 
            str = "0"; 
        } 
        return str; 
    } 

    /** 
     * 精确的加法运算 
     * @param v1 被加 
     * @param v2 加数 
     * @return 两个参数的和 
     */ 
    public String add(String v1, String v2) 
    { 
        v1 = null2zero(v1); 
        v2 = null2zero(v2); 
        BigDecimal b1 = new BigDecimal(v1); 
        BigDecimal b2 = new BigDecimal(v2); 
        return b1.add(b2).toString(); 
    } 

    /** 
     * 精确的减法运算 
     * @param v1 被减 
     * @param v2 减数 
     * @return 两个参数的差 
     */ 
    public String sub(String v1, String v2) 
    { 
        v1 = null2zero(v1); 
        v2 = null2zero(v2); 
        BigDecimal b1 = new BigDecimal(v1); 
        BigDecimal b2 = new BigDecimal(v2); 
        return b1.subtract(b2).toString(); 
    } 
    /** 
     * 精确的乘法运算 
     * @param v1 被乘 
     * @param v2 乘数 
     * @return 两个参数的积 
     */ 
    public String mul(String v1, String v2) 
    { 
        v1 = null2zero(v1); 
        v2 = null2zero(v2); 
        BigDecimal b1 = new BigDecimal(v1); 
        BigDecimal b2 = new BigDecimal(v2); 
        return b1.multiply(b2).toString(); 
    } 


    /** 
     * 提供（相对）精确的除法运算 当发生除不尽的情况时，由scale参数 
     * 定精度，以后的数字四舍五入 
     * @param v1 被除 
     * @param v2 除数 
     * @param scale 表示表示 精确到小数点以后几位 
     * @return 两个参数的商 
     */ 
    public String div(String v1, String v2, int scale){ 
        if (scale < 0){ 
            throw new IllegalArgumentException("scale必须是零或正整数");
        } 
        v1 = null2zero(v1); 
        v2 = null2zero(v2); 
        if ("0".equals(v2)||"0.00".equals(v2)){ 
            return "0"; 
        }else{ 
            BigDecimal b1 = new BigDecimal(v1); 
            BigDecimal b2 = new BigDecimal(v2); 
            return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).toString(); 
        } 
    } 

	public static void main(String[] args) {
		long starTime=System.currentTimeMillis();
		HashMap<String ,String> map = new HashMap<String ,String>();
		BigDecimal a = new BigDecimal(1.21);
		BigDecimal b = new BigDecimal(2.32);
		BigDecimal c = new BigDecimal(3.43);
		BigDecimal d = new BigDecimal(4.55);
		BigDecimal e = new BigDecimal(5.67);
		BigDecimal f = new BigDecimal(6.79);
		BigDecimal g = new BigDecimal(7.86);
		BigDecimal h = new BigDecimal(8.92);
		BigDecimal i = new BigDecimal(9.15);
		BigDecimal j = new BigDecimal(10.20);
		
		
		MathHelper tu = new MathHelper();
		BigDecimal temp = null;
		for(int m=0;m<10000;m++){
			temp = new BigDecimal(m);
			map.clear();
			map.put("a", a.add(temp).toString());
			map.put("b", b.add(temp).toString());
			map.put("c", c.add(temp).toString());
			map.put("d", d.add(temp).toString());
			map.put("e", e.add(temp).toString());
			map.put("f", f.add(temp).toString());
			map.put("g", g.add(temp).toString());
			map.put("h", h.add(temp).toString());
			map.put("i", i.add(temp).toString());
			map.put("j", j.add(temp).toString());
			String args1 = "(j*h+(a-b*(c+d*i)/(e/g-f)))/$10$";
			System.out.println(m+":"+tu.getResult(args1,map));
		}
		long endTime=System.currentTimeMillis();
		Long time=endTime-starTime;
		System.out.println(time);
	}

}
