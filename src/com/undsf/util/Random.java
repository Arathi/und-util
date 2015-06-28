package com.undsf.util;

/**
 * 扩展随机数类
 * @author Arathi
 *
 */
public class Random extends java.util.Random {
	
	/**
	 * 获取介于min和max之间的随机整数
	 * @param min
	 * @param max
	 * @return
	 */
	public int nextInt(int min, int max) {
		if (min==max || min==max-1) return min;
		if (min>max){
			int t = min;
			min = max;
			max = t;
		}
		int delta = max - min;
		int randomInt = min + nextInt(delta);
		return randomInt;
	}
	
	/**
	 * 获取介于min和max之间的随机浮点数
	 * @param min
	 * @param max
	 * @return
	 */
	public double nextDouble(double min, double max) {
		if (min==max) return min;
		if (min>max){
			double t = min;
			min = max;
			max = t;
		}
		double delta = max - min;
		double randomDouble = min + delta*nextDouble();
		return randomDouble;
	}

}
