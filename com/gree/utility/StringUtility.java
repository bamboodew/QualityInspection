package com.gree.utility;

/**
 * �ַ���������
 * 
 * @author Administrator
 *
 */
public class StringUtility {

	/**
	 * �ж��Ƿ�Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		// �ַ���Ϊ�ջ����ǿմ�trailing whitespace removed ȥ���ַ�����ǰ��ո�
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
