package cn.ou.Util;

public class WebUtils {
	private WebUtils(){}
	
	/**
	 * �ж��ַ����Ƿ�Ϊ�գ�null ���� ""��
	 * @param str
	 * @return true:��ʾ�ַ���Ϊ��
	 */
	public static boolean isNull(String str){
		boolean res = str == null || "".equals(str);
		return res;
	}
	
	

}
