package cn.com.zx.travelcompanion.bean;

import java.text.NumberFormat;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberFormat num = NumberFormat.getPercentInstance(); 
		num.setMaximumIntegerDigits(3); 
		num.setMaximumFractionDigits(2); 
		double csdn = 0.6777777; 
		System.out.println(num.format(csdn));
	}

}
