/**
 * Project Name:Zprofiler
 * File Name:MsgFormat.java
 * Package Name:com.zprofiler.utils
 * Date:2018��7��19������3:24:34
 * Copyright (c) 2018, 359736592@qq.com All Rights Reserved.
 *
*/

package com.zprofiler.utils;
/**
 * ClassName:MsgFormat <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018��7��19�� ����3:24:34 <br/>
 * @author   zenghao
 * @version  1.0.0
 * @since    JDK 1.8
 * @see 	 
 */
public abstract interface MsgFormat {
	/**   
	 * @Title: WriteMsgFormat   
	 * @Description: ����д�ļ����ݸ�ʽת���ɱ�׼�����ʽ   
	 * @param: @param info ԭʼ�����ַ���
	 * @param: @return      
	 * @return: String   ���ر�׼���ݸ�ʽ���ַ���   
	 * @throws   
	 */
	public abstract String writeMsgFormatForStack(String timeStamp,String threadId,String state,String methodName);
	
}