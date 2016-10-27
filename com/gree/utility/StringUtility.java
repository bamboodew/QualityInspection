package com.gree.utility;

/**
 * 字符串工具类
 * 
 * @author Administrator
 *
 */
public class StringUtility {

	/**
	 * 判断是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		// 字符串为空或者是空串trailing whitespace removed 去掉字符串的前后空格
		if (str == null || "".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isNotEmpty(String str){
		if(str !=null && !"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
}
