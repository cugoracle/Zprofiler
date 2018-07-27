/**
 * Project Name:Zprofiler
 * File Name:FlowMsgFormat.java
 * Package Name:com.zprofiler.utils
 * Date:2018��7��19������3:53:12
 * Copyright (c) 2018, 359736592@qq.com All Rights Reserved.
 *
*/

package com.zprofiler.utils;

/**
 * ClassName:FlowMsgFormat <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018��7��19�� ����3:53:12 <br/>
 * 
 * @author zenghao
 * @version 1.0.0
 * @since JDK 1.8
 * @see
 */
public class FlowMsgFormat implements MsgFormat {

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.zprofiler.utils.MsgFormat#writeMsgFormatForStack(java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String writeMsgFormatForStack(String timeStamp, String threadId, String state, String methodName) {
		String infos = timeStamp + ":" + threadId + ":        18888   work(9527):      " + state + methodName + "\n";
		return infos;
	}

	public static void main(String[] args) {
		FlowMsgFormat fm = new FlowMsgFormat();
		System.out.println(fm.writeMsgFormatForStack("15742345732", "1", "->", "Object.WriteMsgsFormat"));
	}
}
