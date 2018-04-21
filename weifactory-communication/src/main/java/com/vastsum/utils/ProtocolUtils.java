package com.vastsum.utils;

import java.io.IOException;


/**
 * 处理协议相关的工具
 * @author Mike
 *
 */
public class ProtocolUtils{
	public static String getCommandNumber(String name) throws IOException {
		return ResourceProperty.getProperty(name);
	}
}